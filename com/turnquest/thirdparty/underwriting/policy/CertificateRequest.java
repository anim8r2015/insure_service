// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.policy;

import java.math.BigDecimal;

public class CertificateRequest
{
    private String policyNo;
    private String riskId;
    private BigDecimal riskIpuCode;
    private String transmittalNo;
    
    public String getTransmittalNo() {
        return this.transmittalNo;
    }
    
    public void setTransmittalNo(final String transmittalNo) {
        this.transmittalNo = transmittalNo;
    }
    
    public BigDecimal getRiskIpuCode() {
        return this.riskIpuCode;
    }
    
    public void setRiskIpuCode(final BigDecimal riskIpuCode) {
        this.riskIpuCode = riskIpuCode;
    }
    
    public String getPolicyNo() {
        return this.policyNo;
    }
    
    public void setPolicyNo(final String policyNo) {
        this.policyNo = policyNo;
    }
    
    public String getRiskId() {
        return this.riskId;
    }
    
    public void setRiskId(final String riskId) {
        this.riskId = riskId;
    }
}
