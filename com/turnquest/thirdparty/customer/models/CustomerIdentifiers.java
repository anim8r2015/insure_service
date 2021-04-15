// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.customer.models;

public class CustomerIdentifiers
{
    private String mobileNo;
    private String idNo;
    private String email;
    
    public String getMobileNo() {
        return this.mobileNo;
    }
    
    public String getIdNo() {
        return this.idNo;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setMobileNo(final String mobileNo) {
        this.mobileNo = mobileNo;
    }
    
    public void setIdNo(final String idNo) {
        this.idNo = idNo;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CustomerIdentifiers)) {
            return false;
        }
        final CustomerIdentifiers other = (CustomerIdentifiers)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$mobileNo = this.getMobileNo();
        final Object other$mobileNo = other.getMobileNo();
        Label_0065: {
            if (this$mobileNo == null) {
                if (other$mobileNo == null) {
                    break Label_0065;
                }
            }
            else if (this$mobileNo.equals(other$mobileNo)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$idNo = this.getIdNo();
        final Object other$idNo = other.getIdNo();
        Label_0102: {
            if (this$idNo == null) {
                if (other$idNo == null) {
                    break Label_0102;
                }
            }
            else if (this$idNo.equals(other$idNo)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null) {
            if (other$email == null) {
                return true;
            }
        }
        else if (this$email.equals(other$email)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof CustomerIdentifiers;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $mobileNo = this.getMobileNo();
        result = result * 59 + (($mobileNo == null) ? 43 : $mobileNo.hashCode());
        final Object $idNo = this.getIdNo();
        result = result * 59 + (($idNo == null) ? 43 : $idNo.hashCode());
        final Object $email = this.getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "CustomerIdentifiers(mobileNo=" + this.getMobileNo() + ", idNo=" + this.getIdNo() + ", email=" + this.getEmail() + ")";
    }
}
