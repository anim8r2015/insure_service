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
@Table(name = "api_web_risk_rec")
public class AgencyRiskInfo implements Serializable
{
    @Id
    @Column(name = "ipuw_code", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GIN_IPUW_CODE_SEQ")
    @SequenceGenerator(name = "GIN_IPUW_CODE_SEQ", schema = "TQ_GIS", allocationSize = 1, sequenceName = "TQ_GIS.GIN_IPUW_CODE_SEQ")
    private BigDecimal ipuwCode;
    @Column(name = "ipuw_id")
    private BigDecimal ipuId;
    @Column(name = "ipuw_polw_id")
    private BigDecimal ipuPolwId;
    @Column(name = "ipuw_property_id", length = 20, nullable = true)
    private String riskId;
    @Column(name = "ipuw_desc", length = 26, nullable = true)
    private String riskDescription;
    @Column(name = "ipuw_bind_desc", length = 15, nullable = true)
    private String binderShortDescription;
    @Column(name = "ipuw_wet", length = 7, nullable = true)
    private Date riskCoverToDate;
    @Column(name = "ipuw_wef", length = 7, nullable = true)
    private Date riskCoverFromDate;
    @Column(name = "ipuw_covt_sht_desc", length = 15, nullable = true)
    private String coverTypeShortDescription;
    @Column(name = "ipuw_covt_desc", length = 50, nullable = true)
    private String coverTypeDescription;
    @Column(name = "ipuw_value", length = 22, nullable = true)
    private BigDecimal riskValue;
    @Column(name = "ipuw_scl_code", length = 22, nullable = true)
    private String subClassShortDescription;
    @Column(name = "ipuw_ipu_code")
    private BigDecimal riskIpuCode;
    @Column(name = "ipuw_premium")
    private BigDecimal premium;
    @Column(name = "ipuw_clntw_code")
    private BigDecimal clntwCode;
    @Column(name = "ipuw_add_edit")
    private String riskAddEdit;
    @Column(name = "ipuw_prev_scl_code", length = 22, nullable = true)
    private String prevSubClassShortDescription;
    @Column(name = "ipuw_prev_property_id", length = 20, nullable = true)
    private String prevRiskId;
    
    public BigDecimal getIpuwCode() {
        return this.ipuwCode;
    }
    
    public BigDecimal getIpuId() {
        return this.ipuId;
    }
    
    public BigDecimal getIpuPolwId() {
        return this.ipuPolwId;
    }
    
    public String getRiskId() {
        return this.riskId;
    }
    
    public String getRiskDescription() {
        return this.riskDescription;
    }
    
    public String getBinderShortDescription() {
        return this.binderShortDescription;
    }
    
    public Date getRiskCoverToDate() {
        return this.riskCoverToDate;
    }
    
    public Date getRiskCoverFromDate() {
        return this.riskCoverFromDate;
    }
    
    public String getCoverTypeShortDescription() {
        return this.coverTypeShortDescription;
    }
    
    public String getCoverTypeDescription() {
        return this.coverTypeDescription;
    }
    
    public BigDecimal getRiskValue() {
        return this.riskValue;
    }
    
    public String getSubClassShortDescription() {
        return this.subClassShortDescription;
    }
    
    public BigDecimal getRiskIpuCode() {
        return this.riskIpuCode;
    }
    
    public BigDecimal getPremium() {
        return this.premium;
    }
    
    public BigDecimal getClntwCode() {
        return this.clntwCode;
    }
    
    public String getRiskAddEdit() {
        return this.riskAddEdit;
    }
    
    public String getPrevSubClassShortDescription() {
        return this.prevSubClassShortDescription;
    }
    
    public String getPrevRiskId() {
        return this.prevRiskId;
    }
    
    public void setIpuwCode(final BigDecimal ipuwCode) {
        this.ipuwCode = ipuwCode;
    }
    
    public void setIpuId(final BigDecimal ipuId) {
        this.ipuId = ipuId;
    }
    
    public void setIpuPolwId(final BigDecimal ipuPolwId) {
        this.ipuPolwId = ipuPolwId;
    }
    
    public void setRiskId(final String riskId) {
        this.riskId = riskId;
    }
    
    public void setRiskDescription(final String riskDescription) {
        this.riskDescription = riskDescription;
    }
    
    public void setBinderShortDescription(final String binderShortDescription) {
        this.binderShortDescription = binderShortDescription;
    }
    
    public void setRiskCoverToDate(final Date riskCoverToDate) {
        this.riskCoverToDate = riskCoverToDate;
    }
    
    public void setRiskCoverFromDate(final Date riskCoverFromDate) {
        this.riskCoverFromDate = riskCoverFromDate;
    }
    
    public void setCoverTypeShortDescription(final String coverTypeShortDescription) {
        this.coverTypeShortDescription = coverTypeShortDescription;
    }
    
    public void setCoverTypeDescription(final String coverTypeDescription) {
        this.coverTypeDescription = coverTypeDescription;
    }
    
    public void setRiskValue(final BigDecimal riskValue) {
        this.riskValue = riskValue;
    }
    
    public void setSubClassShortDescription(final String subClassShortDescription) {
        this.subClassShortDescription = subClassShortDescription;
    }
    
    public void setRiskIpuCode(final BigDecimal riskIpuCode) {
        this.riskIpuCode = riskIpuCode;
    }
    
    public void setPremium(final BigDecimal premium) {
        this.premium = premium;
    }
    
    public void setClntwCode(final BigDecimal clntwCode) {
        this.clntwCode = clntwCode;
    }
    
    public void setRiskAddEdit(final String riskAddEdit) {
        this.riskAddEdit = riskAddEdit;
    }
    
    public void setPrevSubClassShortDescription(final String prevSubClassShortDescription) {
        this.prevSubClassShortDescription = prevSubClassShortDescription;
    }
    
    public void setPrevRiskId(final String prevRiskId) {
        this.prevRiskId = prevRiskId;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgencyRiskInfo)) {
            return false;
        }
        final AgencyRiskInfo other = (AgencyRiskInfo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$ipuwCode = this.getIpuwCode();
        final Object other$ipuwCode = other.getIpuwCode();
        Label_0065: {
            if (this$ipuwCode == null) {
                if (other$ipuwCode == null) {
                    break Label_0065;
                }
            }
            else if (this$ipuwCode.equals(other$ipuwCode)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$ipuId = this.getIpuId();
        final Object other$ipuId = other.getIpuId();
        Label_0102: {
            if (this$ipuId == null) {
                if (other$ipuId == null) {
                    break Label_0102;
                }
            }
            else if (this$ipuId.equals(other$ipuId)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$ipuPolwId = this.getIpuPolwId();
        final Object other$ipuPolwId = other.getIpuPolwId();
        Label_0139: {
            if (this$ipuPolwId == null) {
                if (other$ipuPolwId == null) {
                    break Label_0139;
                }
            }
            else if (this$ipuPolwId.equals(other$ipuPolwId)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$riskId = this.getRiskId();
        final Object other$riskId = other.getRiskId();
        Label_0176: {
            if (this$riskId == null) {
                if (other$riskId == null) {
                    break Label_0176;
                }
            }
            else if (this$riskId.equals(other$riskId)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$riskDescription = this.getRiskDescription();
        final Object other$riskDescription = other.getRiskDescription();
        Label_0213: {
            if (this$riskDescription == null) {
                if (other$riskDescription == null) {
                    break Label_0213;
                }
            }
            else if (this$riskDescription.equals(other$riskDescription)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$binderShortDescription = this.getBinderShortDescription();
        final Object other$binderShortDescription = other.getBinderShortDescription();
        Label_0250: {
            if (this$binderShortDescription == null) {
                if (other$binderShortDescription == null) {
                    break Label_0250;
                }
            }
            else if (this$binderShortDescription.equals(other$binderShortDescription)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$riskCoverToDate = this.getRiskCoverToDate();
        final Object other$riskCoverToDate = other.getRiskCoverToDate();
        Label_0287: {
            if (this$riskCoverToDate == null) {
                if (other$riskCoverToDate == null) {
                    break Label_0287;
                }
            }
            else if (this$riskCoverToDate.equals(other$riskCoverToDate)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$riskCoverFromDate = this.getRiskCoverFromDate();
        final Object other$riskCoverFromDate = other.getRiskCoverFromDate();
        Label_0324: {
            if (this$riskCoverFromDate == null) {
                if (other$riskCoverFromDate == null) {
                    break Label_0324;
                }
            }
            else if (this$riskCoverFromDate.equals(other$riskCoverFromDate)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$coverTypeShortDescription = this.getCoverTypeShortDescription();
        final Object other$coverTypeShortDescription = other.getCoverTypeShortDescription();
        Label_0361: {
            if (this$coverTypeShortDescription == null) {
                if (other$coverTypeShortDescription == null) {
                    break Label_0361;
                }
            }
            else if (this$coverTypeShortDescription.equals(other$coverTypeShortDescription)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$coverTypeDescription = this.getCoverTypeDescription();
        final Object other$coverTypeDescription = other.getCoverTypeDescription();
        Label_0398: {
            if (this$coverTypeDescription == null) {
                if (other$coverTypeDescription == null) {
                    break Label_0398;
                }
            }
            else if (this$coverTypeDescription.equals(other$coverTypeDescription)) {
                break Label_0398;
            }
            return false;
        }
        final Object this$riskValue = this.getRiskValue();
        final Object other$riskValue = other.getRiskValue();
        Label_0435: {
            if (this$riskValue == null) {
                if (other$riskValue == null) {
                    break Label_0435;
                }
            }
            else if (this$riskValue.equals(other$riskValue)) {
                break Label_0435;
            }
            return false;
        }
        final Object this$subClassShortDescription = this.getSubClassShortDescription();
        final Object other$subClassShortDescription = other.getSubClassShortDescription();
        Label_0472: {
            if (this$subClassShortDescription == null) {
                if (other$subClassShortDescription == null) {
                    break Label_0472;
                }
            }
            else if (this$subClassShortDescription.equals(other$subClassShortDescription)) {
                break Label_0472;
            }
            return false;
        }
        final Object this$riskIpuCode = this.getRiskIpuCode();
        final Object other$riskIpuCode = other.getRiskIpuCode();
        Label_0509: {
            if (this$riskIpuCode == null) {
                if (other$riskIpuCode == null) {
                    break Label_0509;
                }
            }
            else if (this$riskIpuCode.equals(other$riskIpuCode)) {
                break Label_0509;
            }
            return false;
        }
        final Object this$premium = this.getPremium();
        final Object other$premium = other.getPremium();
        Label_0546: {
            if (this$premium == null) {
                if (other$premium == null) {
                    break Label_0546;
                }
            }
            else if (this$premium.equals(other$premium)) {
                break Label_0546;
            }
            return false;
        }
        final Object this$clntwCode = this.getClntwCode();
        final Object other$clntwCode = other.getClntwCode();
        Label_0583: {
            if (this$clntwCode == null) {
                if (other$clntwCode == null) {
                    break Label_0583;
                }
            }
            else if (this$clntwCode.equals(other$clntwCode)) {
                break Label_0583;
            }
            return false;
        }
        final Object this$riskAddEdit = this.getRiskAddEdit();
        final Object other$riskAddEdit = other.getRiskAddEdit();
        Label_0620: {
            if (this$riskAddEdit == null) {
                if (other$riskAddEdit == null) {
                    break Label_0620;
                }
            }
            else if (this$riskAddEdit.equals(other$riskAddEdit)) {
                break Label_0620;
            }
            return false;
        }
        final Object this$prevSubClassShortDescription = this.getPrevSubClassShortDescription();
        final Object other$prevSubClassShortDescription = other.getPrevSubClassShortDescription();
        Label_0657: {
            if (this$prevSubClassShortDescription == null) {
                if (other$prevSubClassShortDescription == null) {
                    break Label_0657;
                }
            }
            else if (this$prevSubClassShortDescription.equals(other$prevSubClassShortDescription)) {
                break Label_0657;
            }
            return false;
        }
        final Object this$prevRiskId = this.getPrevRiskId();
        final Object other$prevRiskId = other.getPrevRiskId();
        if (this$prevRiskId == null) {
            if (other$prevRiskId == null) {
                return true;
            }
        }
        else if (this$prevRiskId.equals(other$prevRiskId)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof AgencyRiskInfo;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        final Object $binderShortDescription = this.getBinderShortDescription();
        result = result * 59 + (($binderShortDescription == null) ? 43 : $binderShortDescription.hashCode());
        final Object $riskCoverToDate = this.getRiskCoverToDate();
        result = result * 59 + (($riskCoverToDate == null) ? 43 : $riskCoverToDate.hashCode());
        final Object $riskCoverFromDate = this.getRiskCoverFromDate();
        result = result * 59 + (($riskCoverFromDate == null) ? 43 : $riskCoverFromDate.hashCode());
        final Object $coverTypeShortDescription = this.getCoverTypeShortDescription();
        result = result * 59 + (($coverTypeShortDescription == null) ? 43 : $coverTypeShortDescription.hashCode());
        final Object $coverTypeDescription = this.getCoverTypeDescription();
        result = result * 59 + (($coverTypeDescription == null) ? 43 : $coverTypeDescription.hashCode());
        final Object $riskValue = this.getRiskValue();
        result = result * 59 + (($riskValue == null) ? 43 : $riskValue.hashCode());
        final Object $subClassShortDescription = this.getSubClassShortDescription();
        result = result * 59 + (($subClassShortDescription == null) ? 43 : $subClassShortDescription.hashCode());
        final Object $riskIpuCode = this.getRiskIpuCode();
        result = result * 59 + (($riskIpuCode == null) ? 43 : $riskIpuCode.hashCode());
        final Object $premium = this.getPremium();
        result = result * 59 + (($premium == null) ? 43 : $premium.hashCode());
        final Object $clntwCode = this.getClntwCode();
        result = result * 59 + (($clntwCode == null) ? 43 : $clntwCode.hashCode());
        final Object $riskAddEdit = this.getRiskAddEdit();
        result = result * 59 + (($riskAddEdit == null) ? 43 : $riskAddEdit.hashCode());
        final Object $prevSubClassShortDescription = this.getPrevSubClassShortDescription();
        result = result * 59 + (($prevSubClassShortDescription == null) ? 43 : $prevSubClassShortDescription.hashCode());
        final Object $prevRiskId = this.getPrevRiskId();
        result = result * 59 + (($prevRiskId == null) ? 43 : $prevRiskId.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "AgencyRiskInfo(ipuwCode=" + this.getIpuwCode() + ", ipuId=" + this.getIpuId() + ", ipuPolwId=" + this.getIpuPolwId() + ", riskId=" + this.getRiskId() + ", riskDescription=" + this.getRiskDescription() + ", binderShortDescription=" + this.getBinderShortDescription() + ", riskCoverToDate=" + this.getRiskCoverToDate() + ", riskCoverFromDate=" + this.getRiskCoverFromDate() + ", coverTypeShortDescription=" + this.getCoverTypeShortDescription() + ", coverTypeDescription=" + this.getCoverTypeDescription() + ", riskValue=" + this.getRiskValue() + ", subClassShortDescription=" + this.getSubClassShortDescription() + ", riskIpuCode=" + this.getRiskIpuCode() + ", premium=" + this.getPremium() + ", clntwCode=" + this.getClntwCode() + ", riskAddEdit=" + this.getRiskAddEdit() + ", prevSubClassShortDescription=" + this.getPrevSubClassShortDescription() + ", prevRiskId=" + this.getPrevRiskId() + ")";
    }
}
