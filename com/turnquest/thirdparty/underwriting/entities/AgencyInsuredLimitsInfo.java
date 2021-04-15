// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.entities;

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
@Table(name = "api_web_insured_limits_rec")
public class AgencyInsuredLimitsInfo implements Serializable
{
    @Id
    @Column(name = "pilw_code", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GIN_PILW_CODE_SEQ")
    @SequenceGenerator(name = "GIN_PILW_CODE_SEQ", schema = "TQ_GIS", allocationSize = 1, sequenceName = "TQ_GIS.GIN_PILW_CODE_SEQ")
    private BigDecimal pilwCode;
    @Column(name = "pilw_ipuw_ipu_code")
    private BigDecimal riskIpuCode;
    @Column(name = "pilw_sect_sht_desc", length = 20, nullable = true)
    private String shortDescription;
    @Column(name = "pilw_sect_desc", length = 26, nullable = true)
    private String description;
    @Column(name = "pilw_limit_amt", length = 22, nullable = true)
    private BigDecimal limitAmount;
    @Column(name = "pilw_prem_rate", length = 22, nullable = true)
    private BigDecimal premRate;
    
    public BigDecimal getPilwCode() {
        return this.pilwCode;
    }
    
    public BigDecimal getRiskIpuCode() {
        return this.riskIpuCode;
    }
    
    public String getShortDescription() {
        return this.shortDescription;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public BigDecimal getLimitAmount() {
        return this.limitAmount;
    }
    
    public BigDecimal getPremRate() {
        return this.premRate;
    }
    
    public void setPilwCode(final BigDecimal pilwCode) {
        this.pilwCode = pilwCode;
    }
    
    public void setRiskIpuCode(final BigDecimal riskIpuCode) {
        this.riskIpuCode = riskIpuCode;
    }
    
    public void setShortDescription(final String shortDescription) {
        this.shortDescription = shortDescription;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public void setLimitAmount(final BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }
    
    public void setPremRate(final BigDecimal premRate) {
        this.premRate = premRate;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgencyInsuredLimitsInfo)) {
            return false;
        }
        final AgencyInsuredLimitsInfo other = (AgencyInsuredLimitsInfo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$pilwCode = this.getPilwCode();
        final Object other$pilwCode = other.getPilwCode();
        Label_0065: {
            if (this$pilwCode == null) {
                if (other$pilwCode == null) {
                    break Label_0065;
                }
            }
            else if (this$pilwCode.equals(other$pilwCode)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$riskIpuCode = this.getRiskIpuCode();
        final Object other$riskIpuCode = other.getRiskIpuCode();
        Label_0102: {
            if (this$riskIpuCode == null) {
                if (other$riskIpuCode == null) {
                    break Label_0102;
                }
            }
            else if (this$riskIpuCode.equals(other$riskIpuCode)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$shortDescription = this.getShortDescription();
        final Object other$shortDescription = other.getShortDescription();
        Label_0139: {
            if (this$shortDescription == null) {
                if (other$shortDescription == null) {
                    break Label_0139;
                }
            }
            else if (this$shortDescription.equals(other$shortDescription)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        Label_0176: {
            if (this$description == null) {
                if (other$description == null) {
                    break Label_0176;
                }
            }
            else if (this$description.equals(other$description)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$limitAmount = this.getLimitAmount();
        final Object other$limitAmount = other.getLimitAmount();
        Label_0213: {
            if (this$limitAmount == null) {
                if (other$limitAmount == null) {
                    break Label_0213;
                }
            }
            else if (this$limitAmount.equals(other$limitAmount)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$premRate = this.getPremRate();
        final Object other$premRate = other.getPremRate();
        if (this$premRate == null) {
            if (other$premRate == null) {
                return true;
            }
        }
        else if (this$premRate.equals(other$premRate)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof AgencyInsuredLimitsInfo;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $pilwCode = this.getPilwCode();
        result = result * 59 + (($pilwCode == null) ? 43 : $pilwCode.hashCode());
        final Object $riskIpuCode = this.getRiskIpuCode();
        result = result * 59 + (($riskIpuCode == null) ? 43 : $riskIpuCode.hashCode());
        final Object $shortDescription = this.getShortDescription();
        result = result * 59 + (($shortDescription == null) ? 43 : $shortDescription.hashCode());
        final Object $description = this.getDescription();
        result = result * 59 + (($description == null) ? 43 : $description.hashCode());
        final Object $limitAmount = this.getLimitAmount();
        result = result * 59 + (($limitAmount == null) ? 43 : $limitAmount.hashCode());
        final Object $premRate = this.getPremRate();
        result = result * 59 + (($premRate == null) ? 43 : $premRate.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "AgencyInsuredLimitsInfo(pilwCode=" + this.getPilwCode() + ", riskIpuCode=" + this.getRiskIpuCode() + ", shortDescription=" + this.getShortDescription() + ", description=" + this.getDescription() + ", limitAmount=" + this.getLimitAmount() + ", premRate=" + this.getPremRate() + ")";
    }
}
