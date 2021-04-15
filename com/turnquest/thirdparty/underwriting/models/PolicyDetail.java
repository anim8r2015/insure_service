// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.models;

import java.util.List;
import java.time.LocalDateTime;
import java.math.BigDecimal;

public class PolicyDetail
{
    private BigDecimal quotCode;
    private BigDecimal batchNo;
    private String policyNo;
    private LocalDateTime wefDt;
    private LocalDateTime wetDt;
    private BigDecimal uwYear;
    private BigDecimal totalSumInsured;
    private String policyStatus;
    private BigDecimal nettPremium;
    private String preparedBy;
    private LocalDateTime preparedDate;
    private String currentStatus;
    private String authosrised;
    private BigDecimal proCode;
    private String renewedRec;
    private String renewable;
    private LocalDateTime policyCoverTo;
    private LocalDateTime policyCoverFrom;
    private BigDecimal siDiff;
    private BigDecimal wtht;
    private Double premTax;
    private Long prpCode;
    private BigDecimal agnCode;
    private String polFreqOfPayment;
    private String polTranType;
    private String screenCode;
    private Double totalGp;
    private Double totalFap;
    private List<Risks> risks;
    private Risks risk;
    private Client clients;
    private BigDecimal curCode;
    private String curSymbol;
    private Long curRate;
    private Long noOfInstalments;
    private BigDecimal totalTL;
    private BigDecimal tl;
    private BigDecimal sd;
    private BigDecimal phf;
    private BigDecimal annualTL;
    
    public BigDecimal getQuotCode() {
        return this.quotCode;
    }
    
    public BigDecimal getBatchNo() {
        return this.batchNo;
    }
    
    public String getPolicyNo() {
        return this.policyNo;
    }
    
    public LocalDateTime getWefDt() {
        return this.wefDt;
    }
    
    public LocalDateTime getWetDt() {
        return this.wetDt;
    }
    
    public BigDecimal getUwYear() {
        return this.uwYear;
    }
    
    public BigDecimal getTotalSumInsured() {
        return this.totalSumInsured;
    }
    
    public String getPolicyStatus() {
        return this.policyStatus;
    }
    
    public BigDecimal getNettPremium() {
        return this.nettPremium;
    }
    
    public String getPreparedBy() {
        return this.preparedBy;
    }
    
    public LocalDateTime getPreparedDate() {
        return this.preparedDate;
    }
    
    public String getCurrentStatus() {
        return this.currentStatus;
    }
    
    public String getAuthosrised() {
        return this.authosrised;
    }
    
    public BigDecimal getProCode() {
        return this.proCode;
    }
    
    public String getRenewedRec() {
        return this.renewedRec;
    }
    
    public String getRenewable() {
        return this.renewable;
    }
    
    public LocalDateTime getPolicyCoverTo() {
        return this.policyCoverTo;
    }
    
    public LocalDateTime getPolicyCoverFrom() {
        return this.policyCoverFrom;
    }
    
    public BigDecimal getSiDiff() {
        return this.siDiff;
    }
    
    public BigDecimal getWtht() {
        return this.wtht;
    }
    
    public Double getPremTax() {
        return this.premTax;
    }
    
    public Long getPrpCode() {
        return this.prpCode;
    }
    
    public BigDecimal getAgnCode() {
        return this.agnCode;
    }
    
    public String getPolFreqOfPayment() {
        return this.polFreqOfPayment;
    }
    
    public String getPolTranType() {
        return this.polTranType;
    }
    
    public String getScreenCode() {
        return this.screenCode;
    }
    
    public Double getTotalGp() {
        return this.totalGp;
    }
    
    public Double getTotalFap() {
        return this.totalFap;
    }
    
    public List<Risks> getRisks() {
        return this.risks;
    }
    
    public Risks getRisk() {
        return this.risk;
    }
    
    public Client getClients() {
        return this.clients;
    }
    
    public BigDecimal getCurCode() {
        return this.curCode;
    }
    
    public String getCurSymbol() {
        return this.curSymbol;
    }
    
    public Long getCurRate() {
        return this.curRate;
    }
    
    public Long getNoOfInstalments() {
        return this.noOfInstalments;
    }
    
    public BigDecimal getTotalTL() {
        return this.totalTL;
    }
    
    public BigDecimal getTl() {
        return this.tl;
    }
    
    public BigDecimal getSd() {
        return this.sd;
    }
    
    public BigDecimal getPhf() {
        return this.phf;
    }
    
    public BigDecimal getAnnualTL() {
        return this.annualTL;
    }
    
    public void setQuotCode(final BigDecimal quotCode) {
        this.quotCode = quotCode;
    }
    
    public void setBatchNo(final BigDecimal batchNo) {
        this.batchNo = batchNo;
    }
    
    public void setPolicyNo(final String policyNo) {
        this.policyNo = policyNo;
    }
    
    public void setWefDt(final LocalDateTime wefDt) {
        this.wefDt = wefDt;
    }
    
    public void setWetDt(final LocalDateTime wetDt) {
        this.wetDt = wetDt;
    }
    
    public void setUwYear(final BigDecimal uwYear) {
        this.uwYear = uwYear;
    }
    
    public void setTotalSumInsured(final BigDecimal totalSumInsured) {
        this.totalSumInsured = totalSumInsured;
    }
    
    public void setPolicyStatus(final String policyStatus) {
        this.policyStatus = policyStatus;
    }
    
    public void setNettPremium(final BigDecimal nettPremium) {
        this.nettPremium = nettPremium;
    }
    
    public void setPreparedBy(final String preparedBy) {
        this.preparedBy = preparedBy;
    }
    
    public void setPreparedDate(final LocalDateTime preparedDate) {
        this.preparedDate = preparedDate;
    }
    
    public void setCurrentStatus(final String currentStatus) {
        this.currentStatus = currentStatus;
    }
    
    public void setAuthosrised(final String authosrised) {
        this.authosrised = authosrised;
    }
    
    public void setProCode(final BigDecimal proCode) {
        this.proCode = proCode;
    }
    
    public void setRenewedRec(final String renewedRec) {
        this.renewedRec = renewedRec;
    }
    
    public void setRenewable(final String renewable) {
        this.renewable = renewable;
    }
    
    public void setPolicyCoverTo(final LocalDateTime policyCoverTo) {
        this.policyCoverTo = policyCoverTo;
    }
    
    public void setPolicyCoverFrom(final LocalDateTime policyCoverFrom) {
        this.policyCoverFrom = policyCoverFrom;
    }
    
    public void setSiDiff(final BigDecimal siDiff) {
        this.siDiff = siDiff;
    }
    
    public void setWtht(final BigDecimal wtht) {
        this.wtht = wtht;
    }
    
    public void setPremTax(final Double premTax) {
        this.premTax = premTax;
    }
    
    public void setPrpCode(final Long prpCode) {
        this.prpCode = prpCode;
    }
    
    public void setAgnCode(final BigDecimal agnCode) {
        this.agnCode = agnCode;
    }
    
    public void setPolFreqOfPayment(final String polFreqOfPayment) {
        this.polFreqOfPayment = polFreqOfPayment;
    }
    
    public void setPolTranType(final String polTranType) {
        this.polTranType = polTranType;
    }
    
    public void setScreenCode(final String screenCode) {
        this.screenCode = screenCode;
    }
    
    public void setTotalGp(final Double totalGp) {
        this.totalGp = totalGp;
    }
    
    public void setTotalFap(final Double totalFap) {
        this.totalFap = totalFap;
    }
    
    public void setRisks(final List<Risks> risks) {
        this.risks = risks;
    }
    
    public void setRisk(final Risks risk) {
        this.risk = risk;
    }
    
    public void setClients(final Client clients) {
        this.clients = clients;
    }
    
    public void setCurCode(final BigDecimal curCode) {
        this.curCode = curCode;
    }
    
    public void setCurSymbol(final String curSymbol) {
        this.curSymbol = curSymbol;
    }
    
    public void setCurRate(final Long curRate) {
        this.curRate = curRate;
    }
    
    public void setNoOfInstalments(final Long noOfInstalments) {
        this.noOfInstalments = noOfInstalments;
    }
    
    public void setTotalTL(final BigDecimal totalTL) {
        this.totalTL = totalTL;
    }
    
    public void setTl(final BigDecimal tl) {
        this.tl = tl;
    }
    
    public void setSd(final BigDecimal sd) {
        this.sd = sd;
    }
    
    public void setPhf(final BigDecimal phf) {
        this.phf = phf;
    }
    
    public void setAnnualTL(final BigDecimal annualTL) {
        this.annualTL = annualTL;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PolicyDetail)) {
            return false;
        }
        final PolicyDetail other = (PolicyDetail)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$quotCode = this.getQuotCode();
        final Object other$quotCode = other.getQuotCode();
        Label_0065: {
            if (this$quotCode == null) {
                if (other$quotCode == null) {
                    break Label_0065;
                }
            }
            else if (this$quotCode.equals(other$quotCode)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$batchNo = this.getBatchNo();
        final Object other$batchNo = other.getBatchNo();
        Label_0102: {
            if (this$batchNo == null) {
                if (other$batchNo == null) {
                    break Label_0102;
                }
            }
            else if (this$batchNo.equals(other$batchNo)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$policyNo = this.getPolicyNo();
        final Object other$policyNo = other.getPolicyNo();
        Label_0139: {
            if (this$policyNo == null) {
                if (other$policyNo == null) {
                    break Label_0139;
                }
            }
            else if (this$policyNo.equals(other$policyNo)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$wefDt = this.getWefDt();
        final Object other$wefDt = other.getWefDt();
        Label_0176: {
            if (this$wefDt == null) {
                if (other$wefDt == null) {
                    break Label_0176;
                }
            }
            else if (this$wefDt.equals(other$wefDt)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$wetDt = this.getWetDt();
        final Object other$wetDt = other.getWetDt();
        Label_0213: {
            if (this$wetDt == null) {
                if (other$wetDt == null) {
                    break Label_0213;
                }
            }
            else if (this$wetDt.equals(other$wetDt)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$uwYear = this.getUwYear();
        final Object other$uwYear = other.getUwYear();
        Label_0250: {
            if (this$uwYear == null) {
                if (other$uwYear == null) {
                    break Label_0250;
                }
            }
            else if (this$uwYear.equals(other$uwYear)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$totalSumInsured = this.getTotalSumInsured();
        final Object other$totalSumInsured = other.getTotalSumInsured();
        Label_0287: {
            if (this$totalSumInsured == null) {
                if (other$totalSumInsured == null) {
                    break Label_0287;
                }
            }
            else if (this$totalSumInsured.equals(other$totalSumInsured)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$policyStatus = this.getPolicyStatus();
        final Object other$policyStatus = other.getPolicyStatus();
        Label_0324: {
            if (this$policyStatus == null) {
                if (other$policyStatus == null) {
                    break Label_0324;
                }
            }
            else if (this$policyStatus.equals(other$policyStatus)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$nettPremium = this.getNettPremium();
        final Object other$nettPremium = other.getNettPremium();
        Label_0361: {
            if (this$nettPremium == null) {
                if (other$nettPremium == null) {
                    break Label_0361;
                }
            }
            else if (this$nettPremium.equals(other$nettPremium)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$preparedBy = this.getPreparedBy();
        final Object other$preparedBy = other.getPreparedBy();
        Label_0398: {
            if (this$preparedBy == null) {
                if (other$preparedBy == null) {
                    break Label_0398;
                }
            }
            else if (this$preparedBy.equals(other$preparedBy)) {
                break Label_0398;
            }
            return false;
        }
        final Object this$preparedDate = this.getPreparedDate();
        final Object other$preparedDate = other.getPreparedDate();
        Label_0435: {
            if (this$preparedDate == null) {
                if (other$preparedDate == null) {
                    break Label_0435;
                }
            }
            else if (this$preparedDate.equals(other$preparedDate)) {
                break Label_0435;
            }
            return false;
        }
        final Object this$currentStatus = this.getCurrentStatus();
        final Object other$currentStatus = other.getCurrentStatus();
        Label_0472: {
            if (this$currentStatus == null) {
                if (other$currentStatus == null) {
                    break Label_0472;
                }
            }
            else if (this$currentStatus.equals(other$currentStatus)) {
                break Label_0472;
            }
            return false;
        }
        final Object this$authosrised = this.getAuthosrised();
        final Object other$authosrised = other.getAuthosrised();
        Label_0509: {
            if (this$authosrised == null) {
                if (other$authosrised == null) {
                    break Label_0509;
                }
            }
            else if (this$authosrised.equals(other$authosrised)) {
                break Label_0509;
            }
            return false;
        }
        final Object this$proCode = this.getProCode();
        final Object other$proCode = other.getProCode();
        Label_0546: {
            if (this$proCode == null) {
                if (other$proCode == null) {
                    break Label_0546;
                }
            }
            else if (this$proCode.equals(other$proCode)) {
                break Label_0546;
            }
            return false;
        }
        final Object this$renewedRec = this.getRenewedRec();
        final Object other$renewedRec = other.getRenewedRec();
        Label_0583: {
            if (this$renewedRec == null) {
                if (other$renewedRec == null) {
                    break Label_0583;
                }
            }
            else if (this$renewedRec.equals(other$renewedRec)) {
                break Label_0583;
            }
            return false;
        }
        final Object this$renewable = this.getRenewable();
        final Object other$renewable = other.getRenewable();
        Label_0620: {
            if (this$renewable == null) {
                if (other$renewable == null) {
                    break Label_0620;
                }
            }
            else if (this$renewable.equals(other$renewable)) {
                break Label_0620;
            }
            return false;
        }
        final Object this$policyCoverTo = this.getPolicyCoverTo();
        final Object other$policyCoverTo = other.getPolicyCoverTo();
        Label_0657: {
            if (this$policyCoverTo == null) {
                if (other$policyCoverTo == null) {
                    break Label_0657;
                }
            }
            else if (this$policyCoverTo.equals(other$policyCoverTo)) {
                break Label_0657;
            }
            return false;
        }
        final Object this$policyCoverFrom = this.getPolicyCoverFrom();
        final Object other$policyCoverFrom = other.getPolicyCoverFrom();
        Label_0694: {
            if (this$policyCoverFrom == null) {
                if (other$policyCoverFrom == null) {
                    break Label_0694;
                }
            }
            else if (this$policyCoverFrom.equals(other$policyCoverFrom)) {
                break Label_0694;
            }
            return false;
        }
        final Object this$siDiff = this.getSiDiff();
        final Object other$siDiff = other.getSiDiff();
        Label_0731: {
            if (this$siDiff == null) {
                if (other$siDiff == null) {
                    break Label_0731;
                }
            }
            else if (this$siDiff.equals(other$siDiff)) {
                break Label_0731;
            }
            return false;
        }
        final Object this$wtht = this.getWtht();
        final Object other$wtht = other.getWtht();
        Label_0768: {
            if (this$wtht == null) {
                if (other$wtht == null) {
                    break Label_0768;
                }
            }
            else if (this$wtht.equals(other$wtht)) {
                break Label_0768;
            }
            return false;
        }
        final Object this$premTax = this.getPremTax();
        final Object other$premTax = other.getPremTax();
        Label_0805: {
            if (this$premTax == null) {
                if (other$premTax == null) {
                    break Label_0805;
                }
            }
            else if (this$premTax.equals(other$premTax)) {
                break Label_0805;
            }
            return false;
        }
        final Object this$prpCode = this.getPrpCode();
        final Object other$prpCode = other.getPrpCode();
        Label_0842: {
            if (this$prpCode == null) {
                if (other$prpCode == null) {
                    break Label_0842;
                }
            }
            else if (this$prpCode.equals(other$prpCode)) {
                break Label_0842;
            }
            return false;
        }
        final Object this$agnCode = this.getAgnCode();
        final Object other$agnCode = other.getAgnCode();
        Label_0879: {
            if (this$agnCode == null) {
                if (other$agnCode == null) {
                    break Label_0879;
                }
            }
            else if (this$agnCode.equals(other$agnCode)) {
                break Label_0879;
            }
            return false;
        }
        final Object this$polFreqOfPayment = this.getPolFreqOfPayment();
        final Object other$polFreqOfPayment = other.getPolFreqOfPayment();
        Label_0916: {
            if (this$polFreqOfPayment == null) {
                if (other$polFreqOfPayment == null) {
                    break Label_0916;
                }
            }
            else if (this$polFreqOfPayment.equals(other$polFreqOfPayment)) {
                break Label_0916;
            }
            return false;
        }
        final Object this$polTranType = this.getPolTranType();
        final Object other$polTranType = other.getPolTranType();
        Label_0953: {
            if (this$polTranType == null) {
                if (other$polTranType == null) {
                    break Label_0953;
                }
            }
            else if (this$polTranType.equals(other$polTranType)) {
                break Label_0953;
            }
            return false;
        }
        final Object this$screenCode = this.getScreenCode();
        final Object other$screenCode = other.getScreenCode();
        Label_0990: {
            if (this$screenCode == null) {
                if (other$screenCode == null) {
                    break Label_0990;
                }
            }
            else if (this$screenCode.equals(other$screenCode)) {
                break Label_0990;
            }
            return false;
        }
        final Object this$totalGp = this.getTotalGp();
        final Object other$totalGp = other.getTotalGp();
        Label_1027: {
            if (this$totalGp == null) {
                if (other$totalGp == null) {
                    break Label_1027;
                }
            }
            else if (this$totalGp.equals(other$totalGp)) {
                break Label_1027;
            }
            return false;
        }
        final Object this$totalFap = this.getTotalFap();
        final Object other$totalFap = other.getTotalFap();
        Label_1064: {
            if (this$totalFap == null) {
                if (other$totalFap == null) {
                    break Label_1064;
                }
            }
            else if (this$totalFap.equals(other$totalFap)) {
                break Label_1064;
            }
            return false;
        }
        final Object this$risks = this.getRisks();
        final Object other$risks = other.getRisks();
        Label_1101: {
            if (this$risks == null) {
                if (other$risks == null) {
                    break Label_1101;
                }
            }
            else if (this$risks.equals(other$risks)) {
                break Label_1101;
            }
            return false;
        }
        final Object this$risk = this.getRisk();
        final Object other$risk = other.getRisk();
        Label_1138: {
            if (this$risk == null) {
                if (other$risk == null) {
                    break Label_1138;
                }
            }
            else if (this$risk.equals(other$risk)) {
                break Label_1138;
            }
            return false;
        }
        final Object this$clients = this.getClients();
        final Object other$clients = other.getClients();
        Label_1175: {
            if (this$clients == null) {
                if (other$clients == null) {
                    break Label_1175;
                }
            }
            else if (this$clients.equals(other$clients)) {
                break Label_1175;
            }
            return false;
        }
        final Object this$curCode = this.getCurCode();
        final Object other$curCode = other.getCurCode();
        Label_1212: {
            if (this$curCode == null) {
                if (other$curCode == null) {
                    break Label_1212;
                }
            }
            else if (this$curCode.equals(other$curCode)) {
                break Label_1212;
            }
            return false;
        }
        final Object this$curSymbol = this.getCurSymbol();
        final Object other$curSymbol = other.getCurSymbol();
        Label_1249: {
            if (this$curSymbol == null) {
                if (other$curSymbol == null) {
                    break Label_1249;
                }
            }
            else if (this$curSymbol.equals(other$curSymbol)) {
                break Label_1249;
            }
            return false;
        }
        final Object this$curRate = this.getCurRate();
        final Object other$curRate = other.getCurRate();
        Label_1286: {
            if (this$curRate == null) {
                if (other$curRate == null) {
                    break Label_1286;
                }
            }
            else if (this$curRate.equals(other$curRate)) {
                break Label_1286;
            }
            return false;
        }
        final Object this$noOfInstalments = this.getNoOfInstalments();
        final Object other$noOfInstalments = other.getNoOfInstalments();
        Label_1323: {
            if (this$noOfInstalments == null) {
                if (other$noOfInstalments == null) {
                    break Label_1323;
                }
            }
            else if (this$noOfInstalments.equals(other$noOfInstalments)) {
                break Label_1323;
            }
            return false;
        }
        final Object this$totalTL = this.getTotalTL();
        final Object other$totalTL = other.getTotalTL();
        Label_1360: {
            if (this$totalTL == null) {
                if (other$totalTL == null) {
                    break Label_1360;
                }
            }
            else if (this$totalTL.equals(other$totalTL)) {
                break Label_1360;
            }
            return false;
        }
        final Object this$tl = this.getTl();
        final Object other$tl = other.getTl();
        Label_1397: {
            if (this$tl == null) {
                if (other$tl == null) {
                    break Label_1397;
                }
            }
            else if (this$tl.equals(other$tl)) {
                break Label_1397;
            }
            return false;
        }
        final Object this$sd = this.getSd();
        final Object other$sd = other.getSd();
        Label_1434: {
            if (this$sd == null) {
                if (other$sd == null) {
                    break Label_1434;
                }
            }
            else if (this$sd.equals(other$sd)) {
                break Label_1434;
            }
            return false;
        }
        final Object this$phf = this.getPhf();
        final Object other$phf = other.getPhf();
        Label_1471: {
            if (this$phf == null) {
                if (other$phf == null) {
                    break Label_1471;
                }
            }
            else if (this$phf.equals(other$phf)) {
                break Label_1471;
            }
            return false;
        }
        final Object this$annualTL = this.getAnnualTL();
        final Object other$annualTL = other.getAnnualTL();
        if (this$annualTL == null) {
            if (other$annualTL == null) {
                return true;
            }
        }
        else if (this$annualTL.equals(other$annualTL)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof PolicyDetail;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $quotCode = this.getQuotCode();
        result = result * 59 + (($quotCode == null) ? 43 : $quotCode.hashCode());
        final Object $batchNo = this.getBatchNo();
        result = result * 59 + (($batchNo == null) ? 43 : $batchNo.hashCode());
        final Object $policyNo = this.getPolicyNo();
        result = result * 59 + (($policyNo == null) ? 43 : $policyNo.hashCode());
        final Object $wefDt = this.getWefDt();
        result = result * 59 + (($wefDt == null) ? 43 : $wefDt.hashCode());
        final Object $wetDt = this.getWetDt();
        result = result * 59 + (($wetDt == null) ? 43 : $wetDt.hashCode());
        final Object $uwYear = this.getUwYear();
        result = result * 59 + (($uwYear == null) ? 43 : $uwYear.hashCode());
        final Object $totalSumInsured = this.getTotalSumInsured();
        result = result * 59 + (($totalSumInsured == null) ? 43 : $totalSumInsured.hashCode());
        final Object $policyStatus = this.getPolicyStatus();
        result = result * 59 + (($policyStatus == null) ? 43 : $policyStatus.hashCode());
        final Object $nettPremium = this.getNettPremium();
        result = result * 59 + (($nettPremium == null) ? 43 : $nettPremium.hashCode());
        final Object $preparedBy = this.getPreparedBy();
        result = result * 59 + (($preparedBy == null) ? 43 : $preparedBy.hashCode());
        final Object $preparedDate = this.getPreparedDate();
        result = result * 59 + (($preparedDate == null) ? 43 : $preparedDate.hashCode());
        final Object $currentStatus = this.getCurrentStatus();
        result = result * 59 + (($currentStatus == null) ? 43 : $currentStatus.hashCode());
        final Object $authosrised = this.getAuthosrised();
        result = result * 59 + (($authosrised == null) ? 43 : $authosrised.hashCode());
        final Object $proCode = this.getProCode();
        result = result * 59 + (($proCode == null) ? 43 : $proCode.hashCode());
        final Object $renewedRec = this.getRenewedRec();
        result = result * 59 + (($renewedRec == null) ? 43 : $renewedRec.hashCode());
        final Object $renewable = this.getRenewable();
        result = result * 59 + (($renewable == null) ? 43 : $renewable.hashCode());
        final Object $policyCoverTo = this.getPolicyCoverTo();
        result = result * 59 + (($policyCoverTo == null) ? 43 : $policyCoverTo.hashCode());
        final Object $policyCoverFrom = this.getPolicyCoverFrom();
        result = result * 59 + (($policyCoverFrom == null) ? 43 : $policyCoverFrom.hashCode());
        final Object $siDiff = this.getSiDiff();
        result = result * 59 + (($siDiff == null) ? 43 : $siDiff.hashCode());
        final Object $wtht = this.getWtht();
        result = result * 59 + (($wtht == null) ? 43 : $wtht.hashCode());
        final Object $premTax = this.getPremTax();
        result = result * 59 + (($premTax == null) ? 43 : $premTax.hashCode());
        final Object $prpCode = this.getPrpCode();
        result = result * 59 + (($prpCode == null) ? 43 : $prpCode.hashCode());
        final Object $agnCode = this.getAgnCode();
        result = result * 59 + (($agnCode == null) ? 43 : $agnCode.hashCode());
        final Object $polFreqOfPayment = this.getPolFreqOfPayment();
        result = result * 59 + (($polFreqOfPayment == null) ? 43 : $polFreqOfPayment.hashCode());
        final Object $polTranType = this.getPolTranType();
        result = result * 59 + (($polTranType == null) ? 43 : $polTranType.hashCode());
        final Object $screenCode = this.getScreenCode();
        result = result * 59 + (($screenCode == null) ? 43 : $screenCode.hashCode());
        final Object $totalGp = this.getTotalGp();
        result = result * 59 + (($totalGp == null) ? 43 : $totalGp.hashCode());
        final Object $totalFap = this.getTotalFap();
        result = result * 59 + (($totalFap == null) ? 43 : $totalFap.hashCode());
        final Object $risks = this.getRisks();
        result = result * 59 + (($risks == null) ? 43 : $risks.hashCode());
        final Object $risk = this.getRisk();
        result = result * 59 + (($risk == null) ? 43 : $risk.hashCode());
        final Object $clients = this.getClients();
        result = result * 59 + (($clients == null) ? 43 : $clients.hashCode());
        final Object $curCode = this.getCurCode();
        result = result * 59 + (($curCode == null) ? 43 : $curCode.hashCode());
        final Object $curSymbol = this.getCurSymbol();
        result = result * 59 + (($curSymbol == null) ? 43 : $curSymbol.hashCode());
        final Object $curRate = this.getCurRate();
        result = result * 59 + (($curRate == null) ? 43 : $curRate.hashCode());
        final Object $noOfInstalments = this.getNoOfInstalments();
        result = result * 59 + (($noOfInstalments == null) ? 43 : $noOfInstalments.hashCode());
        final Object $totalTL = this.getTotalTL();
        result = result * 59 + (($totalTL == null) ? 43 : $totalTL.hashCode());
        final Object $tl = this.getTl();
        result = result * 59 + (($tl == null) ? 43 : $tl.hashCode());
        final Object $sd = this.getSd();
        result = result * 59 + (($sd == null) ? 43 : $sd.hashCode());
        final Object $phf = this.getPhf();
        result = result * 59 + (($phf == null) ? 43 : $phf.hashCode());
        final Object $annualTL = this.getAnnualTL();
        result = result * 59 + (($annualTL == null) ? 43 : $annualTL.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "PolicyDetail(quotCode=" + this.getQuotCode() + ", batchNo=" + this.getBatchNo() + ", policyNo=" + this.getPolicyNo() + ", wefDt=" + this.getWefDt() + ", wetDt=" + this.getWetDt() + ", uwYear=" + this.getUwYear() + ", totalSumInsured=" + this.getTotalSumInsured() + ", policyStatus=" + this.getPolicyStatus() + ", nettPremium=" + this.getNettPremium() + ", preparedBy=" + this.getPreparedBy() + ", preparedDate=" + this.getPreparedDate() + ", currentStatus=" + this.getCurrentStatus() + ", authosrised=" + this.getAuthosrised() + ", proCode=" + this.getProCode() + ", renewedRec=" + this.getRenewedRec() + ", renewable=" + this.getRenewable() + ", policyCoverTo=" + this.getPolicyCoverTo() + ", policyCoverFrom=" + this.getPolicyCoverFrom() + ", siDiff=" + this.getSiDiff() + ", wtht=" + this.getWtht() + ", premTax=" + this.getPremTax() + ", prpCode=" + this.getPrpCode() + ", agnCode=" + this.getAgnCode() + ", polFreqOfPayment=" + this.getPolFreqOfPayment() + ", polTranType=" + this.getPolTranType() + ", screenCode=" + this.getScreenCode() + ", totalGp=" + this.getTotalGp() + ", totalFap=" + this.getTotalFap() + ", risks=" + this.getRisks() + ", risk=" + this.getRisk() + ", clients=" + this.getClients() + ", curCode=" + this.getCurCode() + ", curSymbol=" + this.getCurSymbol() + ", curRate=" + this.getCurRate() + ", noOfInstalments=" + this.getNoOfInstalments() + ", totalTL=" + this.getTotalTL() + ", tl=" + this.getTl() + ", sd=" + this.getSd() + ", phf=" + this.getPhf() + ", annualTL=" + this.getAnnualTL() + ")";
    }
}
