// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.policy;

public class RiskAdditionalInfo
{
    private MotorInfo motor;
    
    public MotorInfo getMotor() {
        return this.motor;
    }
    
    public void setMotor(final MotorInfo motor) {
        this.motor = motor;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RiskAdditionalInfo)) {
            return false;
        }
        final RiskAdditionalInfo other = (RiskAdditionalInfo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$motor = this.getMotor();
        final Object other$motor = other.getMotor();
        if (this$motor == null) {
            if (other$motor == null) {
                return true;
            }
        }
        else if (this$motor.equals(other$motor)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof RiskAdditionalInfo;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $motor = this.getMotor();
        result = result * 59 + (($motor == null) ? 43 : $motor.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "RiskAdditionalInfo(motor=" + this.getMotor() + ")";
    }
}
