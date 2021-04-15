// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.policy;

public class CertificateResponse
{
    private String message;
    private String riskId;
    private String actualCNo;
    private String transactionNo;
    private String requestNumber;
    private String policyNo;
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    public String getRiskId() {
        return this.riskId;
    }
    
    public void setRiskId(final String riskId) {
        this.riskId = riskId;
    }
    
    public String getActualCNo() {
        return this.actualCNo;
    }
    
    public void setActualCNo(final String actualCNo) {
        this.actualCNo = actualCNo;
    }
    
    public String getTransactionNo() {
        return this.transactionNo;
    }
    
    public void setTransactionNo(final String transactionNo) {
        this.transactionNo = transactionNo;
    }
    
    public String getRequestNumber() {
        return this.requestNumber;
    }
    
    public void setRequestNumber(final String requestNumber) {
        this.requestNumber = requestNumber;
    }
    
    public String getPolicyNo() {
        return this.policyNo;
    }
    
    public void setPolicyNo(final String policyNo) {
        this.policyNo = policyNo;
    }
}
