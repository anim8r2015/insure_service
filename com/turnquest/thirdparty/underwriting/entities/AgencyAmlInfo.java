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
@Table(name = "api_web_aml_rec")
public class AgencyAmlInfo implements Serializable
{
    @Id
    @Column(name = "camlw_code", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GIN_CAMLW_CODE_SEQ")
    @SequenceGenerator(name = "GIN_CAMLW_CODE_SEQ", schema = "TQ_GIS", allocationSize = 1, sequenceName = "TQ_GIS.GIN_CAMLW_CODE_SEQ")
    private BigDecimal camlwCode;
    @Column(name = "camlw_policy_no", length = 100, nullable = true)
    private String policyNo;
    @Column(name = "camlw_property_id", length = 26, nullable = true)
    private String riskId;
    @Column(name = "camlw_source_funds", length = 100, nullable = true)
    private String sourceOfFunds;
    @Column(name = "camlw_employed", length = 100, nullable = true)
    private String employed;
    @Column(name = "camlw_occupation", length = 100, nullable = true)
    private String occupation;
    @Column(name = "camlw_sector", length = 100, nullable = true)
    private String economicSector;
    @Column(name = "camlw_nationality", length = 100, nullable = true)
    private String nationality;
    @Column(name = "camlw_citizenship", length = 100, nullable = true)
    private String citizenship;
    @Column(name = "camlw_date", nullable = true)
    private Date camlwDate;
    
    public BigDecimal getCamlwCode() {
        return this.camlwCode;
    }
    
    public String getPolicyNo() {
        return this.policyNo;
    }
    
    public String getRiskId() {
        return this.riskId;
    }
    
    public String getSourceOfFunds() {
        return this.sourceOfFunds;
    }
    
    public String getEmployed() {
        return this.employed;
    }
    
    public String getOccupation() {
        return this.occupation;
    }
    
    public String getEconomicSector() {
        return this.economicSector;
    }
    
    public String getNationality() {
        return this.nationality;
    }
    
    public String getCitizenship() {
        return this.citizenship;
    }
    
    public Date getCamlwDate() {
        return this.camlwDate;
    }
    
    public void setCamlwCode(final BigDecimal camlwCode) {
        this.camlwCode = camlwCode;
    }
    
    public void setPolicyNo(final String policyNo) {
        this.policyNo = policyNo;
    }
    
    public void setRiskId(final String riskId) {
        this.riskId = riskId;
    }
    
    public void setSourceOfFunds(final String sourceOfFunds) {
        this.sourceOfFunds = sourceOfFunds;
    }
    
    public void setEmployed(final String employed) {
        this.employed = employed;
    }
    
    public void setOccupation(final String occupation) {
        this.occupation = occupation;
    }
    
    public void setEconomicSector(final String economicSector) {
        this.economicSector = economicSector;
    }
    
    public void setNationality(final String nationality) {
        this.nationality = nationality;
    }
    
    public void setCitizenship(final String citizenship) {
        this.citizenship = citizenship;
    }
    
    public void setCamlwDate(final Date camlwDate) {
        this.camlwDate = camlwDate;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgencyAmlInfo)) {
            return false;
        }
        final AgencyAmlInfo other = (AgencyAmlInfo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$camlwCode = this.getCamlwCode();
        final Object other$camlwCode = other.getCamlwCode();
        Label_0065: {
            if (this$camlwCode == null) {
                if (other$camlwCode == null) {
                    break Label_0065;
                }
            }
            else if (this$camlwCode.equals(other$camlwCode)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$policyNo = this.getPolicyNo();
        final Object other$policyNo = other.getPolicyNo();
        Label_0102: {
            if (this$policyNo == null) {
                if (other$policyNo == null) {
                    break Label_0102;
                }
            }
            else if (this$policyNo.equals(other$policyNo)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$riskId = this.getRiskId();
        final Object other$riskId = other.getRiskId();
        Label_0139: {
            if (this$riskId == null) {
                if (other$riskId == null) {
                    break Label_0139;
                }
            }
            else if (this$riskId.equals(other$riskId)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$sourceOfFunds = this.getSourceOfFunds();
        final Object other$sourceOfFunds = other.getSourceOfFunds();
        Label_0176: {
            if (this$sourceOfFunds == null) {
                if (other$sourceOfFunds == null) {
                    break Label_0176;
                }
            }
            else if (this$sourceOfFunds.equals(other$sourceOfFunds)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$employed = this.getEmployed();
        final Object other$employed = other.getEmployed();
        Label_0213: {
            if (this$employed == null) {
                if (other$employed == null) {
                    break Label_0213;
                }
            }
            else if (this$employed.equals(other$employed)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$occupation = this.getOccupation();
        final Object other$occupation = other.getOccupation();
        Label_0250: {
            if (this$occupation == null) {
                if (other$occupation == null) {
                    break Label_0250;
                }
            }
            else if (this$occupation.equals(other$occupation)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$economicSector = this.getEconomicSector();
        final Object other$economicSector = other.getEconomicSector();
        Label_0287: {
            if (this$economicSector == null) {
                if (other$economicSector == null) {
                    break Label_0287;
                }
            }
            else if (this$economicSector.equals(other$economicSector)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$nationality = this.getNationality();
        final Object other$nationality = other.getNationality();
        Label_0324: {
            if (this$nationality == null) {
                if (other$nationality == null) {
                    break Label_0324;
                }
            }
            else if (this$nationality.equals(other$nationality)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$citizenship = this.getCitizenship();
        final Object other$citizenship = other.getCitizenship();
        Label_0361: {
            if (this$citizenship == null) {
                if (other$citizenship == null) {
                    break Label_0361;
                }
            }
            else if (this$citizenship.equals(other$citizenship)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$camlwDate = this.getCamlwDate();
        final Object other$camlwDate = other.getCamlwDate();
        if (this$camlwDate == null) {
            if (other$camlwDate == null) {
                return true;
            }
        }
        else if (this$camlwDate.equals(other$camlwDate)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof AgencyAmlInfo;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $camlwCode = this.getCamlwCode();
        result = result * 59 + (($camlwCode == null) ? 43 : $camlwCode.hashCode());
        final Object $policyNo = this.getPolicyNo();
        result = result * 59 + (($policyNo == null) ? 43 : $policyNo.hashCode());
        final Object $riskId = this.getRiskId();
        result = result * 59 + (($riskId == null) ? 43 : $riskId.hashCode());
        final Object $sourceOfFunds = this.getSourceOfFunds();
        result = result * 59 + (($sourceOfFunds == null) ? 43 : $sourceOfFunds.hashCode());
        final Object $employed = this.getEmployed();
        result = result * 59 + (($employed == null) ? 43 : $employed.hashCode());
        final Object $occupation = this.getOccupation();
        result = result * 59 + (($occupation == null) ? 43 : $occupation.hashCode());
        final Object $economicSector = this.getEconomicSector();
        result = result * 59 + (($economicSector == null) ? 43 : $economicSector.hashCode());
        final Object $nationality = this.getNationality();
        result = result * 59 + (($nationality == null) ? 43 : $nationality.hashCode());
        final Object $citizenship = this.getCitizenship();
        result = result * 59 + (($citizenship == null) ? 43 : $citizenship.hashCode());
        final Object $camlwDate = this.getCamlwDate();
        result = result * 59 + (($camlwDate == null) ? 43 : $camlwDate.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "AgencyAmlInfo(camlwCode=" + this.getCamlwCode() + ", policyNo=" + this.getPolicyNo() + ", riskId=" + this.getRiskId() + ", sourceOfFunds=" + this.getSourceOfFunds() + ", employed=" + this.getEmployed() + ", occupation=" + this.getOccupation() + ", economicSector=" + this.getEconomicSector() + ", nationality=" + this.getNationality() + ", citizenship=" + this.getCitizenship() + ", camlwDate=" + this.getCamlwDate() + ")";
    }
}
