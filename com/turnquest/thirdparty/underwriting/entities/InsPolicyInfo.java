// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.entities;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "API_UW_TRANSFER_REC")
public class InsPolicyInfo
{
    @Id
    @Column(name = "UWT_CODE")
    private BigDecimal transactionCode;
    @Column(name = "UWT_BATCH_NO")
    private BigDecimal policyCode;
    @Column(name = "UWT_POLICY_NO")
    private String policyNo;
    @Column(name = "UWT_ENDOS_NO")
    private String endorsementNo;
    @JsonIgnore
    @Column(name = "UWT_AGNT_AGENT_CODE")
    private BigDecimal agnCode;
    @Column(name = "UWT_AGNT_SHT_DESC")
    private String agentShortDescription;
    @Column(name = "UWT_BIND_CODE")
    private BigDecimal bindCode;
    @Column(name = "UWT_WEF_DT")
    private Date coverFromDate;
    @Column(name = "UWT_WET_DT")
    private Date coverToDate;
    @Column(name = "UWT_POL_STATUS")
    private String polStatus;
    @Column(name = "UWT_CUR_CODE")
    private BigDecimal curCode;
    @Column(name = "UWT_BRN_CODE")
    private BigDecimal brnCode;
    @Column(name = "UWT_BRN_SHT_DESC")
    private String branchShortDescription;
    @Column(name = "UWT_CUR_RATE")
    private BigDecimal curRate;
    @Column(name = "UWT_CUR_SYMBOL")
    private String currencyShortDescription;
    @JsonIgnore
    @Column(name = "UWT_PRP_CODE")
    private BigDecimal prpCode;
    @JsonIgnore
    @Column(name = "UWT_PRP_SHT_DESC")
    private String prpShtDesc;
    @JsonIgnore
    @Column(name = "UWT_PRO_CODE")
    private BigDecimal proCode;
    @JsonIgnore
    @Column(name = "UWT_PRO_SHT_DESC")
    private String productShortDescription;
    @Column(name = "UWT_TRANS_TYPE")
    private String transType;
    @JsonIgnore
    @Column(name = "UWT_PREMIUM")
    private BigDecimal premiumAmount;
    @JsonIgnore
    @Column(name = "UWT_FAP")
    private BigDecimal fap;
    @Column(name = "UWT_TL")
    private BigDecimal tl;
    @Column(name = "UWT_PHCF")
    private BigDecimal phcf;
    @Column(name = "UWT_FREQ_OF_PAYMENT")
    private String paymentFrequency;
    @Column(name = "UWT_DONE_BY")
    private String doneBy;
    @Column(name = "UWT_DONE_ON")
    private Date doneOn;
    @Column(name = "UWT_BIND_POLICYNO")
    private String binderPolicyNo;
    @Column(name = "UWT_POLICY_DATE")
    private Date policyDate;
    @Column(name = "UWT_BIND_SHT_DESC")
    private String bindShtDesc;
    @Column(name = "UWT_PROCESS_STATUS")
    private String processStatus;
    @Column(name = "UWT_RETRY_COUNTER")
    private BigDecimal retryCounter;
    
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
    
    public String getEndorsementNo() {
        return this.endorsementNo;
    }
    
    public void setEndorsementNo(final String endorsementNo) {
        this.endorsementNo = endorsementNo;
    }
    
    public BigDecimal getAgnCode() {
        return this.agnCode;
    }
    
    public void setAgnCode(final BigDecimal agnCode) {
        this.agnCode = agnCode;
    }
    
    public String getAgentShortDescription() {
        return this.agentShortDescription;
    }
    
    public void setAgentShortDescription(final String agentShortDescription) {
        this.agentShortDescription = agentShortDescription;
    }
    
    public BigDecimal getBindCode() {
        return this.bindCode;
    }
    
    public void setBindCode(final BigDecimal bindCode) {
        this.bindCode = bindCode;
    }
    
    public Date getCoverFromDate() {
        return this.coverFromDate;
    }
    
    public void setCoverFromDate(final Date coverFromDate) {
        this.coverFromDate = coverFromDate;
    }
    
    public Date getCoverToDate() {
        return this.coverToDate;
    }
    
    public void setCoverToDate(final Date coverToDate) {
        this.coverToDate = coverToDate;
    }
    
    public String getPolStatus() {
        return this.polStatus;
    }
    
    public void setPolStatus(final String polStatus) {
        this.polStatus = polStatus;
    }
    
    public BigDecimal getCurCode() {
        return this.curCode;
    }
    
    public void setCurCode(final BigDecimal curCode) {
        this.curCode = curCode;
    }
    
    public BigDecimal getBrnCode() {
        return this.brnCode;
    }
    
    public void setBrnCode(final BigDecimal brnCode) {
        this.brnCode = brnCode;
    }
    
    public String getBranchShortDescription() {
        return this.branchShortDescription;
    }
    
    public void setBranchShortDescription(final String branchShortDescription) {
        this.branchShortDescription = branchShortDescription;
    }
    
    public BigDecimal getCurRate() {
        return this.curRate;
    }
    
    public void setCurRate(final BigDecimal curRate) {
        this.curRate = curRate;
    }
    
    public String getCurrencyShortDescription() {
        return this.currencyShortDescription;
    }
    
    public void setCurrencyShortDescription(final String currencyShortDescription) {
        this.currencyShortDescription = currencyShortDescription;
    }
    
    public BigDecimal getPrpCode() {
        return this.prpCode;
    }
    
    public void setPrpCode(final BigDecimal prpCode) {
        this.prpCode = prpCode;
    }
    
    public String getPrpShtDesc() {
        return this.prpShtDesc;
    }
    
    public void setPrpShtDesc(final String prpShtDesc) {
        this.prpShtDesc = prpShtDesc;
    }
    
    public BigDecimal getProCode() {
        return this.proCode;
    }
    
    public void setProCode(final BigDecimal proCode) {
        this.proCode = proCode;
    }
    
    public String getProductShortDescription() {
        return this.productShortDescription;
    }
    
    public void setProductShortDescription(final String productShortDescription) {
        this.productShortDescription = productShortDescription;
    }
    
    public String getTransType() {
        return this.transType;
    }
    
    public void setTransType(final String transType) {
        this.transType = transType;
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
    
    public BigDecimal getTl() {
        return this.tl;
    }
    
    public void setTl(final BigDecimal tl) {
        this.tl = tl;
    }
    
    public BigDecimal getPhcf() {
        return this.phcf;
    }
    
    public void setPhcf(final BigDecimal phcf) {
        this.phcf = phcf;
    }
    
    public String getPaymentFrequency() {
        return this.paymentFrequency;
    }
    
    public void setPaymentFrequency(final String paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
    }
    
    public String getDoneBy() {
        return this.doneBy;
    }
    
    public void setDoneBy(final String doneBy) {
        this.doneBy = doneBy;
    }
    
    public Date getDoneOn() {
        return this.doneOn;
    }
    
    public void setDoneOn(final Date doneOn) {
        this.doneOn = doneOn;
    }
    
    public String getBinderPolicyNo() {
        return this.binderPolicyNo;
    }
    
    public void setBinderPolicyNo(final String binderPolicyNo) {
        this.binderPolicyNo = binderPolicyNo;
    }
    
    public Date getPolicyDate() {
        return this.policyDate;
    }
    
    public void setPolicyDate(final Date policyDate) {
        this.policyDate = policyDate;
    }
    
    public String getBindShtDesc() {
        return this.bindShtDesc;
    }
    
    public void setBindShtDesc(final String bindShtDesc) {
        this.bindShtDesc = bindShtDesc;
    }
    
    public String getProcessStatus() {
        return this.processStatus;
    }
    
    public void setProcessStatus(final String processStatus) {
        this.processStatus = processStatus;
    }
    
    public BigDecimal getRetryCounter() {
        return this.retryCounter;
    }
    
    public void setRetryCounter(final BigDecimal retryCounter) {
        this.retryCounter = retryCounter;
    }
}
