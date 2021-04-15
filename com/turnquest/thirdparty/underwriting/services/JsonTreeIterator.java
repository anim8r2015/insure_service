// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.services;

import org.slf4j.LoggerFactory;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Set;
import java.util.List;
import com.turnquest.thirdparty.underwriting.entities.MasterRiskDtls;
import com.turnquest.thirdparty.setups.GlobalCC;
import com.turnquest.thirdparty.underwriting.entities.UserTabColumn;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import java.util.HashMap;
import com.google.common.base.CaseFormat;
import com.turnquest.thirdparty.underwriting.exceptions.ApiException;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.turnquest.thirdparty.underwriting.repositories.MasterRiskDtlRepository;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.slf4j.Logger;

public class JsonTreeIterator
{
    private static final Logger log;
    private final NamedParameterJdbcTemplate jdbcTemplate;
    @PersistenceContext
    private final BigDecimal ipuId;
    private final MasterRiskDtlRepository masterRiskDtlRepository;
    private final String proCode;
    
    public JsonNode convertJSONToNode(final String json) throws JsonProcessingException, IOException {
        final ObjectMapper mapper = new ObjectMapper();
        final JsonNode jsonNode = mapper.readTree(json);
        return jsonNode;
    }
    
    private void walker(final String nodename, final JsonNode node) {
        final String nameToPrint = (nodename != null) ? nodename : "must_be_root";
        if (node.isObject()) {
            final Iterator<Map.Entry<String, JsonNode>> iterator = (Iterator<Map.Entry<String, JsonNode>>)node.fields();
            final ArrayList<Map.Entry<String, JsonNode>> nodesList = (ArrayList<Map.Entry<String, JsonNode>>)Lists.newArrayList((Iterator)iterator);
            if (nameToPrint.equals("riskAdditionalInfo")) {
                System.out.println("Walk Tree - root>>>riskAdditionalInfo:" + node);
                this.processRiskAdditionalInfo(node);
            }
            else {
                for (final Map.Entry<String, JsonNode> nodEntry : nodesList) {
                    final String name = nodEntry.getKey();
                    final JsonNode newNode = nodEntry.getValue();
                    this.walker(name, newNode);
                }
            }
        }
        else if (node.isArray()) {
            final Iterator<JsonNode> arrayItemsIterator = (Iterator<JsonNode>)node.elements();
            final ArrayList<JsonNode> arrayItemsList = (ArrayList<JsonNode>)Lists.newArrayList((Iterator)arrayItemsIterator);
            if (nameToPrint.equals("riskAdditionalInfo")) {
                this.processRiskAdditionalInfo(node);
            }
            else {
                for (final JsonNode arrayNode : arrayItemsList) {
                    this.walker("array item", arrayNode);
                }
            }
        }
        else if (node.isValueNode()) {}
    }
    
    public void walkTree(final JsonNode root) {
        this.walker(null, root);
    }
    
    private void processRiskAdditionalInfo(final JsonNode node) {
        final String json = "{riskAdditionalInfo:" + node.toString() + "}";
        try {
            final JSONObject jsonObject = new JSONObject(json);
            final Iterator<String> keys = (Iterator<String>)jsonObject.keys();
            while (keys.hasNext()) {
                final String key = keys.next();
                System.out.println("key1:::" + key);
                if (jsonObject.get(key) instanceof JSONArray) {
                    final JSONArray array = (JSONArray)jsonObject.get(key);
                    System.out.println("Alll::" + array);
                    for (int i = 0; i < array.length(); ++i) {
                        final JSONObject object = (JSONObject)array.get(i);
                        System.out.println("Inner Object:::" + object);
                        final Iterator<String> innerKeys = (Iterator<String>)object.keys();
                        while (innerKeys.hasNext()) {
                            final String innerKey = innerKeys.next();
                            System.out.println("innerKey::" + innerKey);
                            this.processRiskKey(object, innerKey, this.proCode);
                        }
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void processRiskKey(final JSONObject json, final String innerKey, final String proCode) {
        final String sql = "SELECT DISTINCT GIN_SCREEN_DST_LEVEL.* \n FROM GIN_SCREEN_DST_LEVEL,GIN_PRODUCTS,GIN_INS_BRK_SETUPS,GIN_SCREENS\n WHERE PRO_UNWR_SCR_CODE=SCREEN_CODE\n AND INS_REF_ID = PRO_SHT_DESC\n  AND DSL_SCREEN_ID=SCREEN_ID\n AND INS_REF_TYPE = 'P'\n AND INS_BRK_ID =5700\n AND PRO_UNWR_SCR_CODE IS NOT NULL\n AND DSL_TABLE_NAME=:tableName\n AND DSL_LEVEL_NO=:levelNo\n AND INS_BRK_REF_ID =:proCode";
        final String sqlCols = "SELECT TABLE_NAME TableName,COLUMN_NAME ColumnName,DATA_TYPE DataType,DATA_LENGTH DataLength,COLUMN_ID ColumnId \nFROM USER_TAB_COLUMNS WHERE TABLE_NAME=:tableName";
        final int index = innerKey.lastIndexOf("_");
        if (index == -1) {
            throw new ApiException("Not able to process Risk details:::" + innerKey);
        }
        final List<String> columnNames = new ArrayList<String>();
        final List<String> columnValues = new ArrayList<String>();
        try {
            final JsonNode node = this.convertJSONToNode(json.toString());
            final JSONObject innerKeyObj = (JSONObject)json.get(innerKey);
            System.out.println("innerKeyObj:" + innerKeyObj);
            final Set<String> keys = (Set<String>)innerKeyObj.keySet();
            for (final String key : keys) {
                System.out.println("Key :: " + key + ", Value :: " + innerKeyObj.get(key));
                if (innerKeyObj.get(key) == null) {
                    continue;
                }
                columnNames.add(key);
                columnValues.add(innerKeyObj.get(key).toString());
            }
        }
        catch (Exception e) {
            JsonTreeIterator.log.error("Reading json:::" + e.getMessage());
        }
        final String levelNo = innerKey.substring(innerKey.length() - 1);
        JsonTreeIterator.log.info("levelNo==" + levelNo);
        final String reqTableName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, innerKey.substring(0, index)).toUpperCase();
        JsonTreeIterator.log.info("reqTableName==" + reqTableName);
        List<Map<String, String>> sch_level = new ArrayList<Map<String, String>>();
        final Map<String, String> dto = new HashMap<String, String>();
        try {
            sch_level = (List<Map<String, String>>)this.jdbcTemplate.query("SELECT DISTINCT GIN_SCREEN_DST_LEVEL.* \n FROM GIN_SCREEN_DST_LEVEL,GIN_PRODUCTS,GIN_INS_BRK_SETUPS,GIN_SCREENS\n WHERE PRO_UNWR_SCR_CODE=SCREEN_CODE\n AND INS_REF_ID = PRO_SHT_DESC\n  AND DSL_SCREEN_ID=SCREEN_ID\n AND INS_REF_TYPE = 'P'\n AND INS_BRK_ID =5700\n AND PRO_UNWR_SCR_CODE IS NOT NULL\n AND DSL_TABLE_NAME=:tableName\n AND DSL_LEVEL_NO=:levelNo\n AND INS_BRK_REF_ID =:proCode", (SqlParameterSource)new MapSqlParameterSource().addValue("tableName", (Object)reqTableName).addValue("levelNo", (Object)levelNo).addValue("proCode", (Object)proCode), (rs, rowNum) -> {
                dto.clear();
                dto.put("tableName", rs.getString(4));
                dto.put("tablePrefix", rs.getString(6));
                dto.put("tableSeq", rs.getString(7));
                return dto;
            });
        }
        catch (Exception e2) {
            JsonTreeIterator.log.error("sch_level:::" + e2.getMessage());
        }
        if (sch_level.size() > 0) {
            String tableName = sch_level.get(0).get("tableName");
            List<UserTabColumn> userTabColumnList = new ArrayList<UserTabColumn>();
            try {
                userTabColumnList = (List<UserTabColumn>)this.jdbcTemplate.query("SELECT TABLE_NAME TableName,COLUMN_NAME ColumnName,DATA_TYPE DataType,DATA_LENGTH DataLength,COLUMN_ID ColumnId \nFROM USER_TAB_COLUMNS WHERE TABLE_NAME=:tableName", (SqlParameterSource)new MapSqlParameterSource().addValue("tableName", (Object)tableName), (rs, rowNum) -> {
                    final UserTabColumn userTabColumn = new UserTabColumn();
                    userTabColumn.setColumnId(rs.getBigDecimal("ColumnId"));
                    userTabColumn.setColumnName(rs.getString("ColumnName"));
                    userTabColumn.setDataLength(rs.getBigDecimal("DataLength"));
                    userTabColumn.setDataType(rs.getString("DataType"));
                    userTabColumn.setTableName(rs.getString("TableName"));
                    return userTabColumn;
                });
            }
            catch (Exception e3) {
                JsonTreeIterator.log.error("UserTabColumn::" + e3.getMessage());
            }
            final int numberOfColumns = columnNames.size();
            String columnDesc = "";
            String columnValDesc = "";
            String valueQuote = "";
            for (int k = 0; k < numberOfColumns; ++k) {
                final String columnName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, (String)columnNames.get(k)).toUpperCase();
                JsonTreeIterator.log.info("columnName:::" + columnName);
                final String columnNameRaw = columnNames.get(k);
                final Object o;
                final String str;
                final UserTabColumn userCol = userTabColumnList.stream().filter(x -> columnName.equals(x.getColumnName().toUpperCase())).findAny().orElseThrow(() -> {
                    new ApiException("Error Processing schedule", "Attribute provided cannot be identified:" + str);
                    return o;
                });
                final String dataType = userCol.getDataType();
                final BigDecimal dataLength = userCol.getDataLength();
                Object colValProcessed = null;
                final String colValRaw = columnValues.get(k);
                if (dataType.equalsIgnoreCase("DATE")) {
                    valueQuote = "";
                    if (colValRaw.equalsIgnoreCase("null") || colValRaw == null) {
                        colValProcessed = null;
                    }
                    else {
                        if (!GlobalCC.isValidDate(colValRaw)) {
                            throw new ApiException("Date format is incorrect>> " + columnNameRaw);
                        }
                        colValProcessed = "TO_DATE('" + colValRaw + "','YYYY-MM-DD')";
                    }
                    JsonTreeIterator.log.info("Am a date:::" + colValProcessed);
                }
                else if (dataType.equalsIgnoreCase("NUMBER")) {
                    if (colValRaw.equalsIgnoreCase("null") || colValRaw == null) {
                        valueQuote = "";
                        colValProcessed = null;
                    }
                    else {
                        if (!isNumeric(colValRaw)) {
                            throw new ApiException("Value provided must be a NUMBER>> " + columnNameRaw);
                        }
                        valueQuote = "";
                        colValProcessed = colValRaw;
                    }
                }
                else if (dataType.equalsIgnoreCase("VARCHAR2")) {
                    final int valLength = colValRaw.length();
                    if (new BigDecimal(valLength).compareTo(dataLength) == 1) {
                        throw new ApiException("Maximum length permitted is :" + dataLength + ">> " + columnNameRaw);
                    }
                    valueQuote = "'";
                    colValProcessed = columnValues.get(k);
                }
                else {
                    colValProcessed = columnValues.get(k);
                    valueQuote = "'";
                }
                int equivalence = 0;
                equivalence = k + 1;
                if (equivalence == numberOfColumns) {
                    columnDesc += CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, (String)columnNames.get(k));
                    columnValDesc = columnValDesc + valueQuote + colValProcessed + valueQuote;
                }
                else {
                    columnDesc = columnDesc + CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, (String)columnNames.get(k)) + ",";
                    columnValDesc = columnValDesc + valueQuote + colValProcessed + valueQuote + ",";
                }
            }
            tableName = sch_level.get(0).get("tableName");
            final String tablePrefix = sch_level.get(0).get("tablePrefix");
            final String tableSeq = sch_level.get(0).get("tableSeq");
            MasterRiskDtls masterRiskDtls = null;
            masterRiskDtls = this.masterRiskDtlRepository.findByIpuCode(tableName, this.ipuId, columnValDesc);
            if (masterRiskDtls == null) {
                masterRiskDtls = new MasterRiskDtls();
            }
            masterRiskDtls.setIpuId(this.ipuId);
            masterRiskDtls.setTableName(tableName);
            masterRiskDtls.setTablePrefix(tablePrefix);
            masterRiskDtls.setTableSeq(tableSeq);
            masterRiskDtls.setColumnNames(columnDesc.toUpperCase().replaceAll("^\"|\"$", ""));
            masterRiskDtls.setColumnvalues(columnValDesc);
            this.masterRiskDtlRepository.save((Object)masterRiskDtls);
            return;
        }
        throw new ApiException("Process cannot be completed", "Schedule table cannot be determined");
    }
    
    public static boolean isNumeric(final String strNum) {
        try {
            Double.parseDouble(strNum);
        }
        catch (NumberFormatException | NullPointerException ex2) {
            final RuntimeException ex;
            final RuntimeException nfe = ex;
            return false;
        }
        return true;
    }
    
    public JsonTreeIterator(final NamedParameterJdbcTemplate jdbcTemplate, final BigDecimal ipuId, final MasterRiskDtlRepository masterRiskDtlRepository, final String proCode) {
        this.jdbcTemplate = jdbcTemplate;
        this.ipuId = ipuId;
        this.masterRiskDtlRepository = masterRiskDtlRepository;
        this.proCode = proCode;
    }
    
    static {
        log = LoggerFactory.getLogger((Class)JsonTreeIterator.class);
    }
}
