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
@Table(name = "api_web_motor_sch_rec")
public class AgencyMotorSchInfo implements Serializable
{
    @Id
    @Column(name = "msw_code", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GIN_MSW_CODE_SEQ")
    @SequenceGenerator(name = "GIN_MSW_CODE_SEQ", schema = "TQ_GIS", allocationSize = 1, sequenceName = "TQ_GIS.GIN_MSW_CODE_SEQ")
    private BigDecimal mswCode;
    @Column(name = "msw_ipuw_ipu_code")
    private BigDecimal riskIpuCode;
    @Column(name = "msw_item_no", length = 20, nullable = true)
    private BigDecimal itemno;
    @Column(name = "msw_reg_no", length = 26, nullable = true)
    private String regNo;
    @Column(name = "msw_make", length = 22, nullable = true)
    private String make;
    @Column(name = "msw_cubic_capacity", length = 22, nullable = true)
    private String cubicCapacity;
    @Column(name = "msw_yr_manft", length = 22, nullable = true)
    private String yrManft;
    @Column(name = "msw_carry_capacity", length = 22, nullable = true)
    private String carryCapacity;
    @Column(name = "msw_value", length = 22, nullable = true)
    private BigDecimal value;
    @Column(name = "msw_body_type", length = 22, nullable = true)
    private String bodyType;
    @Column(name = "msw_cover_type", length = 22, nullable = true)
    private String coverType;
    @Column(name = "msw_chasis_no", length = 22, nullable = true)
    private String chasisNo;
    @Column(name = "msw_engine_no", length = 22, nullable = true)
    private String engineNo;
    
    public BigDecimal getMswCode() {
        return this.mswCode;
    }
    
    public BigDecimal getRiskIpuCode() {
        return this.riskIpuCode;
    }
    
    public BigDecimal getItemno() {
        return this.itemno;
    }
    
    public String getRegNo() {
        return this.regNo;
    }
    
    public String getMake() {
        return this.make;
    }
    
    public String getCubicCapacity() {
        return this.cubicCapacity;
    }
    
    public String getYrManft() {
        return this.yrManft;
    }
    
    public String getCarryCapacity() {
        return this.carryCapacity;
    }
    
    public BigDecimal getValue() {
        return this.value;
    }
    
    public String getBodyType() {
        return this.bodyType;
    }
    
    public String getCoverType() {
        return this.coverType;
    }
    
    public String getChasisNo() {
        return this.chasisNo;
    }
    
    public String getEngineNo() {
        return this.engineNo;
    }
    
    public void setMswCode(final BigDecimal mswCode) {
        this.mswCode = mswCode;
    }
    
    public void setRiskIpuCode(final BigDecimal riskIpuCode) {
        this.riskIpuCode = riskIpuCode;
    }
    
    public void setItemno(final BigDecimal itemno) {
        this.itemno = itemno;
    }
    
    public void setRegNo(final String regNo) {
        this.regNo = regNo;
    }
    
    public void setMake(final String make) {
        this.make = make;
    }
    
    public void setCubicCapacity(final String cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }
    
    public void setYrManft(final String yrManft) {
        this.yrManft = yrManft;
    }
    
    public void setCarryCapacity(final String carryCapacity) {
        this.carryCapacity = carryCapacity;
    }
    
    public void setValue(final BigDecimal value) {
        this.value = value;
    }
    
    public void setBodyType(final String bodyType) {
        this.bodyType = bodyType;
    }
    
    public void setCoverType(final String coverType) {
        this.coverType = coverType;
    }
    
    public void setChasisNo(final String chasisNo) {
        this.chasisNo = chasisNo;
    }
    
    public void setEngineNo(final String engineNo) {
        this.engineNo = engineNo;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgencyMotorSchInfo)) {
            return false;
        }
        final AgencyMotorSchInfo other = (AgencyMotorSchInfo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$mswCode = this.getMswCode();
        final Object other$mswCode = other.getMswCode();
        Label_0065: {
            if (this$mswCode == null) {
                if (other$mswCode == null) {
                    break Label_0065;
                }
            }
            else if (this$mswCode.equals(other$mswCode)) {
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
        final Object this$itemno = this.getItemno();
        final Object other$itemno = other.getItemno();
        Label_0139: {
            if (this$itemno == null) {
                if (other$itemno == null) {
                    break Label_0139;
                }
            }
            else if (this$itemno.equals(other$itemno)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$regNo = this.getRegNo();
        final Object other$regNo = other.getRegNo();
        Label_0176: {
            if (this$regNo == null) {
                if (other$regNo == null) {
                    break Label_0176;
                }
            }
            else if (this$regNo.equals(other$regNo)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$make = this.getMake();
        final Object other$make = other.getMake();
        Label_0213: {
            if (this$make == null) {
                if (other$make == null) {
                    break Label_0213;
                }
            }
            else if (this$make.equals(other$make)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$cubicCapacity = this.getCubicCapacity();
        final Object other$cubicCapacity = other.getCubicCapacity();
        Label_0250: {
            if (this$cubicCapacity == null) {
                if (other$cubicCapacity == null) {
                    break Label_0250;
                }
            }
            else if (this$cubicCapacity.equals(other$cubicCapacity)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$yrManft = this.getYrManft();
        final Object other$yrManft = other.getYrManft();
        Label_0287: {
            if (this$yrManft == null) {
                if (other$yrManft == null) {
                    break Label_0287;
                }
            }
            else if (this$yrManft.equals(other$yrManft)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$carryCapacity = this.getCarryCapacity();
        final Object other$carryCapacity = other.getCarryCapacity();
        Label_0324: {
            if (this$carryCapacity == null) {
                if (other$carryCapacity == null) {
                    break Label_0324;
                }
            }
            else if (this$carryCapacity.equals(other$carryCapacity)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        Label_0361: {
            if (this$value == null) {
                if (other$value == null) {
                    break Label_0361;
                }
            }
            else if (this$value.equals(other$value)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$bodyType = this.getBodyType();
        final Object other$bodyType = other.getBodyType();
        Label_0398: {
            if (this$bodyType == null) {
                if (other$bodyType == null) {
                    break Label_0398;
                }
            }
            else if (this$bodyType.equals(other$bodyType)) {
                break Label_0398;
            }
            return false;
        }
        final Object this$coverType = this.getCoverType();
        final Object other$coverType = other.getCoverType();
        Label_0435: {
            if (this$coverType == null) {
                if (other$coverType == null) {
                    break Label_0435;
                }
            }
            else if (this$coverType.equals(other$coverType)) {
                break Label_0435;
            }
            return false;
        }
        final Object this$chasisNo = this.getChasisNo();
        final Object other$chasisNo = other.getChasisNo();
        Label_0472: {
            if (this$chasisNo == null) {
                if (other$chasisNo == null) {
                    break Label_0472;
                }
            }
            else if (this$chasisNo.equals(other$chasisNo)) {
                break Label_0472;
            }
            return false;
        }
        final Object this$engineNo = this.getEngineNo();
        final Object other$engineNo = other.getEngineNo();
        if (this$engineNo == null) {
            if (other$engineNo == null) {
                return true;
            }
        }
        else if (this$engineNo.equals(other$engineNo)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof AgencyMotorSchInfo;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $mswCode = this.getMswCode();
        result = result * 59 + (($mswCode == null) ? 43 : $mswCode.hashCode());
        final Object $riskIpuCode = this.getRiskIpuCode();
        result = result * 59 + (($riskIpuCode == null) ? 43 : $riskIpuCode.hashCode());
        final Object $itemno = this.getItemno();
        result = result * 59 + (($itemno == null) ? 43 : $itemno.hashCode());
        final Object $regNo = this.getRegNo();
        result = result * 59 + (($regNo == null) ? 43 : $regNo.hashCode());
        final Object $make = this.getMake();
        result = result * 59 + (($make == null) ? 43 : $make.hashCode());
        final Object $cubicCapacity = this.getCubicCapacity();
        result = result * 59 + (($cubicCapacity == null) ? 43 : $cubicCapacity.hashCode());
        final Object $yrManft = this.getYrManft();
        result = result * 59 + (($yrManft == null) ? 43 : $yrManft.hashCode());
        final Object $carryCapacity = this.getCarryCapacity();
        result = result * 59 + (($carryCapacity == null) ? 43 : $carryCapacity.hashCode());
        final Object $value = this.getValue();
        result = result * 59 + (($value == null) ? 43 : $value.hashCode());
        final Object $bodyType = this.getBodyType();
        result = result * 59 + (($bodyType == null) ? 43 : $bodyType.hashCode());
        final Object $coverType = this.getCoverType();
        result = result * 59 + (($coverType == null) ? 43 : $coverType.hashCode());
        final Object $chasisNo = this.getChasisNo();
        result = result * 59 + (($chasisNo == null) ? 43 : $chasisNo.hashCode());
        final Object $engineNo = this.getEngineNo();
        result = result * 59 + (($engineNo == null) ? 43 : $engineNo.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "AgencyMotorSchInfo(mswCode=" + this.getMswCode() + ", riskIpuCode=" + this.getRiskIpuCode() + ", itemno=" + this.getItemno() + ", regNo=" + this.getRegNo() + ", make=" + this.getMake() + ", cubicCapacity=" + this.getCubicCapacity() + ", yrManft=" + this.getYrManft() + ", carryCapacity=" + this.getCarryCapacity() + ", value=" + this.getValue() + ", bodyType=" + this.getBodyType() + ", coverType=" + this.getCoverType() + ", chasisNo=" + this.getChasisNo() + ", engineNo=" + this.getEngineNo() + ")";
    }
}
