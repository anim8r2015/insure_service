// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.policy;

import java.math.BigDecimal;

public class UwResponse
{
    private BigDecimal transCode;
    private String message;
    private String status;
    private String polPolicyNo;
    private String transmittalNo;
    private String errorMsg;
    private String reportFile;
    private BigDecimal premium;
    
    public UwResponse() {
    }
    
    public UwResponse(final BigDecimal transCode, final String message, final String status, final String polPolicyNo, final String transmittalNo, final String errorMsg, final String reportFile, final BigDecimal premium) {
        this.transCode = transCode;
        this.message = message;
        this.status = status;
        this.polPolicyNo = polPolicyNo;
        this.transmittalNo = transmittalNo;
        this.errorMsg = errorMsg;
        this.reportFile = reportFile;
        this.premium = premium;
    }
    
    public String getReportFile() {
        return this.reportFile;
    }
    
    public void setReportFile(final String reportFile) {
        this.reportFile = reportFile;
    }
    
    public BigDecimal getTransCode() {
        return this.transCode;
    }
    
    public void setTransCode(final BigDecimal transCode) {
        this.transCode = transCode;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(final String status) {
        this.status = status;
    }
    
    public String getPolPolicyNo() {
        return this.polPolicyNo;
    }
    
    public void setPolPolicyNo(final String polPolicyNo) {
        this.polPolicyNo = polPolicyNo;
    }
    
    public String getTransmittalNo() {
        return this.transmittalNo;
    }
    
    public void setTransmittalNo(final String transmittalNo) {
        this.transmittalNo = transmittalNo;
    }
    
    public String getErrorMsg() {
        return this.errorMsg;
    }
    
    public void setErrorMsg(final String errorMsg) {
        this.errorMsg = errorMsg;
    }
    
    public BigDecimal getPremium() {
        return this.premium;
    }
    
    public void setPremium(final BigDecimal premium) {
        this.premium = premium;
    }
}
