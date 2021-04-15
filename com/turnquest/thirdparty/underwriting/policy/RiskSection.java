// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.policy;

import java.math.BigDecimal;

public class RiskSection
{
    private String shortDescription;
    private BigDecimal limitAmount;
    private String description;
    private BigDecimal pilwCode;
    private BigDecimal riskIpuCode;
    private BigDecimal premRate;
    
    public BigDecimal getPremRate() {
        return this.premRate;
    }
    
    public void setPremRate(final BigDecimal premRate) {
        this.premRate = premRate;
    }
    
    public String getShortDescription() {
        return this.shortDescription;
    }
    
    public void setShortDescription(final String shortDescription) {
        this.shortDescription = shortDescription;
    }
    
    public BigDecimal getLimitAmount() {
        return this.limitAmount;
    }
    
    public void setLimitAmount(final BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public BigDecimal getPilwCode() {
        return this.pilwCode;
    }
    
    public void setPilwCode(final BigDecimal pilwCode) {
        this.pilwCode = pilwCode;
    }
    
    public BigDecimal getRiskIpuCode() {
        return this.riskIpuCode;
    }
    
    public void setRiskIpuCode(final BigDecimal riskIpuCode) {
        this.riskIpuCode = riskIpuCode;
    }
}
