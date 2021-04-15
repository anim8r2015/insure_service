// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.entities;

import java.sql.Date;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "api_web_pol_rec")
public class AgencyPolicyInfo implements Serializable
{
    @Id
    @Column(name = "polw_code", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GIN_POLW_CODE_SEQ")
    @SequenceGenerator(name = "GIN_POLW_CODE_SEQ", schema = "TQ_GIS", allocationSize = 1, sequenceName = "TQ_GIS.GIN_POLW_CODE_SEQ")
    private BigDecimal polBatchNo;
    @Column(name = "polw_id", length = 26, nullable = false)
    private BigDecimal policyCode;
    @Column(name = "polw_agnt_sht_desc", length = 20, nullable = true)
    private String agntShtDesc;
    @Column(name = "polw_client_policy_number", length = 26, nullable = true)
    private String clientPolicyNumber;
    @Column(name = "polw_brn_sht_desc", length = 15, nullable = true)
    private String brnShtDesc;
    @Column(name = "polw_policy_cover_to", length = 7, nullable = true)
    private Date policyCoverTo;
    @Column(name = "polw_policy_cover_from", length = 7, nullable = true)
    private Date policyCoverFrom;
    @Column(name = "polw_cur_symbol", length = 15, nullable = true)
    private String curSymbol;
    @Column(name = "polw_endos_no", length = 50, nullable = true)
    private String renEndosNo;
    @Column(name = "polw_total_fap", length = 22, nullable = true)
    private BigDecimal totalFap;
    @Column(name = "polw_freq_of_payment", length = 1, nullable = true)
    private String freqOfPayment;
    @Column(name = "polw_tot_phfund", length = 22, nullable = true)
    private BigDecimal totPhfund;
    @Column(name = "polw_prepared_date", length = 7, nullable = true)
    private Date preparedDate;
    @Column(name = "polw_basic_premium", length = 22, nullable = true)
    private BigDecimal basicPremium;
    @Column(name = "polw_pro_sht_desc", length = 15, nullable = true)
    private String proShtDesc;
    @Column(name = "polw_policy_no", length = 26, nullable = true)
    private String policyNo;
    @Column(name = "polw_tot_tl", length = 22, nullable = true)
    private BigDecimal totTl;
    @Column(name = "polw_policy_status", length = 26, nullable = true)
    private String transType;
    @Column(name = "polw_process_status", length = 1, nullable = true)
    private String processStatus;
    @Column(name = "polw_transaction_code", length = 26, nullable = true)
    private BigDecimal transactionCode;
    @Column(name = "polw_risk_noteno", length = 26, nullable = true)
    private String riskNoteNumber;
    @Column(name = "polw_summary_remarks", length = 26, nullable = true)
    private String transactionRemarks;
    @Column(name = "polw_comm_amt", length = 22, nullable = true)
    private BigDecimal commissionAmount;
    @Column(name = "polw_extras", length = 22, nullable = true)
    private BigDecimal otherDuties;
    @Column(name = "polw_wtht", length = 22, nullable = true)
    private BigDecimal withholdingTax;
    @Column(name = "polw_nett_premium", length = 22, nullable = true)
    private BigDecimal nettPremium;
    @Column(name = "polw_clntw_code", length = 22, nullable = true)
    private BigDecimal clntwCode;
    
    public BigDecimal getPolBatchNo() {
        return this.polBatchNo;
    }
    
    public BigDecimal getPolicyCode() {
        return this.policyCode;
    }
    
    public String getAgntShtDesc() {
        return this.agntShtDesc;
    }
    
    public String getClientPolicyNumber() {
        return this.clientPolicyNumber;
    }
    
    public String getBrnShtDesc() {
        return this.brnShtDesc;
    }
    
    public Date getPolicyCoverTo() {
        return this.policyCoverTo;
    }
    
    public Date getPolicyCoverFrom() {
        return this.policyCoverFrom;
    }
    
    public String getCurSymbol() {
        return this.curSymbol;
    }
    
    public String getRenEndosNo() {
        return this.renEndosNo;
    }
    
    public BigDecimal getTotalFap() {
        return this.totalFap;
    }
    
    public String getFreqOfPayment() {
        return this.freqOfPayment;
    }
    
    public BigDecimal getTotPhfund() {
        return this.totPhfund;
    }
    
    public Date getPreparedDate() {
        return this.preparedDate;
    }
    
    public BigDecimal getBasicPremium() {
        return this.basicPremium;
    }
    
    public String getProShtDesc() {
        return this.proShtDesc;
    }
    
    public String getPolicyNo() {
        return this.policyNo;
    }
    
    public BigDecimal getTotTl() {
        return this.totTl;
    }
    
    public String getTransType() {
        return this.transType;
    }
    
    public String getProcessStatus() {
        return this.processStatus;
    }
    
    public BigDecimal getTransactionCode() {
        return this.transactionCode;
    }
    
    public String getRiskNoteNumber() {
        return this.riskNoteNumber;
    }
    
    public String getTransactionRemarks() {
        return this.transactionRemarks;
    }
    
    public BigDecimal getCommissionAmount() {
        return this.commissionAmount;
    }
    
    public BigDecimal getOtherDuties() {
        return this.otherDuties;
    }
    
    public BigDecimal getWithholdingTax() {
        return this.withholdingTax;
    }
    
    public BigDecimal getNettPremium() {
        return this.nettPremium;
    }
    
    public BigDecimal getClntwCode() {
        return this.clntwCode;
    }
    
    public void setPolBatchNo(final BigDecimal polBatchNo) {
        this.polBatchNo = polBatchNo;
    }
    
    public void setPolicyCode(final BigDecimal policyCode) {
        this.policyCode = policyCode;
    }
    
    public void setAgntShtDesc(final String agntShtDesc) {
        this.agntShtDesc = agntShtDesc;
    }
    
    public void setClientPolicyNumber(final String clientPolicyNumber) {
        this.clientPolicyNumber = clientPolicyNumber;
    }
    
    public void setBrnShtDesc(final String brnShtDesc) {
        this.brnShtDesc = brnShtDesc;
    }
    
    public void setPolicyCoverTo(final Date policyCoverTo) {
        this.policyCoverTo = policyCoverTo;
    }
    
    public void setPolicyCoverFrom(final Date policyCoverFrom) {
        this.policyCoverFrom = policyCoverFrom;
    }
    
    public void setCurSymbol(final String curSymbol) {
        this.curSymbol = curSymbol;
    }
    
    public void setRenEndosNo(final String renEndosNo) {
        this.renEndosNo = renEndosNo;
    }
    
    public void setTotalFap(final BigDecimal totalFap) {
        this.totalFap = totalFap;
    }
    
    public void setFreqOfPayment(final String freqOfPayment) {
        this.freqOfPayment = freqOfPayment;
    }
    
    public void setTotPhfund(final BigDecimal totPhfund) {
        this.totPhfund = totPhfund;
    }
    
    public void setPreparedDate(final Date preparedDate) {
        this.preparedDate = preparedDate;
    }
    
    public void setBasicPremium(final BigDecimal basicPremium) {
        this.basicPremium = basicPremium;
    }
    
    public void setProShtDesc(final String proShtDesc) {
        this.proShtDesc = proShtDesc;
    }
    
    public void setPolicyNo(final String policyNo) {
        this.policyNo = policyNo;
    }
    
    public void setTotTl(final BigDecimal totTl) {
        this.totTl = totTl;
    }
    
    public void setTransType(final String transType) {
        this.transType = transType;
    }
    
    public void setProcessStatus(final String processStatus) {
        this.processStatus = processStatus;
    }
    
    public void setTransactionCode(final BigDecimal transactionCode) {
        this.transactionCode = transactionCode;
    }
    
    public void setRiskNoteNumber(final String riskNoteNumber) {
        this.riskNoteNumber = riskNoteNumber;
    }
    
    public void setTransactionRemarks(final String transactionRemarks) {
        this.transactionRemarks = transactionRemarks;
    }
    
    public void setCommissionAmount(final BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }
    
    public void setOtherDuties(final BigDecimal otherDuties) {
        this.otherDuties = otherDuties;
    }
    
    public void setWithholdingTax(final BigDecimal withholdingTax) {
        this.withholdingTax = withholdingTax;
    }
    
    public void setNettPremium(final BigDecimal nettPremium) {
        this.nettPremium = nettPremium;
    }
    
    public void setClntwCode(final BigDecimal clntwCode) {
        this.clntwCode = clntwCode;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgencyPolicyInfo)) {
            return false;
        }
        final AgencyPolicyInfo other = (AgencyPolicyInfo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$polBatchNo = this.getPolBatchNo();
        final Object other$polBatchNo = other.getPolBatchNo();
        Label_0065: {
            if (this$polBatchNo == null) {
                if (other$polBatchNo == null) {
                    break Label_0065;
                }
            }
            else if (this$polBatchNo.equals(other$polBatchNo)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$policyCode = this.getPolicyCode();
        final Object other$policyCode = other.getPolicyCode();
        Label_0102: {
            if (this$policyCode == null) {
                if (other$policyCode == null) {
                    break Label_0102;
                }
            }
            else if (this$policyCode.equals(other$policyCode)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$agntShtDesc = this.getAgntShtDesc();
        final Object other$agntShtDesc = other.getAgntShtDesc();
        Label_0139: {
            if (this$agntShtDesc == null) {
                if (other$agntShtDesc == null) {
                    break Label_0139;
                }
            }
            else if (this$agntShtDesc.equals(other$agntShtDesc)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$clientPolicyNumber = this.getClientPolicyNumber();
        final Object other$clientPolicyNumber = other.getClientPolicyNumber();
        Label_0176: {
            if (this$clientPolicyNumber == null) {
                if (other$clientPolicyNumber == null) {
                    break Label_0176;
                }
            }
            else if (this$clientPolicyNumber.equals(other$clientPolicyNumber)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$brnShtDesc = this.getBrnShtDesc();
        final Object other$brnShtDesc = other.getBrnShtDesc();
        Label_0213: {
            if (this$brnShtDesc == null) {
                if (other$brnShtDesc == null) {
                    break Label_0213;
                }
            }
            else if (this$brnShtDesc.equals(other$brnShtDesc)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$policyCoverTo = this.getPolicyCoverTo();
        final Object other$policyCoverTo = other.getPolicyCoverTo();
        Label_0250: {
            if (this$policyCoverTo == null) {
                if (other$policyCoverTo == null) {
                    break Label_0250;
                }
            }
            else if (this$policyCoverTo.equals(other$policyCoverTo)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$policyCoverFrom = this.getPolicyCoverFrom();
        final Object other$policyCoverFrom = other.getPolicyCoverFrom();
        Label_0287: {
            if (this$policyCoverFrom == null) {
                if (other$policyCoverFrom == null) {
                    break Label_0287;
                }
            }
            else if (this$policyCoverFrom.equals(other$policyCoverFrom)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$curSymbol = this.getCurSymbol();
        final Object other$curSymbol = other.getCurSymbol();
        Label_0324: {
            if (this$curSymbol == null) {
                if (other$curSymbol == null) {
                    break Label_0324;
                }
            }
            else if (this$curSymbol.equals(other$curSymbol)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$renEndosNo = this.getRenEndosNo();
        final Object other$renEndosNo = other.getRenEndosNo();
        Label_0361: {
            if (this$renEndosNo == null) {
                if (other$renEndosNo == null) {
                    break Label_0361;
                }
            }
            else if (this$renEndosNo.equals(other$renEndosNo)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$totalFap = this.getTotalFap();
        final Object other$totalFap = other.getTotalFap();
        Label_0398: {
            if (this$totalFap == null) {
                if (other$totalFap == null) {
                    break Label_0398;
                }
            }
            else if (this$totalFap.equals(other$totalFap)) {
                break Label_0398;
            }
            return false;
        }
        final Object this$freqOfPayment = this.getFreqOfPayment();
        final Object other$freqOfPayment = other.getFreqOfPayment();
        Label_0435: {
            if (this$freqOfPayment == null) {
                if (other$freqOfPayment == null) {
                    break Label_0435;
                }
            }
            else if (this$freqOfPayment.equals(other$freqOfPayment)) {
                break Label_0435;
            }
            return false;
        }
        final Object this$totPhfund = this.getTotPhfund();
        final Object other$totPhfund = other.getTotPhfund();
        Label_0472: {
            if (this$totPhfund == null) {
                if (other$totPhfund == null) {
                    break Label_0472;
                }
            }
            else if (this$totPhfund.equals(other$totPhfund)) {
                break Label_0472;
            }
            return false;
        }
        final Object this$preparedDate = this.getPreparedDate();
        final Object other$preparedDate = other.getPreparedDate();
        Label_0509: {
            if (this$preparedDate == null) {
                if (other$preparedDate == null) {
                    break Label_0509;
                }
            }
            else if (this$preparedDate.equals(other$preparedDate)) {
                break Label_0509;
            }
            return false;
        }
        final Object this$basicPremium = this.getBasicPremium();
        final Object other$basicPremium = other.getBasicPremium();
        Label_0546: {
            if (this$basicPremium == null) {
                if (other$basicPremium == null) {
                    break Label_0546;
                }
            }
            else if (this$basicPremium.equals(other$basicPremium)) {
                break Label_0546;
            }
            return false;
        }
        final Object this$proShtDesc = this.getProShtDesc();
        final Object other$proShtDesc = other.getProShtDesc();
        Label_0583: {
            if (this$proShtDesc == null) {
                if (other$proShtDesc == null) {
                    break Label_0583;
                }
            }
            else if (this$proShtDesc.equals(other$proShtDesc)) {
                break Label_0583;
            }
            return false;
        }
        final Object this$policyNo = this.getPolicyNo();
        final Object other$policyNo = other.getPolicyNo();
        Label_0620: {
            if (this$policyNo == null) {
                if (other$policyNo == null) {
                    break Label_0620;
                }
            }
            else if (this$policyNo.equals(other$policyNo)) {
                break Label_0620;
            }
            return false;
        }
        final Object this$totTl = this.getTotTl();
        final Object other$totTl = other.getTotTl();
        Label_0657: {
            if (this$totTl == null) {
                if (other$totTl == null) {
                    break Label_0657;
                }
            }
            else if (this$totTl.equals(other$totTl)) {
                break Label_0657;
            }
            return false;
        }
        final Object this$transType = this.getTransType();
        final Object other$transType = other.getTransType();
        Label_0694: {
            if (this$transType == null) {
                if (other$transType == null) {
                    break Label_0694;
                }
            }
            else if (this$transType.equals(other$transType)) {
                break Label_0694;
            }
            return false;
        }
        final Object this$processStatus = this.getProcessStatus();
        final Object other$processStatus = other.getProcessStatus();
        Label_0731: {
            if (this$processStatus == null) {
                if (other$processStatus == null) {
                    break Label_0731;
                }
            }
            else if (this$processStatus.equals(other$processStatus)) {
                break Label_0731;
            }
            return false;
        }
        final Object this$transactionCode = this.getTransactionCode();
        final Object other$transactionCode = other.getTransactionCode();
        Label_0768: {
            if (this$transactionCode == null) {
                if (other$transactionCode == null) {
                    break Label_0768;
                }
            }
            else if (this$transactionCode.equals(other$transactionCode)) {
                break Label_0768;
            }
            return false;
        }
        final Object this$riskNoteNumber = this.getRiskNoteNumber();
        final Object other$riskNoteNumber = other.getRiskNoteNumber();
        Label_0805: {
            if (this$riskNoteNumber == null) {
                if (other$riskNoteNumber == null) {
                    break Label_0805;
                }
            }
            else if (this$riskNoteNumber.equals(other$riskNoteNumber)) {
                break Label_0805;
            }
            return false;
        }
        final Object this$transactionRemarks = this.getTransactionRemarks();
        final Object other$transactionRemarks = other.getTransactionRemarks();
        Label_0842: {
            if (this$transactionRemarks == null) {
                if (other$transactionRemarks == null) {
                    break Label_0842;
                }
            }
            else if (this$transactionRemarks.equals(other$transactionRemarks)) {
                break Label_0842;
            }
            return false;
        }
        final Object this$commissionAmount = this.getCommissionAmount();
        final Object other$commissionAmount = other.getCommissionAmount();
        Label_0879: {
            if (this$commissionAmount == null) {
                if (other$commissionAmount == null) {
                    break Label_0879;
                }
            }
            else if (this$commissionAmount.equals(other$commissionAmount)) {
                break Label_0879;
            }
            return false;
        }
        final Object this$otherDuties = this.getOtherDuties();
        final Object other$otherDuties = other.getOtherDuties();
        Label_0916: {
            if (this$otherDuties == null) {
                if (other$otherDuties == null) {
                    break Label_0916;
                }
            }
            else if (this$otherDuties.equals(other$otherDuties)) {
                break Label_0916;
            }
            return false;
        }
        final Object this$withholdingTax = this.getWithholdingTax();
        final Object other$withholdingTax = other.getWithholdingTax();
        Label_0953: {
            if (this$withholdingTax == null) {
                if (other$withholdingTax == null) {
                    break Label_0953;
                }
            }
            else if (this$withholdingTax.equals(other$withholdingTax)) {
                break Label_0953;
            }
            return false;
        }
        final Object this$nettPremium = this.getNettPremium();
        final Object other$nettPremium = other.getNettPremium();
        Label_0990: {
            if (this$nettPremium == null) {
                if (other$nettPremium == null) {
                    break Label_0990;
                }
            }
            else if (this$nettPremium.equals(other$nettPremium)) {
                break Label_0990;
            }
            return false;
        }
        final Object this$clntwCode = this.getClntwCode();
        final Object other$clntwCode = other.getClntwCode();
        if (this$clntwCode == null) {
            if (other$clntwCode == null) {
                return true;
            }
        }
        else if (this$clntwCode.equals(other$clntwCode)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof AgencyPolicyInfo;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $polBatchNo = this.getPolBatchNo();
        result = result * 59 + (($polBatchNo == null) ? 43 : $polBatchNo.hashCode());
        final Object $policyCode = this.getPolicyCode();
        result = result * 59 + (($policyCode == null) ? 43 : $policyCode.hashCode());
        final Object $agntShtDesc = this.getAgntShtDesc();
        result = result * 59 + (($agntShtDesc == null) ? 43 : $agntShtDesc.hashCode());
        final Object $clientPolicyNumber = this.getClientPolicyNumber();
        result = result * 59 + (($clientPolicyNumber == null) ? 43 : $clientPolicyNumber.hashCode());
        final Object $brnShtDesc = this.getBrnShtDesc();
        result = result * 59 + (($brnShtDesc == null) ? 43 : $brnShtDesc.hashCode());
        final Object $policyCoverTo = this.getPolicyCoverTo();
        result = result * 59 + (($policyCoverTo == null) ? 43 : $policyCoverTo.hashCode());
        final Object $policyCoverFrom = this.getPolicyCoverFrom();
        result = result * 59 + (($policyCoverFrom == null) ? 43 : $policyCoverFrom.hashCode());
        final Object $curSymbol = this.getCurSymbol();
        result = result * 59 + (($curSymbol == null) ? 43 : $curSymbol.hashCode());
        final Object $renEndosNo = this.getRenEndosNo();
        result = result * 59 + (($renEndosNo == null) ? 43 : $renEndosNo.hashCode());
        final Object $totalFap = this.getTotalFap();
        result = result * 59 + (($totalFap == null) ? 43 : $totalFap.hashCode());
        final Object $freqOfPayment = this.getFreqOfPayment();
        result = result * 59 + (($freqOfPayment == null) ? 43 : $freqOfPayment.hashCode());
        final Object $totPhfund = this.getTotPhfund();
        result = result * 59 + (($totPhfund == null) ? 43 : $totPhfund.hashCode());
        final Object $preparedDate = this.getPreparedDate();
        result = result * 59 + (($preparedDate == null) ? 43 : $preparedDate.hashCode());
        final Object $basicPremium = this.getBasicPremium();
        result = result * 59 + (($basicPremium == null) ? 43 : $basicPremium.hashCode());
        final Object $proShtDesc = this.getProShtDesc();
        result = result * 59 + (($proShtDesc == null) ? 43 : $proShtDesc.hashCode());
        final Object $policyNo = this.getPolicyNo();
        result = result * 59 + (($policyNo == null) ? 43 : $policyNo.hashCode());
        final Object $totTl = this.getTotTl();
        result = result * 59 + (($totTl == null) ? 43 : $totTl.hashCode());
        final Object $transType = this.getTransType();
        result = result * 59 + (($transType == null) ? 43 : $transType.hashCode());
        final Object $processStatus = this.getProcessStatus();
        result = result * 59 + (($processStatus == null) ? 43 : $processStatus.hashCode());
        final Object $transactionCode = this.getTransactionCode();
        result = result * 59 + (($transactionCode == null) ? 43 : $transactionCode.hashCode());
        final Object $riskNoteNumber = this.getRiskNoteNumber();
        result = result * 59 + (($riskNoteNumber == null) ? 43 : $riskNoteNumber.hashCode());
        final Object $transactionRemarks = this.getTransactionRemarks();
        result = result * 59 + (($transactionRemarks == null) ? 43 : $transactionRemarks.hashCode());
        final Object $commissionAmount = this.getCommissionAmount();
        result = result * 59 + (($commissionAmount == null) ? 43 : $commissionAmount.hashCode());
        final Object $otherDuties = this.getOtherDuties();
        result = result * 59 + (($otherDuties == null) ? 43 : $otherDuties.hashCode());
        final Object $withholdingTax = this.getWithholdingTax();
        result = result * 59 + (($withholdingTax == null) ? 43 : $withholdingTax.hashCode());
        final Object $nettPremium = this.getNettPremium();
        result = result * 59 + (($nettPremium == null) ? 43 : $nettPremium.hashCode());
        final Object $clntwCode = this.getClntwCode();
        result = result * 59 + (($clntwCode == null) ? 43 : $clntwCode.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "AgencyPolicyInfo(polBatchNo=" + this.getPolBatchNo() + ", policyCode=" + this.getPolicyCode() + ", agntShtDesc=" + this.getAgntShtDesc() + ", clientPolicyNumber=" + this.getClientPolicyNumber() + ", brnShtDesc=" + this.getBrnShtDesc() + ", policyCoverTo=" + this.getPolicyCoverTo() + ", policyCoverFrom=" + this.getPolicyCoverFrom() + ", curSymbol=" + this.getCurSymbol() + ", renEndosNo=" + this.getRenEndosNo() + ", totalFap=" + this.getTotalFap() + ", freqOfPayment=" + this.getFreqOfPayment() + ", totPhfund=" + this.getTotPhfund() + ", preparedDate=" + this.getPreparedDate() + ", basicPremium=" + this.getBasicPremium() + ", proShtDesc=" + this.getProShtDesc() + ", policyNo=" + this.getPolicyNo() + ", totTl=" + this.getTotTl() + ", transType=" + this.getTransType() + ", processStatus=" + this.getProcessStatus() + ", transactionCode=" + this.getTransactionCode() + ", riskNoteNumber=" + this.getRiskNoteNumber() + ", transactionRemarks=" + this.getTransactionRemarks() + ", commissionAmount=" + this.getCommissionAmount() + ", otherDuties=" + this.getOtherDuties() + ", withholdingTax=" + this.getWithholdingTax() + ", nettPremium=" + this.getNettPremium() + ", clntwCode=" + this.getClntwCode() + ")";
    }
}
