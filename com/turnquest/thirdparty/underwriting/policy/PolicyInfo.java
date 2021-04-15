// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.policy;

import java.util.List;
import java.math.BigDecimal;

public class PolicyInfo
{
    private BigDecimal transactionCode;
    private BigDecimal policyCode;
    private BigDecimal clientwCode;
    private BigDecimal polBatchNo;
    private String policyNo;
    private String binderPolicyNo;
    private String endorsementNo;
    private String coverFromDate;
    private String coverToDate;
    private String policyDate;
    private String productShortDescription;
    private BigDecimal premiumAmount;
    private BigDecimal fap;
    private BigDecimal transactionLevy;
    private BigDecimal phcf;
    private String branchShortDescription;
    private String agentShortDescription;
    private String currencyShortDescription;
    private String paymentFrequency;
    private String transType;
    private String riskNoteNumber;
    private String transactionRemarks;
    private BigDecimal commissionAmount;
    private BigDecimal otherDuties;
    private BigDecimal withholdingTax;
    private BigDecimal nettPremium;
    private ClientInfo clientInfo;
    private List<RiskInfo> riskInfo;
    private List<Documents> documents;
    
    public BigDecimal getTransactionCode() {
        return this.transactionCode;
    }
    
    public void setTransactionCode(final BigDecimal transactionCode) {
        this.transactionCode = transactionCode;
    }
    
    public BigDecimal getPolicyCode() {
        return this.policyCode;
    }
    
    public void setPolicyCode(final BigDecimal policyCode) {
        this.policyCode = policyCode;
    }
    
    public String getPolicyNo() {
        return this.policyNo;
    }
    
    public void setPolicyNo(final String policyNo) {
        this.policyNo = policyNo;
    }
    
    public String getBinderPolicyNo() {
        return this.binderPolicyNo;
    }
    
    public void setBinderPolicyNo(final String binderPolicyNo) {
        this.binderPolicyNo = binderPolicyNo;
    }
    
    public String getEndorsementNo() {
        return this.endorsementNo;
    }
    
    public void setEndorsementNo(final String endorsementNo) {
        this.endorsementNo = endorsementNo;
    }
    
    public String getCoverFromDate() {
        return this.coverFromDate;
    }
    
    public void setCoverFromDate(final String coverFromDate) {
        this.coverFromDate = coverFromDate;
    }
    
    public String getCoverToDate() {
        return this.coverToDate;
    }
    
    public void setCoverToDate(final String coverToDate) {
        this.coverToDate = coverToDate;
    }
    
    public String getPolicyDate() {
        return this.policyDate;
    }
    
    public void setPolicyDate(final String policyDate) {
        this.policyDate = policyDate;
    }
    
    public String getProductShortDescription() {
        return this.productShortDescription;
    }
    
    public void setProductShortDescription(final String productShortDescription) {
        this.productShortDescription = productShortDescription;
    }
    
    public BigDecimal getPremiumAmount() {
        return this.premiumAmount;
    }
    
    public void setPremiumAmount(final BigDecimal premiumAmount) {
        this.premiumAmount = premiumAmount;
    }
    
    public BigDecimal getFap() {
        return this.fap;
    }
    
    public void setFap(final BigDecimal fap) {
        this.fap = fap;
    }
    
    public BigDecimal getTransactionLevy() {
        return this.transactionLevy;
    }
    
    public void setTransactionLevy(final BigDecimal transactionLevy) {
        this.transactionLevy = transactionLevy;
    }
    
    public BigDecimal getPhcf() {
        return this.phcf;
    }
    
    public void setPhcf(final BigDecimal phcf) {
        this.phcf = phcf;
    }
    
    public String getBranchShortDescription() {
        return this.branchShortDescription;
    }
    
    public void setBranchShortDescription(final String branchShortDescription) {
        this.branchShortDescription = branchShortDescription;
    }
    
    public String getAgentShortDescription() {
        return this.agentShortDescription;
    }
    
    public void setAgentShortDescription(final String agentShortDescription) {
        this.agentShortDescription = agentShortDescription;
    }
    
    public String getCurrencyShortDescription() {
        return this.currencyShortDescription;
    }
    
    public void setCurrencyShortDescription(final String currencyShortDescription) {
        this.currencyShortDescription = currencyShortDescription;
    }
    
    public BigDecimal getPolBatchNo() {
        return this.polBatchNo;
    }
    
    public void setPolBatchNo(final BigDecimal polBatchNo) {
        this.polBatchNo = polBatchNo;
    }
    
    public String getPaymentFrequency() {
        return this.paymentFrequency;
    }
    
    public void setPaymentFrequency(final String paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
    }
    
    public String getTransType() {
        return this.transType;
    }
    
    public void setTransType(final String transType) {
        this.transType = transType;
    }
    
    public ClientInfo getClientInfo() {
        return this.clientInfo;
    }
    
    public void setClientInfo(final ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }
    
    public List<RiskInfo> getRiskInfo() {
        return this.riskInfo;
    }
    
    public void setRiskInfo(final List<RiskInfo> riskInfo) {
        this.riskInfo = riskInfo;
    }
    
    public String getRiskNoteNumber() {
        return this.riskNoteNumber;
    }
    
    public void setRiskNoteNumber(final String riskNoteNumber) {
        this.riskNoteNumber = riskNoteNumber;
    }
    
    public String getTransactionRemarks() {
        return this.transactionRemarks;
    }
    
    public void setTransactionRemarks(final String transactionRemarks) {
        this.transactionRemarks = transactionRemarks;
    }
    
    public BigDecimal getCommissionAmount() {
        return this.commissionAmount;
    }
    
    public void setCommissionAmount(final BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }
    
    public BigDecimal getOtherDuties() {
        return this.otherDuties;
    }
    
    public void setOtherDuties(final BigDecimal otherDuties) {
        this.otherDuties = otherDuties;
    }
    
    public BigDecimal getWithholdingTax() {
        return this.withholdingTax;
    }
    
    public void setWithholdingTax(final BigDecimal withholdingTax) {
        this.withholdingTax = withholdingTax;
    }
    
    public BigDecimal getNettPremium() {
        return this.nettPremium;
    }
    
    public void setNettPremium(final BigDecimal nettPremium) {
        this.nettPremium = nettPremium;
    }
    
    public BigDecimal getClientwCode() {
        return this.clientwCode;
    }
    
    public void setClientwCode(final BigDecimal clientwCode) {
        this.clientwCode = clientwCode;
    }
    
    public List<Documents> getDocuments() {
        return this.documents;
    }
    
    public void setDocuments(final List<Documents> documents) {
        this.documents = documents;
    }
}
