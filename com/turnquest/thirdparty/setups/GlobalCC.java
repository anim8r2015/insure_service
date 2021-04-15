// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.setups;

import com.turnquest.thirdparty.setups.repos.GisParameterRepository;
import com.turnquest.thirdparty.setups.entities.GisParameter;
import java.text.ParseException;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Calendar;
import java.sql.Timestamp;
import java.sql.CallableStatement;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;
import org.apache.commons.dbutils.DbUtils;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;
import com.turnquest.thirdparty.setups.entities.WebParameter;
import javax.persistence.EntityManager;
import com.turnquest.thirdparty.setups.models.Parameters;
import org.springframework.util.Assert;
import com.turnquest.thirdparty.utils.BeanUtil;
import com.turnquest.thirdparty.setups.repos.ParameterRepository;
import com.turnquest.thirdparty.setups.entities.Parameter;
import java.util.Date;
import java.text.SimpleDateFormat;

public class GlobalCC
{
    public static final Long ORG_CODE;
    public static final String SETUP_TABLE_PREFIX = "gin";
    public static final Long DIRECT_CLIENT;
    
    public static String parseFromDBDate(final Object dateObject) {
        Date date = null;
        String dateString = null;
        if (dateObject == null) {
            return dateString;
        }
        final String somedate = dateObject.toString();
        final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        final SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            date = sdf1.parse(somedate);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        dateString = sdf2.format(date);
        return dateString;
    }
    
    public static String getSysParamValue(final String paramName) {
        final Parameter param = getSysParamValueExt(paramName);
        final String value = param.getValue();
        System.out.println("Param Value: " + value);
        return checkNullValues((Object)param.getValue());
    }
    
    public static Parameter getSysParamValueExt(final String paramName) {
        final ParameterRepository parameterRepository = (ParameterRepository)BeanUtil.getBean((Class)ParameterRepository.class);
        final Parameter param = parameterRepository.getSysParamValueExt(paramName);
        Assert.notNull((Object)param, "Parameter Not Found!");
        return param;
    }
    
    public static Parameters getWebParamValue(final String paramName) {
        final String hql = null;
        final Parameters parameter = new Parameters();
        final EntityManager em = (EntityManager)BeanUtil.getBean((Class)EntityManager.class);
        final WebParameter param = (WebParameter)em.createQuery(hql, (Class)WebParameter.class).setParameter("name", (Object)paramName).getSingleResult();
        Assert.notNull((Object)param, "Parameter Not Found!");
        final String value = param.getValue();
        System.out.println("Param Value: " + value);
        parameter.setParamValue(param.getValue());
        return parameter;
    }
    
    public static String join(final List<String> items, final String delim) {
        final StringBuilder sb = new StringBuilder();
        if (!items.isEmpty()) {
            for (int i = 0; i < items.size(); ++i) {
                sb.append(items.get(i));
                if (items.size() >= 2 && i < items.size() - 1 && delim != null) {
                    sb.append(delim);
                }
            }
        }
        return sb.toString();
    }
    
    public static String parseDate(final Object someDate) {
        Date date = null;
        String dateString = null;
        if (someDate == null) {
            return null;
        }
        final String theDate = (someDate != null) ? someDate.toString() : null;
        final SimpleDateFormat sdf1 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        final SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
        try {
            date = sdf1.parse(theDate);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        dateString = sdf2.format(date);
        return dateString;
    }
    
    public static String parseDate2(final Object someDate) {
        Date date = null;
        String dateString = null;
        if (someDate == null) {
            return null;
        }
        final String theDate = (someDate != null) ? someDate.toString() : null;
        final SimpleDateFormat sdf1 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        final SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            date = sdf1.parse(theDate);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        dateString = sdf2.format(date);
        return dateString;
    }
    
    public static boolean isNumber(final String input) {
        if (input.indexOf(".") > 0) {
            try {
                Double.parseDouble(input);
                return true;
            }
            catch (NumberFormatException nme) {
                return false;
            }
        }
        try {
            Integer.parseInt(input);
            return true;
        }
        catch (Exception ne) {
            return false;
        }
    }
    
    public static java.sql.Date parseSQLDate(final String someDate) {
        Date utilToday = new Date();
        final SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date sqlDate = null;
        try {
            utilToday = sdf1.parse(someDate);
            final long t = utilToday.getTime();
            sqlDate = new java.sql.Date(t);
        }
        catch (Exception e) {
            EXCEPTIONREPORTING((Connection)null, e);
        }
        return sqlDate;
    }
    
    public static boolean binarySetting(final int bin) {
        return bin == 1;
    }
    
    public static Double doubleVal(final Double dbl) {
        return (dbl != null) ? dbl : 0.0;
    }
    
    public static String checkNullValues(final Object objName) {
        String objectValue = null;
        if (objName != null && objName.toString().trim().length() != 0) {
            objectValue = objName.toString().trim();
        }
        return objectValue;
    }
    
    public static String emptyString(final Object objName) {
        if (objName != null) {
            return String.valueOf(objName);
        }
        return "";
    }
    
    public static boolean isEmpty(final Object obj) {
        return (obj == null && obj != "") || String.valueOf(obj).equals("");
    }
    
    public static java.sql.Date extractSQLDate(final String component) {
        System.out.println("Date: " + component);
        Date dateString2 = null;
        if (component == null) {
            return null;
        }
        SimpleDateFormat sdf1;
        if (component.length() > 10) {
            sdf1 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        }
        else if (component.contains("/")) {
            sdf1 = new SimpleDateFormat("dd/MMM/yyyy");
        }
        else {
            sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        }
        try {
            dateString2 = sdf1.parse(component);
        }
        catch (Exception e) {
            EXCEPTIONREPORTING((Connection)null, e);
            e.printStackTrace();
        }
        return new java.sql.Date(dateString2.getTime());
    }
    
    public static String parseYearDate(final Date somedate) {
        String dateString = null;
        final SimpleDateFormat sdf2 = new SimpleDateFormat("ddHHmm");
        try {
            dateString = sdf2.format(somedate);
        }
        catch (Exception e) {
            EXCEPTIONREPORTING((Connection)null, e);
        }
        return dateString;
    }
    
    public static String currentDate() {
        Date sysDateVal = null;
        String systemdate = null;
        final SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            sysDateVal = new Date();
            systemdate = sdf2.format(sysDateVal);
        }
        catch (Exception e) {
            e.printStackTrace();
            EXCEPTIONREPORTING((Connection)null, e);
        }
        return systemdate;
    }
    
    public static BigDecimal checkBDNullValues(final Object objName) {
        BigDecimal objectValue = null;
        if (objName != null) {
            String val = null;
            val = objName.toString().trim();
            if (val.length() > 0) {
                objectValue = new BigDecimal(val);
            }
        }
        return objectValue;
    }
    
    public Date unmarshal(final String v) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        java.sql.Date sqlDate = null;
        try {
            final Date convertedDate = dateFormat.parse(v);
            sqlDate = new java.sql.Date(convertedDate.getTime());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return sqlDate;
    }
    
    public static String decodeUserType(final String usrType) {
        String type = null;
        if (usrType != null) {
            if (usrType.equalsIgnoreCase("U")) {
                type = "user";
            }
            else if (usrType.equalsIgnoreCase("G")) {
                type = "Group";
            }
        }
        return type;
    }
    
    public static String decodeUserStatus(final String usrStatus) {
        String type = null;
        if (usrStatus != null) {
            if (usrStatus.equalsIgnoreCase("A")) {
                type = "Active";
            }
            else {
                type = "InActive";
            }
        }
        return type;
    }
    
    public static String decodeReset(final String reset) {
        String type = null;
        if (reset != null) {
            if (reset.equalsIgnoreCase("N")) {
                type = "No";
            }
            else {
                type = "Yes";
            }
        }
        return type;
    }
    
    public static String decodePaymentFrequency(final String freq) {
        String payFreq = null;
        if (freq != null) {
            if (freq.equalsIgnoreCase("M")) {
                payFreq = "MONTHLY";
            }
            else if (freq.equalsIgnoreCase("Q")) {
                payFreq = "QUARTERLY";
            }
            else if (freq.equalsIgnoreCase("S")) {
                payFreq = "SEMI-ANNUALY";
            }
            else if (freq.equalsIgnoreCase("A")) {
                payFreq = "ANNUALLY";
            }
            else if (freq.equalsIgnoreCase("F")) {
                payFreq = "SINGLE PREMIUM";
            }
            else if (freq.equalsIgnoreCase("CI")) {
                payFreq = "CAPITAL INJECTION";
            }
            else if (freq.equalsIgnoreCase("AM")) {
                payFreq = "AFTER MATURITY";
            }
            else if (freq.equalsIgnoreCase("D")) {
                payFreq = "DAILY";
            }
        }
        return payFreq;
    }
    
    public static String decodePaymentMode(final String mode) {
        String payMode = null;
        if (mode != null) {
            if (mode.equalsIgnoreCase("C")) {
                payMode = "CASH";
            }
            else if (mode.equalsIgnoreCase("Q")) {
                payMode = "CHEQUE";
            }
            else if (mode.equalsIgnoreCase("S")) {
                payMode = "STANDING ORDER";
            }
            else if (mode.equalsIgnoreCase("K")) {
                payMode = "CHECKOFF";
            }
            else if (mode.equalsIgnoreCase("R")) {
                payMode = "STAFF REMITANCE";
            }
            else if (mode.equalsIgnoreCase("DD")) {
                payMode = "DIRECT DEBIT";
            }
        }
        return payMode;
    }
    
    public static String decodePolicyCancelTypes(final String cancelType) {
        String decodedType = null;
        if (cancelType != null) {
            if (cancelType.equalsIgnoreCase("DC")) {
                decodedType = "CHILD DEATH";
            }
            else if (cancelType.equalsIgnoreCase("FG")) {
                decodedType = "FORGERY";
            }
            else if (cancelType.equalsIgnoreCase("CC")) {
                decodedType = "CLIENT CANCELLATION";
            }
            else if (cancelType.equalsIgnoreCase("ED")) {
                decodedType = "ERRONEOUS DEDUCTION";
            }
            else if (cancelType.equalsIgnoreCase("CO")) {
                decodedType = "COOLING OFF PERIOD";
            }
            else if (cancelType.equalsIgnoreCase("PW")) {
                decodedType = "PARTIAL WITHDRAWAL";
            }
        }
        return decodedType;
    }
    
    public static String decodeEndorsementStatuses(final String status) {
        String decodedStatus = null;
        if (status != null) {
            if (status.equalsIgnoreCase("D")) {
                decodedStatus = "Draft";
            }
            else if (status.equalsIgnoreCase("A")) {
                decodedStatus = "Active";
            }
            else if (status.equalsIgnoreCase("E")) {
                decodedStatus = "Endorsed";
            }
            else if (status.equalsIgnoreCase("RN")) {
                decodedStatus = "Renewed";
            }
            else if (status.equalsIgnoreCase("C")) {
                decodedStatus = "Cancelled";
            }
            else if (status.equalsIgnoreCase("T")) {
                decodedStatus = "Contra'd";
            }
        }
        return decodedStatus;
    }
    
    public static String decodeYesNoValues(final String val) {
        String retunVal = null;
        if (val != null) {
            if (val.equalsIgnoreCase("Y")) {
                retunVal = "Yes";
            }
            else if (val.equalsIgnoreCase("N")) {
                retunVal = "No";
            }
        }
        return retunVal;
    }
    
    public static String decodePensionType(final String type) {
        String pensType = null;
        if (type != null) {
            if (type.equalsIgnoreCase("DB")) {
                pensType = "DEFINED BENEFIT";
            }
            else if (type.equalsIgnoreCase("DC")) {
                pensType = "DEFINED CONTRIBUTION";
            }
        }
        return pensType;
    }
    
    public static String decodePensCategory(final String cat) {
        String category = null;
        if (cat != null) {
            if (cat.equalsIgnoreCase("PF")) {
                category = "PROVIDENT FUND";
            }
            else if (cat.equalsIgnoreCase("PE")) {
                category = "PENSION FUND";
            }
        }
        return category;
    }
    
    public static String decodeValues(final String val) {
        String retunVal = null;
        if (val != null) {
            if (val.equalsIgnoreCase("Y")) {
                retunVal = "YES";
            }
            else if (val.equalsIgnoreCase("N")) {
                retunVal = "NO";
            }
            else if (val.equalsIgnoreCase("RV")) {
                retunVal = "REINVESTED";
            }
        }
        return retunVal;
    }
    
    public static java.sql.Date extractDate(final String component) throws Exception {
        Date dateString2 = null;
        final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        if (component != null) {
            dateString2 = sdf1.parse(component.trim());
            return new java.sql.Date(dateString2.getTime());
        }
        return null;
    }
    
    public static String decodeBeneficiary(final String ben) {
        String returnVal = null;
        if (ben != null) {
            if (ben.equalsIgnoreCase("B")) {
                returnVal = "Beneficiary";
            }
            else {
                returnVal = "Contigent Beneficiary";
            }
        }
        return returnVal;
    }
    
    public static String decodePolicyStatuses(final String status) {
        String decodedStatus = null;
        if (status != null) {
            if (status.equalsIgnoreCase("D")) {
                decodedStatus = "Draft";
            }
            else if (status.equalsIgnoreCase("A")) {
                decodedStatus = "Active";
            }
            else if (status.equalsIgnoreCase("L")) {
                decodedStatus = "Lapsed";
            }
            else if (status.equalsIgnoreCase("R")) {
                decodedStatus = "Reinstated";
            }
            else if (status.equalsIgnoreCase("C")) {
                decodedStatus = "Cancelled";
            }
            else if (status.equalsIgnoreCase("J")) {
                decodedStatus = "Rejected/Declined";
            }
        }
        return decodedStatus;
    }
    
    public static String decodeContributionType(final String type) {
        String contribType = null;
        if (type != null) {
            if (type.equalsIgnoreCase("A")) {
                contribType = "AMOUNT";
            }
            else if (type.equalsIgnoreCase("P")) {
                contribType = "PERCENTAGE";
            }
        }
        return contribType;
    }
    
    public static String decodeNssfInclude(final String include) {
        String decodedInclude = null;
        if (include != null) {
            if (include.equalsIgnoreCase("N")) {
                decodedInclude = "NONE";
            }
            else if (include.equalsIgnoreCase("B")) {
                decodedInclude = "BOTH";
            }
            else if (include.equalsIgnoreCase("E")) {
                decodedInclude = "EMPLOYEE";
            }
            else if (include.equalsIgnoreCase("R")) {
                decodedInclude = "EMPLOYER";
            }
        }
        return decodedInclude;
    }
    
    public static String decodeLoadingType(final String type) {
        String loadType = null;
        if (type != null) {
            if (type.equalsIgnoreCase("N")) {
                loadType = "NONE";
            }
            else if (type.equalsIgnoreCase("O")) {
                loadType = "ORDINARY RATES";
            }
            else if (type.equalsIgnoreCase("E")) {
                loadType = "EXTRA MORTALITY";
            }
            else if (type.equalsIgnoreCase("M")) {
                loadType = "PER MILLE";
            }
            else if (type.equalsIgnoreCase("A")) {
                loadType = "AGE";
            }
            else if (type.equalsIgnoreCase("F")) {
                loadType = "PER MILLE(MORTGAGE)";
            }
            else if (type.equalsIgnoreCase("ME")) {
                loadType = "MEDICAL";
            }
        }
        return loadType;
    }
    
    public static String decodeMedicalsStatuses(final String status) {
        String decodedStatus = null;
        if (status != null) {
            if (status.equalsIgnoreCase("E")) {
                decodedStatus = "Excempted";
            }
            else if (status.equalsIgnoreCase("Y")) {
                decodedStatus = "Yes";
            }
            else if (status.equalsIgnoreCase("N")) {
                decodedStatus = "No";
            }
            else if (status.equalsIgnoreCase("C")) {
                decodedStatus = "Cancelled";
            }
        }
        return decodedStatus;
    }
    
    public static String decodeClaimStatus(final String status) {
        String decodedStatus = null;
        if (status != null) {
            if (status.equalsIgnoreCase("P")) {
                decodedStatus = "DRAFT";
            }
            else if (status.equalsIgnoreCase("CN")) {
                decodedStatus = "CLOSED(NO CLAIM)";
            }
            else if (status.equalsIgnoreCase("CS")) {
                decodedStatus = "CLOSED(SETTLED)";
            }
            else if (status.equalsIgnoreCase("OS")) {
                decodedStatus = "OUTSTANDING";
            }
        }
        return decodedStatus;
    }
    
    public static String decodeSex(final String sex) {
        String returnVal = null;
        if (sex != null) {
            if (sex.equalsIgnoreCase("M")) {
                returnVal = "Male";
            }
            else {
                returnVal = "Female";
            }
        }
        return returnVal;
    }
    
    public static String EXCEPTIONREPORTING(Connection conn, final Exception e) {
        if (e != null) {
            e.printStackTrace();
            return e.getMessage();
        }
        DbUtils.closeQuietly(conn);
        conn = null;
        return null;
    }
    
    public static String EXCEPTIONREPORTING(final Exception e) {
        if (e != null) {
            e.printStackTrace();
            return e.getMessage();
        }
        return null;
    }
    
    public static byte[] getBytesFromFile(final File file) {
        byte[] bytes = null;
        FileInputStream is = null;
        try {
            is = new FileInputStream(file);
            final long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large");
            }
            bytes = new byte[(int)length];
            int offset = 0;
            for (int numRead = 0; offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0; offset += numRead) {}
            if (offset < bytes.length) {
                throw new IOException("Could not completely read file " + file.getAbsolutePath());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            if (is != null) {
                try {
                    is.close();
                }
                catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
        finally {
            if (is != null) {
                try {
                    is.close();
                }
                catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
        }
        return bytes;
    }
    
    public static String errorValueNotEntered(final String s) {
        System.err.println("ERROR: " + s);
        return s;
    }
    
    public static String INFORMATIONREPORTING(final String errMessage) {
        System.err.println(errMessage);
        return errMessage;
    }
    
    public static String bool2String(final boolean val) {
        return val ? "true" : "false";
    }
    
    public static String getParameter(final String paramName) {
        final Connection conn = null;
        final CallableStatement stmt = null;
        final String result = null;
        return result;
    }
    
    public static BigDecimal BDZeroValue(final String s) {
        if (s != null && !"".equals(s) && !s.trim().isEmpty() && s.matches("[0-9\\.]+")) {
            return new BigDecimal(s.trim());
        }
        return new BigDecimal("0");
    }
    
    public static BigDecimal BDNullValue(final String s) {
        if (s != null && !"".equals(s) && !s.trim().isEmpty() && s.matches("[0-9\\.]+")) {
            return new BigDecimal(s.trim());
        }
        return null;
    }
    
    public static String timeStampStr(final Timestamp ts) {
        final Date date = new Date();
        date.setTime(ts.getTime());
        final String formattedDate = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss").format(date);
        return formattedDate;
    }
    
    public static int monthsBetween(Date startDate, Date endDate) {
        if (startDate.getTime() > endDate.getTime()) {
            final Date temp = startDate;
            startDate = endDate;
            endDate = temp;
        }
        final Calendar startCalendar = Calendar.getInstance();
        startCalendar.setTime(startDate);
        final Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(endDate);
        final int yearDiff = endCalendar.get(1) - startCalendar.get(1);
        int monthsBetween = endCalendar.get(2) - startCalendar.get(2) + 12 * yearDiff;
        if (endCalendar.get(5) >= startCalendar.get(5)) {
            ++monthsBetween;
        }
        return monthsBetween;
    }
    
    public static LocalDate fromDate(final java.sql.Date date) {
        return (date != null) ? date.toLocalDate() : null;
    }
    
    public static LocalDateTime fromTimestamp(final Timestamp timestamp) {
        return (timestamp != null) ? timestamp.toLocalDateTime() : null;
    }
    
    public static boolean isValidEmailAddress(final String email) {
        boolean result = true;
        try {
            final InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        }
        catch (AddressException ex) {
            result = false;
        }
        return result;
    }
    
    public static boolean isValidDate(final String inDate) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        }
        catch (ParseException pe) {
            return false;
        }
        return true;
    }
    
    public static GisParameter getGisSysParamValueExt(final String paramName) {
        final GisParameterRepository parameterRepository = (GisParameterRepository)BeanUtil.getBean((Class)GisParameterRepository.class);
        final GisParameter param = parameterRepository.getGisSysParamValueExt(paramName);
        Assert.notNull((Object)param, "Parameter Not Found!" + paramName);
        return param;
    }
    
    public static String getGisSysParamValue(final String paramName) {
        final GisParameter param = getGisSysParamValueExt(paramName);
        final String value = param.getValue();
        System.out.println("Param Value: " + value);
        return checkNullValues((Object)param.getValue());
    }
    
    static {
        GlobalCC.ORG_CODE = 2L;
        GlobalCC.DIRECT_CLIENT = 0L;
    }
}
