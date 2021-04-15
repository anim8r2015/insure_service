// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.policy;

import java.math.BigDecimal;

public class MotorInfo
{
    private String regNo;
    private String coverType;
    private BigDecimal itemno;
    private String yrManft;
    private String engineNo;
    private String make;
    private String cubicCapacity;
    private String chasisNo;
    private String bodyType;
    private BigDecimal value;
    private String carryCapacity;
    
    public String getRegNo() {
        return this.regNo;
    }
    
    public String getCoverType() {
        return this.coverType;
    }
    
    public BigDecimal getItemno() {
        return this.itemno;
    }
    
    public String getYrManft() {
        return this.yrManft;
    }
    
    public String getEngineNo() {
        return this.engineNo;
    }
    
    public String getMake() {
        return this.make;
    }
    
    public String getCubicCapacity() {
        return this.cubicCapacity;
    }
    
    public String getChasisNo() {
        return this.chasisNo;
    }
    
    public String getBodyType() {
        return this.bodyType;
    }
    
    public BigDecimal getValue() {
        return this.value;
    }
    
    public String getCarryCapacity() {
        return this.carryCapacity;
    }
    
    public void setRegNo(final String regNo) {
        this.regNo = regNo;
    }
    
    public void setCoverType(final String coverType) {
        this.coverType = coverType;
    }
    
    public void setItemno(final BigDecimal itemno) {
        this.itemno = itemno;
    }
    
    public void setYrManft(final String yrManft) {
        this.yrManft = yrManft;
    }
    
    public void setEngineNo(final String engineNo) {
        this.engineNo = engineNo;
    }
    
    public void setMake(final String make) {
        this.make = make;
    }
    
    public void setCubicCapacity(final String cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }
    
    public void setChasisNo(final String chasisNo) {
        this.chasisNo = chasisNo;
    }
    
    public void setBodyType(final String bodyType) {
        this.bodyType = bodyType;
    }
    
    public void setValue(final BigDecimal value) {
        this.value = value;
    }
    
    public void setCarryCapacity(final String carryCapacity) {
        this.carryCapacity = carryCapacity;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MotorInfo)) {
            return false;
        }
        final MotorInfo other = (MotorInfo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$regNo = this.getRegNo();
        final Object other$regNo = other.getRegNo();
        Label_0065: {
            if (this$regNo == null) {
                if (other$regNo == null) {
                    break Label_0065;
                }
            }
            else if (this$regNo.equals(other$regNo)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$coverType = this.getCoverType();
        final Object other$coverType = other.getCoverType();
        Label_0102: {
            if (this$coverType == null) {
                if (other$coverType == null) {
                    break Label_0102;
                }
            }
            else if (this$coverType.equals(other$coverType)) {
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
        final Object this$yrManft = this.getYrManft();
        final Object other$yrManft = other.getYrManft();
        Label_0176: {
            if (this$yrManft == null) {
                if (other$yrManft == null) {
                    break Label_0176;
                }
            }
            else if (this$yrManft.equals(other$yrManft)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$engineNo = this.getEngineNo();
        final Object other$engineNo = other.getEngineNo();
        Label_0213: {
            if (this$engineNo == null) {
                if (other$engineNo == null) {
                    break Label_0213;
                }
            }
            else if (this$engineNo.equals(other$engineNo)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$make = this.getMake();
        final Object other$make = other.getMake();
        Label_0250: {
            if (this$make == null) {
                if (other$make == null) {
                    break Label_0250;
                }
            }
            else if (this$make.equals(other$make)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$cubicCapacity = this.getCubicCapacity();
        final Object other$cubicCapacity = other.getCubicCapacity();
        Label_0287: {
            if (this$cubicCapacity == null) {
                if (other$cubicCapacity == null) {
                    break Label_0287;
                }
            }
            else if (this$cubicCapacity.equals(other$cubicCapacity)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$chasisNo = this.getChasisNo();
        final Object other$chasisNo = other.getChasisNo();
        Label_0324: {
            if (this$chasisNo == null) {
                if (other$chasisNo == null) {
                    break Label_0324;
                }
            }
            else if (this$chasisNo.equals(other$chasisNo)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$bodyType = this.getBodyType();
        final Object other$bodyType = other.getBodyType();
        Label_0361: {
            if (this$bodyType == null) {
                if (other$bodyType == null) {
                    break Label_0361;
                }
            }
            else if (this$bodyType.equals(other$bodyType)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        Label_0398: {
            if (this$value == null) {
                if (other$value == null) {
                    break Label_0398;
                }
            }
            else if (this$value.equals(other$value)) {
                break Label_0398;
            }
            return false;
        }
        final Object this$carryCapacity = this.getCarryCapacity();
        final Object other$carryCapacity = other.getCarryCapacity();
        if (this$carryCapacity == null) {
            if (other$carryCapacity == null) {
                return true;
            }
        }
        else if (this$carryCapacity.equals(other$carryCapacity)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof MotorInfo;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $regNo = this.getRegNo();
        result = result * 59 + (($regNo == null) ? 43 : $regNo.hashCode());
        final Object $coverType = this.getCoverType();
        result = result * 59 + (($coverType == null) ? 43 : $coverType.hashCode());
        final Object $itemno = this.getItemno();
        result = result * 59 + (($itemno == null) ? 43 : $itemno.hashCode());
        final Object $yrManft = this.getYrManft();
        result = result * 59 + (($yrManft == null) ? 43 : $yrManft.hashCode());
        final Object $engineNo = this.getEngineNo();
        result = result * 59 + (($engineNo == null) ? 43 : $engineNo.hashCode());
        final Object $make = this.getMake();
        result = result * 59 + (($make == null) ? 43 : $make.hashCode());
        final Object $cubicCapacity = this.getCubicCapacity();
        result = result * 59 + (($cubicCapacity == null) ? 43 : $cubicCapacity.hashCode());
        final Object $chasisNo = this.getChasisNo();
        result = result * 59 + (($chasisNo == null) ? 43 : $chasisNo.hashCode());
        final Object $bodyType = this.getBodyType();
        result = result * 59 + (($bodyType == null) ? 43 : $bodyType.hashCode());
        final Object $value = this.getValue();
        result = result * 59 + (($value == null) ? 43 : $value.hashCode());
        final Object $carryCapacity = this.getCarryCapacity();
        result = result * 59 + (($carryCapacity == null) ? 43 : $carryCapacity.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "MotorInfo(regNo=" + this.getRegNo() + ", coverType=" + this.getCoverType() + ", itemno=" + this.getItemno() + ", yrManft=" + this.getYrManft() + ", engineNo=" + this.getEngineNo() + ", make=" + this.getMake() + ", cubicCapacity=" + this.getCubicCapacity() + ", chasisNo=" + this.getChasisNo() + ", bodyType=" + this.getBodyType() + ", value=" + this.getValue() + ", carryCapacity=" + this.getCarryCapacity() + ")";
    }
}
