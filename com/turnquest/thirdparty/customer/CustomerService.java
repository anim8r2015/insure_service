// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.customer;

import com.turnquest.thirdparty.customer.models.DefaultedFacilityStatusCheck;
import com.turnquest.thirdparty.customer.models.DefaultedFacilityPaymentInfo;
import com.turnquest.thirdparty.customer.models.DefaultedFacility;
import java.sql.Date;
import com.turnquest.thirdparty.customer.models.ClearedFacility;
import com.turnquest.thirdparty.customer.models.Disbursement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.commons.dbutils.DbUtils;
import com.turnquest.thirdparty.utils.BeanUtil;
import org.springframework.jdbc.core.JdbcTemplate;
import com.turnquest.thirdparty.setups.GlobalCC;
import com.turnquest.thirdparty.customer.models.Message;
import java.util.concurrent.CompletableFuture;
import com.turnquest.thirdparty.customer.models.CustomerModel;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class CustomerService
{
    final Logger log;
    private final String UPDATE_CUSTOMER_INFO = "begin  tq_gis.global_api_pkg.update_bloom_dtls(?,?,?,?,?,?,?,?,?,?,?,?); end;";
    
    public CustomerService() {
        this.log = LoggerFactory.getLogger((Class)CustomerService.class);
        this.UPDATE_CUSTOMER_INFO = "begin  tq_gis.global_api_pkg.update_bloom_dtls(?,?,?,?,?,?,?,?,?,?,?,?); end;";
    }
    
    public CompletableFuture<Message> customerOptIn(final CustomerModel customerModel) {
        Connection conn = null;
        CallableStatement stmt = null;
        final Message message = new Message();
        final String query = "begin  tq_gis.global_api_pkg.store_bloom_interface_notfns(?,?,?,?,?,?); end;";
        if (!GlobalCC.isValidEmailAddress(customerModel.getEmail())) {
            message.setMessage("provide valid email");
            return CompletableFuture.completedFuture(message);
        }
        if (GlobalCC.isEmpty((Object)customerModel.getClientName())) {
            message.setMessage("provide  client name");
            return CompletableFuture.completedFuture(message);
        }
        if (GlobalCC.isEmpty((Object)customerModel.getMobileNo())) {
            message.setMessage("provide mobile number");
            return CompletableFuture.completedFuture(message);
        }
        if (GlobalCC.isEmpty((Object)customerModel.getCarRegNo())) {
            message.setMessage("provide car registration number");
            return CompletableFuture.completedFuture(message);
        }
        try {
            final JdbcTemplate jdbcTemplate = (JdbcTemplate)BeanUtil.getBean((Class)JdbcTemplate.class);
            conn = jdbcTemplate.getDataSource().getConnection();
            stmt = conn.prepareCall(query);
            stmt.setString(1, customerModel.getCarRegNo());
            stmt.setString(2, customerModel.getCustomerIdNo());
            stmt.setString(3, customerModel.getEmail());
            stmt.setString(4, customerModel.getMobileNo());
            stmt.setDouble(5, customerModel.getCarValue());
            stmt.setString(6, customerModel.getClientName());
            stmt.execute();
            message.setMessage("success");
        }
        catch (Exception ex) {
            this.log.error(ex.getLocalizedMessage(), (Throwable)ex);
            message.setMessage("fail" + ex.getMessage());
        }
        finally {
            DbUtils.closeQuietly(conn, (Statement)stmt, (ResultSet)null);
        }
        return CompletableFuture.completedFuture(message);
    }
    
    public CompletableFuture<Disbursement> disbursement(final Disbursement disbursement) {
        Connection conn = null;
        CallableStatement stmt = null;
        try {
            final JdbcTemplate jdbcTemplate = (JdbcTemplate)BeanUtil.getBean((Class)JdbcTemplate.class);
            conn = jdbcTemplate.getDataSource().getConnection();
            stmt = conn.prepareCall("begin  tq_gis.global_api_pkg.update_bloom_dtls(?,?,?,?,?,?,?,?,?,?,?,?); end;");
            stmt.setString(1, disbursement.getBarCode());
            stmt.setString(2, disbursement.getCarRegNo());
            stmt.setString(3, null);
            stmt.setString(4, disbursement.getEmail());
            stmt.setString(5, null);
            stmt.setString(6, disbursement.getMobileNo());
            stmt.setString(7, disbursement.getMPesaRef());
            stmt.setDouble(8, disbursement.getPaymentAmount());
            stmt.setString(9, "D");
            stmt.setString(10, null);
            stmt.setString(11, null);
            stmt.registerOutParameter(12, 12);
            stmt.execute();
            disbursement.setMessage(stmt.getString(12));
        }
        catch (Exception ex) {
            this.log.error(ex.getLocalizedMessage(), (Throwable)ex);
            disbursement.setMessage(ex.getMessage());
        }
        finally {
            DbUtils.closeQuietly(conn, (Statement)stmt, (ResultSet)null);
        }
        return CompletableFuture.completedFuture(disbursement);
    }
    
    public CompletableFuture<ClearedFacility> saveClearedFacility(final ClearedFacility clearedFacility) {
        Connection conn = null;
        CallableStatement stmt = null;
        try {
            final JdbcTemplate jdbcTemplate = (JdbcTemplate)BeanUtil.getBean((Class)JdbcTemplate.class);
            conn = jdbcTemplate.getDataSource().getConnection();
            stmt = conn.prepareCall("begin  tq_gis.global_api_pkg.update_bloom_dtls(?,?,?,?,?,?,?,?,?,?,?,?); end;");
            stmt.setString(1, clearedFacility.getBarCode());
            stmt.setString(2, clearedFacility.getCarRegNo());
            stmt.setDate(3, Date.valueOf(clearedFacility.getDateCleared()));
            stmt.setString(4, clearedFacility.getEmail());
            stmt.setString(5, null);
            stmt.setString(6, clearedFacility.getMobileNo());
            stmt.setString(7, null);
            stmt.setDouble(8, 0.0);
            stmt.setString(9, "C");
            stmt.setString(10, null);
            stmt.setString(11, null);
            stmt.registerOutParameter(12, 12);
            stmt.execute();
            clearedFacility.setMessage(stmt.getString(12));
        }
        catch (Exception ex) {
            this.log.error(ex.getLocalizedMessage(), (Throwable)ex);
            clearedFacility.setMessage(ex.getMessage());
        }
        finally {
            DbUtils.closeQuietly(conn, (Statement)stmt, (ResultSet)null);
        }
        return CompletableFuture.completedFuture(clearedFacility);
    }
    
    public CompletableFuture<DefaultedFacility> saveDefaultedFacility(final DefaultedFacility defaultedFacility) {
        Connection conn = null;
        CallableStatement stmt = null;
        try {
            final JdbcTemplate jdbcTemplate = (JdbcTemplate)BeanUtil.getBean((Class)JdbcTemplate.class);
            conn = jdbcTemplate.getDataSource().getConnection();
            stmt = conn.prepareCall("begin  tq_gis.global_api_pkg.update_bloom_dtls(?,?,?,?,?,?,?,?,?,?,?,?); end;");
            stmt.setString(1, defaultedFacility.getBarCode());
            stmt.setString(2, defaultedFacility.getCarRegNo());
            stmt.setDate(3, Date.valueOf(defaultedFacility.getDefaultedDate()));
            stmt.setString(4, defaultedFacility.getEmail());
            stmt.setString(5, null);
            stmt.setString(6, defaultedFacility.getMobileNo());
            stmt.setString(7, null);
            stmt.setDouble(8, 0.0);
            stmt.setString(9, "F");
            stmt.setDouble(10, defaultedFacility.getDefaultedAmount());
            stmt.setString(11, null);
            stmt.registerOutParameter(12, 12);
            stmt.execute();
            defaultedFacility.setMessage(stmt.getString(12));
        }
        catch (Exception ex) {
            this.log.error(ex.getLocalizedMessage(), (Throwable)ex);
            defaultedFacility.setMessage(ex.getMessage());
        }
        finally {
            DbUtils.closeQuietly(conn, (Statement)stmt, (ResultSet)null);
        }
        return CompletableFuture.completedFuture(defaultedFacility);
    }
    
    public CompletableFuture<DefaultedFacilityPaymentInfo> saveDefaultedFacilityPaymentInfo(final DefaultedFacilityPaymentInfo dfp) {
        Connection conn = null;
        CallableStatement stmt = null;
        try {
            final JdbcTemplate jdbcTemplate = (JdbcTemplate)BeanUtil.getBean((Class)JdbcTemplate.class);
            conn = jdbcTemplate.getDataSource().getConnection();
            stmt = conn.prepareCall("begin  tq_gis.global_api_pkg.update_bloom_dtls(?,?,?,?,?,?,?,?,?,?,?,?); end;");
            stmt.setString(1, dfp.getBarcode());
            stmt.setString(2, dfp.getCarRegNo());
            stmt.setDate(3, null);
            stmt.setString(4, dfp.getEmail());
            stmt.setString(5, null);
            stmt.setString(6, dfp.getMobileNo());
            stmt.setString(7, null);
            stmt.setDouble(8, 0.0);
            stmt.setString(9, "DCP");
            stmt.setDouble(10, dfp.getDefaultedAmount());
            stmt.setString(11, null);
            stmt.registerOutParameter(12, 12);
            stmt.execute();
            dfp.setMessage(stmt.getString(12));
        }
        catch (Exception ex) {
            this.log.error(ex.getLocalizedMessage(), (Throwable)ex);
            dfp.setMessage(ex.getMessage());
        }
        finally {
            DbUtils.closeQuietly(conn, (Statement)stmt, (ResultSet)null);
        }
        return CompletableFuture.completedFuture(dfp);
    }
    
    public CompletableFuture<DefaultedFacilityStatusCheck> getDefaultedFacilityStatusCheck(final DefaultedFacilityStatusCheck dfc) {
        Connection conn = null;
        CallableStatement stmt = null;
        try {
            final JdbcTemplate jdbcTemplate = (JdbcTemplate)BeanUtil.getBean((Class)JdbcTemplate.class);
            conn = jdbcTemplate.getDataSource().getConnection();
            stmt = conn.prepareCall("begin  tq_gis.global_api_pkg.update_bloom_dtls(?,?,?,?,?,?,?,?,?,?,?,?); end;");
            stmt.setString(1, dfc.getBarCode());
            stmt.setString(2, dfc.getCarRegNo());
            stmt.setDate(3, null);
            stmt.setString(4, dfc.getEmail());
            stmt.setString(5, null);
            stmt.setString(6, dfc.getMobileNo());
            stmt.setString(7, null);
            stmt.setDouble(8, 0.0);
            stmt.setString(9, "DC");
            stmt.setDouble(10, dfc.getDefaultedAmount());
            stmt.setString(11, dfc.getStatus());
            stmt.registerOutParameter(12, 12);
            stmt.execute();
            dfc.setMessage(stmt.getString(12));
        }
        catch (Exception ex) {
            this.log.error(ex.getLocalizedMessage(), (Throwable)ex);
            dfc.setMessage(ex.getMessage());
        }
        finally {
            DbUtils.closeQuietly(conn, (Statement)stmt, (ResultSet)null);
        }
        return CompletableFuture.completedFuture(dfc);
    }
}
