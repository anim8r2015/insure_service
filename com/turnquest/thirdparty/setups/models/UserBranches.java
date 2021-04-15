// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.setups.models;

public class UserBranches
{
    private Long brnCode;
    private String brnName;
    private String brnShtDesc;
    private Long usrCode;
    private String username;
    
    public Long getBrnCode() {
        return this.brnCode;
    }
    
    public String getBrnName() {
        return this.brnName;
    }
    
    public String getBrnShtDesc() {
        return this.brnShtDesc;
    }
    
    public Long getUsrCode() {
        return this.usrCode;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setBrnCode(final Long brnCode) {
        this.brnCode = brnCode;
    }
    
    public void setBrnName(final String brnName) {
        this.brnName = brnName;
    }
    
    public void setBrnShtDesc(final String brnShtDesc) {
        this.brnShtDesc = brnShtDesc;
    }
    
    public void setUsrCode(final Long usrCode) {
        this.usrCode = usrCode;
    }
    
    public void setUsername(final String username) {
        this.username = username;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserBranches)) {
            return false;
        }
        final UserBranches other = (UserBranches)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$brnCode = this.getBrnCode();
        final Object other$brnCode = other.getBrnCode();
        Label_0065: {
            if (this$brnCode == null) {
                if (other$brnCode == null) {
                    break Label_0065;
                }
            }
            else if (this$brnCode.equals(other$brnCode)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$brnName = this.getBrnName();
        final Object other$brnName = other.getBrnName();
        Label_0102: {
            if (this$brnName == null) {
                if (other$brnName == null) {
                    break Label_0102;
                }
            }
            else if (this$brnName.equals(other$brnName)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$brnShtDesc = this.getBrnShtDesc();
        final Object other$brnShtDesc = other.getBrnShtDesc();
        Label_0139: {
            if (this$brnShtDesc == null) {
                if (other$brnShtDesc == null) {
                    break Label_0139;
                }
            }
            else if (this$brnShtDesc.equals(other$brnShtDesc)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$usrCode = this.getUsrCode();
        final Object other$usrCode = other.getUsrCode();
        Label_0176: {
            if (this$usrCode == null) {
                if (other$usrCode == null) {
                    break Label_0176;
                }
            }
            else if (this$usrCode.equals(other$usrCode)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null) {
            if (other$username == null) {
                return true;
            }
        }
        else if (this$username.equals(other$username)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof UserBranches;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $brnCode = this.getBrnCode();
        result = result * 59 + (($brnCode == null) ? 43 : $brnCode.hashCode());
        final Object $brnName = this.getBrnName();
        result = result * 59 + (($brnName == null) ? 43 : $brnName.hashCode());
        final Object $brnShtDesc = this.getBrnShtDesc();
        result = result * 59 + (($brnShtDesc == null) ? 43 : $brnShtDesc.hashCode());
        final Object $usrCode = this.getUsrCode();
        result = result * 59 + (($usrCode == null) ? 43 : $usrCode.hashCode());
        final Object $username = this.getUsername();
        result = result * 59 + (($username == null) ? 43 : $username.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "UserBranches(brnCode=" + this.getBrnCode() + ", brnName=" + this.getBrnName() + ", brnShtDesc=" + this.getBrnShtDesc() + ", usrCode=" + this.getUsrCode() + ", username=" + this.getUsername() + ")";
    }
}
