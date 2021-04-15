// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.policy;

import java.util.List;
import java.sql.Date;
import java.math.BigDecimal;

public class RiskInfo
{
    private BigDecimal riskIpuCode;
    private BigDecimal clntwCode;
    private BigDecimal riskPremium;
    private BigDecimal ipuwCode;
    private BigDecimal ipuId;
    private BigDecimal ipuPolwId;
    private String riskId;
    private String riskDescription;
    private String coverFromDate;
    private String coverToDate;
    private Date riskCoverFromDate;
    private Date riskCoverToDate;
    private BigDecimal riskValue;
    private String binderShortDescription;
    private String coverTypeShortDescription;
    private String coverTypeDescription;
    private String subClassShortDescription;
    private String certificateNumber;
    private String certFromDate;
    private String certToDate;
    private String riskAddEdit;
    private String prevSubClassShortDescription;
    private String prevRiskId;
    private List<RiskSection> riskSections;
    private ClientInfo clientInfo;
    private Object riskAdditionalInfo;
    private List<RiskAdditionalInfo> rskAdditionalInfo;
    
    public String getRiskAddEdit() {
        return this.riskAddEdit;
    }
    
    public void setRiskAddEdit(final String riskAddEdit) {
        this.riskAddEdit = riskAddEdit;
    }
    
    public String getRiskId() {
        return this.riskId;
    }
    
    public void setRiskId(final String riskId) {
        this.riskId = riskId;
    }
    
    public String getRiskDescription() {
        return this.riskDescription;
    }
    
    public void setRiskDescription(final String riskDescription) {
        this.riskDescription = riskDescription;
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
    
    public BigDecimal getRiskValue() {
        return this.riskValue;
    }
    
    public void setRiskValue(final BigDecimal riskValue) {
        this.riskValue = riskValue;
    }
    
    public String getBinderShortDescription() {
        return this.binderShortDescription;
    }
    
    public void setBinderShortDescription(final String binderShortDescription) {
        this.binderShortDescription = binderShortDescription;
    }
    
    public String getCoverTypeShortDescription() {
        return this.coverTypeShortDescription;
    }
    
    public void setCoverTypeShortDescription(final String coverTypeShortDescription) {
        this.coverTypeShortDescription = coverTypeShortDescription;
    }
    
    public String getCoverTypeDescription() {
        return this.coverTypeDescription;
    }
    
    public void setCoverTypeDescription(final String coverTypeDescription) {
        this.coverTypeDescription = coverTypeDescription;
    }
    
    public String getSubClassShortDescription() {
        return this.subClassShortDescription;
    }
    
    public void setSubClassShortDescription(final String subClassShortDescription) {
        this.subClassShortDescription = subClassShortDescription;
    }
    
    public String getCertificateNumber() {
        return this.certificateNumber;
    }
    
    public void setCertificateNumber(final String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }
    
    public String getCertFromDate() {
        return this.certFromDate;
    }
    
    public void setCertFromDate(final String certFromDate) {
        this.certFromDate = certFromDate;
    }
    
    public String getCertToDate() {
        return this.certToDate;
    }
    
    public void setCertToDate(final String certToDate) {
        this.certToDate = certToDate;
    }
    
    public List<RiskSection> getRiskSections() {
        return (List<RiskSection>)this.riskSections;
    }
    
    public void setRiskSections(final List<RiskSection> riskSections) {
        this.riskSections = riskSections;
    }
    
    public ClientInfo getClientInfo() {
        return this.clientInfo;
    }
    
    public void setClientInfo(final ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }
    
    public BigDecimal getRiskIpuCode() {
        return this.riskIpuCode;
    }
    
    public void setRiskIpuCode(final BigDecimal riskIpuCode) {
        this.riskIpuCode = riskIpuCode;
    }
    
    public BigDecimal getIpuId() {
        return this.ipuId;
    }
    
    public void setIpuId(final BigDecimal ipuId) {
        this.ipuId = ipuId;
    }
    
    public BigDecimal getIpuPolwId() {
        return this.ipuPolwId;
    }
    
    public void setIpuPolwId(final BigDecimal ipuPolwId) {
        this.ipuPolwId = ipuPolwId;
    }
    
    public Date getRiskCoverFromDate() {
        return this.riskCoverFromDate;
    }
    
    public void setRiskCoverFromDate(final Date riskCoverFromDate) {
        this.riskCoverFromDate = riskCoverFromDate;
    }
    
    public Date getRiskCoverToDate() {
        return this.riskCoverToDate;
    }
    
    public void setRiskCoverToDate(final Date riskCoverToDate) {
        this.riskCoverToDate = riskCoverToDate;
    }
    
    public BigDecimal getIpuwCode() {
        return this.ipuwCode;
    }
    
    public void setIpuwCode(final BigDecimal ipuwCode) {
        this.ipuwCode = ipuwCode;
    }
    
    public BigDecimal getRiskPremium() {
        return this.riskPremium;
    }
    
    public void setRiskPremium(final BigDecimal riskPremium) {
        this.riskPremium = riskPremium;
    }
    
    public BigDecimal getClntwCode() {
        return this.clntwCode;
    }
    
    public void setClntwCode(final BigDecimal clntwCode) {
        this.clntwCode = clntwCode;
    }
    
    public Object getRiskAdditionalInfo() {
        return this.riskAdditionalInfo;
    }
    
    public String getPrevSubClassShortDescription() {
        return this.prevSubClassShortDescription;
    }
    
    public void setPrevSubClassShortDescription(final String prevSubClassShortDescription) {
        this.prevSubClassShortDescription = prevSubClassShortDescription;
    }
    
    public String getPrevRiskId() {
        return this.prevRiskId;
    }
    
    public void setPrevRiskId(final String prevRiskId) {
        this.prevRiskId = prevRiskId;
    }
    
    public void setRiskAdditionalInfo(final Object riskAdditionalInfo) {
        this.riskAdditionalInfo = riskAdditionalInfo;
    }
    
    public List<RiskAdditionalInfo> getRskAdditionalInfo() {
        return (List<RiskAdditionalInfo>)this.rskAdditionalInfo;
    }
    
    public void setRskAdditionalInfo(final List<RiskAdditionalInfo> rskAdditionalInfo) {
        this.rskAdditionalInfo = rskAdditionalInfo;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RiskInfo)) {
            return false;
        }
        final RiskInfo other = (RiskInfo)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        final Object this$riskIpuCode = this.getRiskIpuCode();
        final Object other$riskIpuCode = other.getRiskIpuCode();
        Label_0065: {
            if (this$riskIpuCode == null) {
                if (other$riskIpuCode == null) {
                    break Label_0065;
                }
            }
            else if (this$riskIpuCode.equals(other$riskIpuCode)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$clntwCode = this.getClntwCode();
        final Object other$clntwCode = other.getClntwCode();
        Label_0102: {
            if (this$clntwCode == null) {
                if (other$clntwCode == null) {
                    break Label_0102;
                }
            }
            else if (this$clntwCode.equals(other$clntwCode)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$riskPremium = this.getRiskPremium();
        final Object other$riskPremium = other.getRiskPremium();
        Label_0139: {
            if (this$riskPremium == null) {
                if (other$riskPremium == null) {
                    break Label_0139;
                }
            }
            else if (this$riskPremium.equals(other$riskPremium)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$ipuwCode = this.getIpuwCode();
        final Object other$ipuwCode = other.getIpuwCode();
        Label_0176: {
            if (this$ipuwCode == null) {
                if (other$ipuwCode == null) {
                    break Label_0176;
                }
            }
            else if (this$ipuwCode.equals(other$ipuwCode)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$ipuId = this.getIpuId();
        final Object other$ipuId = other.getIpuId();
        Label_0213: {
            if (this$ipuId == null) {
                if (other$ipuId == null) {
                    break Label_0213;
                }
            }
            else if (this$ipuId.equals(other$ipuId)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$ipuPolwId = this.getIpuPolwId();
        final Object other$ipuPolwId = other.getIpuPolwId();
        Label_0250: {
            if (this$ipuPolwId == null) {
                if (other$ipuPolwId == null) {
                    break Label_0250;
                }
            }
            else if (this$ipuPolwId.equals(other$ipuPolwId)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$riskId = this.getRiskId();
        final Object other$riskId = other.getRiskId();
        Label_0287: {
            if (this$riskId == null) {
                if (other$riskId == null) {
                    break Label_0287;
                }
            }
            else if (this$riskId.equals(other$riskId)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$riskDescription = this.getRiskDescription();
        final Object other$riskDescription = other.getRiskDescription();
        Label_0324: {
            if (this$riskDescription == null) {
                if (other$riskDescription == null) {
                    break Label_0324;
                }
            }
            else if (this$riskDescription.equals(other$riskDescription)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$coverFromDate = this.getCoverFromDate();
        final Object other$coverFromDate = other.getCoverFromDate();
        Label_0361: {
            if (this$coverFromDate == null) {
                if (other$coverFromDate == null) {
                    break Label_0361;
                }
            }
            else if (this$coverFromDate.equals(other$coverFromDate)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$coverToDate = this.getCoverToDate();
        final Object other$coverToDate = other.getCoverToDate();
        Label_0398: {
            if (this$coverToDate == null) {
                if (other$coverToDate == null) {
                    break Label_0398;
                }
            }
            else if (this$coverToDate.equals(other$coverToDate)) {
                break Label_0398;
            }
            return false;
        }
        final Object this$riskCoverFromDate = this.getRiskCoverFromDate();
        final Object other$riskCoverFromDate = other.getRiskCoverFromDate();
        Label_0435: {
            if (this$riskCoverFromDate == null) {
                if (other$riskCoverFromDate == null) {
                    break Label_0435;
                }
            }
            else if (this$riskCoverFromDate.equals(other$riskCoverFromDate)) {
                break Label_0435;
            }
            return false;
        }
        final Object this$riskCoverToDate = this.getRiskCoverToDate();
        final Object other$riskCoverToDate = other.getRiskCoverToDate();
        Label_0472: {
            if (this$riskCoverToDate == null) {
                if (other$riskCoverToDate == null) {
                    break Label_0472;
                }
            }
            else if (this$riskCoverToDate.equals(other$riskCoverToDate)) {
                break Label_0472;
            }
            return false;
        }
        final Object this$riskValue = this.getRiskValue();
        final Object other$riskValue = other.getRiskValue();
        Label_0509: {
            if (this$riskValue == null) {
                if (other$riskValue == null) {
                    break Label_0509;
                }
            }
            else if (this$riskValue.equals(other$riskValue)) {
                break Label_0509;
            }
            return false;
        }
        final Object this$binderShortDescription = this.getBinderShortDescription();
        final Object other$binderShortDescription = other.getBinderShortDescription();
        Label_0546: {
            if (this$binderShortDescription == null) {
                if (other$binderShortDescription == null) {
                    break Label_0546;
                }
            }
            else if (this$binderShortDescription.equals(other$binderShortDescription)) {
                break Label_0546;
            }
            return false;
        }
        final Object this$coverTypeShortDescription = this.getCoverTypeShortDescription();
        final Object other$coverTypeShortDescription = other.getCoverTypeShortDescription();
        Label_0583: {
            if (this$coverTypeShortDescription == null) {
                if (other$coverTypeShortDescription == null) {
                    break Label_0583;
                }
            }
            else if (this$coverTypeShortDescription.equals(other$coverTypeShortDescription)) {
                break Label_0583;
            }
            return false;
        }
        final Object this$coverTypeDescription = this.getCoverTypeDescription();
        final Object other$coverTypeDescription = other.getCoverTypeDescription();
        Label_0620: {
            if (this$coverTypeDescription == null) {
                if (other$coverTypeDescription == null) {
                    break Label_0620;
                }
            }
            else if (this$coverTypeDescription.equals(other$coverTypeDescription)) {
                break Label_0620;
            }
            return false;
        }
        final Object this$subClassShortDescription = this.getSubClassShortDescription();
        final Object other$subClassShortDescription = other.getSubClassShortDescription();
        Label_0657: {
            if (this$subClassShortDescription == null) {
                if (other$subClassShortDescription == null) {
                    break Label_0657;
                }
            }
            else if (this$subClassShortDescription.equals(other$subClassShortDescription)) {
                break Label_0657;
            }
            return false;
        }
        final Object this$certificateNumber = this.getCertificateNumber();
        final Object other$certificateNumber = other.getCertificateNumber();
        Label_0694: {
            if (this$certificateNumber == null) {
                if (other$certificateNumber == null) {
                    break Label_0694;
                }
            }
            else if (this$certificateNumber.equals(other$certificateNumber)) {
                break Label_0694;
            }
            return false;
        }
        final Object this$certFromDate = this.getCertFromDate();
        final Object other$certFromDate = other.getCertFromDate();
        Label_0731: {
            if (this$certFromDate == null) {
                if (other$certFromDate == null) {
                    break Label_0731;
                }
            }
            else if (this$certFromDate.equals(other$certFromDate)) {
                break Label_0731;
            }
            return false;
        }
        final Object this$certToDate = this.getCertToDate();
        final Object other$certToDate = other.getCertToDate();
        Label_0768: {
            if (this$certToDate == null) {
                if (other$certToDate == null) {
                    break Label_0768;
                }
            }
            else if (this$certToDate.equals(other$certToDate)) {
                break Label_0768;
            }
            return false;
        }
        final Object this$riskAddEdit = this.getRiskAddEdit();
        final Object other$riskAddEdit = other.getRiskAddEdit();
        Label_0805: {
            if (this$riskAddEdit == null) {
                if (other$riskAddEdit == null) {
                    break Label_0805;
                }
            }
            else if (this$riskAddEdit.equals(other$riskAddEdit)) {
                break Label_0805;
            }
            return false;
        }
        final Object this$prevSubClassShortDescription = this.getPrevSubClassShortDescription();
        final Object other$prevSubClassShortDescription = other.getPrevSubClassShortDescription();
        Label_0842: {
            if (this$prevSubClassShortDescription == null) {
                if (other$prevSubClassShortDescription == null) {
                    break Label_0842;
                }
            }
            else if (this$prevSubClassShortDescription.equals(other$prevSubClassShortDescription)) {
                break Label_0842;
            }
            return false;
        }
        final Object this$prevRiskId = this.getPrevRiskId();
        final Object other$prevRiskId = other.getPrevRiskId();
        Label_0879: {
            if (this$prevRiskId == null) {
                if (other$prevRiskId == null) {
                    break Label_0879;
                }
            }
            else if (this$prevRiskId.equals(other$prevRiskId)) {
                break Label_0879;
            }
            return false;
        }
        final Object this$riskSections = this.getRiskSections();
        final Object other$riskSections = other.getRiskSections();
        Label_0916: {
            if (this$riskSections == null) {
                if (other$riskSections == null) {
                    break Label_0916;
                }
            }
            else if (this$riskSections.equals(other$riskSections)) {
                break Label_0916;
            }
            return false;
        }
        final Object this$clientInfo = this.getClientInfo();
        final Object other$clientInfo = other.getClientInfo();
        Label_0953: {
            if (this$clientInfo == null) {
                if (other$clientInfo == null) {
                    break Label_0953;
                }
            }
            else if (this$clientInfo.equals(other$clientInfo)) {
                break Label_0953;
            }
            return false;
        }
        final Object this$riskAdditionalInfo = this.getRiskAdditionalInfo();
        final Object other$riskAdditionalInfo = other.getRiskAdditionalInfo();
        Label_0990: {
            if (this$riskAdditionalInfo == null) {
                if (other$riskAdditionalInfo == null) {
                    break Label_0990;
                }
            }
            else if (this$riskAdditionalInfo.equals(other$riskAdditionalInfo)) {
                break Label_0990;
            }
            return false;
        }
        final Object this$rskAdditionalInfo = this.getRskAdditionalInfo();
        final Object other$rskAdditionalInfo = other.getRskAdditionalInfo();
        if (this$rskAdditionalInfo == null) {
            if (other$rskAdditionalInfo == null) {
                return true;
            }
        }
        else if (this$rskAdditionalInfo.equals(other$rskAdditionalInfo)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof RiskInfo;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $riskIpuCode = this.getRiskIpuCode();
        result = result * 59 + (($riskIpuCode == null) ? 43 : $riskIpuCode.hashCode());
        final Object $clntwCode = this.getClntwCode();
        result = result * 59 + (($clntwCode == null) ? 43 : $clntwCode.hashCode());
        final Object $riskPremium = this.getRiskPremium();
        result = result * 59 + (($riskPremium == null) ? 43 : $riskPremium.hashCode());
        final Object $ipuwCode = this.getIpuwCode();
        result = result * 59 + (($ipuwCode == null) ? 43 : $ipuwCode.hashCode());
        final Object $ipuId = this.getIpuId();
        result = result * 59 + (($ipuId == null) ? 43 : $ipuId.hashCode());
        final Object $ipuPolwId = this.getIpuPolwId();
        result = result * 59 + (($ipuPolwId == null) ? 43 : $ipuPolwId.hashCode());
        final Object $riskId = this.getRiskId();
        result = result * 59 + (($riskId == null) ? 43 : $riskId.hashCode());
        final Object $riskDescription = this.getRiskDescription();
        result = result * 59 + (($riskDescription == null) ? 43 : $riskDescription.hashCode());
        final Object $coverFromDate = this.getCoverFromDate();
        result = result * 59 + (($coverFromDate == null) ? 43 : $coverFromDate.hashCode());
        final Object $coverToDate = this.getCoverToDate();
        result = result * 59 + (($coverToDate == null) ? 43 : $coverToDate.hashCode());
        final Object $riskCoverFromDate = this.getRiskCoverFromDate();
        result = result * 59 + (($riskCoverFromDate == null) ? 43 : $riskCoverFromDate.hashCode());
        final Object $riskCoverToDate = this.getRiskCoverToDate();
        result = result * 59 + (($riskCoverToDate == null) ? 43 : $riskCoverToDate.hashCode());
        final Object $riskValue = this.getRiskValue();
        result = result * 59 + (($riskValue == null) ? 43 : $riskValue.hashCode());
        final Object $binderShortDescription = this.getBinderShortDescription();
        result = result * 59 + (($binderShortDescription == null) ? 43 : $binderShortDescription.hashCode());
        final Object $coverTypeShortDescription = this.getCoverTypeShortDescription();
        result = result * 59 + (($coverTypeShortDescription == null) ? 43 : $coverTypeShortDescription.hashCode());
        final Object $coverTypeDescription = this.getCoverTypeDescription();
        result = result * 59 + (($coverTypeDescription == null) ? 43 : $coverTypeDescription.hashCode());
        final Object $subClassShortDescription = this.getSubClassShortDescription();
        result = result * 59 + (($subClassShortDescription == null) ? 43 : $subClassShortDescription.hashCode());
        final Object $certificateNumber = this.getCertificateNumber();
        result = result * 59 + (($certificateNumber == null) ? 43 : $certificateNumber.hashCode());
        final Object $certFromDate = this.getCertFromDate();
        result = result * 59 + (($certFromDate == null) ? 43 : $certFromDate.hashCode());
        final Object $certToDate = this.getCertToDate();
        result = result * 59 + (($certToDate == null) ? 43 : $certToDate.hashCode());
        final Object $riskAddEdit = this.getRiskAddEdit();
        result = result * 59 + (($riskAddEdit == null) ? 43 : $riskAddEdit.hashCode());
        final Object $prevSubClassShortDescription = this.getPrevSubClassShortDescription();
        result = result * 59 + (($prevSubClassShortDescription == null) ? 43 : $prevSubClassShortDescription.hashCode());
        final Object $prevRiskId = this.getPrevRiskId();
        result = result * 59 + (($prevRiskId == null) ? 43 : $prevRiskId.hashCode());
        final Object $riskSections = this.getRiskSections();
        result = result * 59 + (($riskSections == null) ? 43 : $riskSections.hashCode());
        final Object $clientInfo = this.getClientInfo();
        result = result * 59 + (($clientInfo == null) ? 43 : $clientInfo.hashCode());
        final Object $riskAdditionalInfo = this.getRiskAdditionalInfo();
        result = result * 59 + (($riskAdditionalInfo == null) ? 43 : $riskAdditionalInfo.hashCode());
        final Object $rskAdditionalInfo = this.getRskAdditionalInfo();
        result = result * 59 + (($rskAdditionalInfo == null) ? 43 : $rskAdditionalInfo.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "RiskInfo(riskIpuCode=" + this.getRiskIpuCode() + ", clntwCode=" + this.getClntwCode() + ", riskPremium=" + this.getRiskPremium() + ", ipuwCode=" + this.getIpuwCode() + ", ipuId=" + this.getIpuId() + ", ipuPolwId=" + this.getIpuPolwId() + ", riskId=" + this.getRiskId() + ", riskDescription=" + this.getRiskDescription() + ", coverFromDate=" + this.getCoverFromDate() + ", coverToDate=" + this.getCoverToDate() + ", riskCoverFromDate=" + this.getRiskCoverFromDate() + ", riskCoverToDate=" + this.getRiskCoverToDate() + ", riskValue=" + this.getRiskValue() + ", binderShortDescription=" + this.getBinderShortDescription() + ", coverTypeShortDescription=" + this.getCoverTypeShortDescription() + ", coverTypeDescription=" + this.getCoverTypeDescription() + ", subClassShortDescription=" + this.getSubClassShortDescription() + ", certificateNumber=" + this.getCertificateNumber() + ", certFromDate=" + this.getCertFromDate() + ", certToDate=" + this.getCertToDate() + ", riskAddEdit=" + this.getRiskAddEdit() + ", prevSubClassShortDescription=" + this.getPrevSubClassShortDescription() + ", prevRiskId=" + this.getPrevRiskId() + ", riskSections=" + this.getRiskSections() + ", clientInfo=" + this.getClientInfo() + ", riskAdditionalInfo=" + this.getRiskAdditionalInfo() + ", rskAdditionalInfo=" + this.getRskAdditionalInfo() + ")";
    }
}
