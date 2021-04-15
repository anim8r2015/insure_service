// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.customer.models;

import java.time.LocalDate;

public class ClearedFacility
{
    private String carRegNo;
    private String customerIdNo;
    private String mobileNo;
    private String email;
    private LocalDate dateCleared;
    private String message;
    private String barCode;
    
    public String getCarRegNo() {
        return this.carRegNo;
    }
    
    public String getCustomerIdNo() {
        return this.customerIdNo;
    }
    
    public String getMobileNo() {
        return this.mobileNo;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public LocalDate getDateCleared() {
        return this.dateCleared;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public String getBarCode() {
        return this.barCode;
    }
    
    public void setCarRegNo(final String carRegNo) {
        this.carRegNo = carRegNo;
    }
    
    public void setCustomerIdNo(final String customerIdNo) {
        this.customerIdNo = customerIdNo;
    }
    
    public void setMobileNo(final String mobileNo) {
        this.mobileNo = mobileNo;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public void setDateCleared(final LocalDate dateCleared) {
        this.dateCleared = dateCleared;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    public void setBarCode(final String barCode) {
        this.barCode = barCode;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ClearedFacility)) {
            return false;
        }
        final ClearedFacility other = (ClearedFacility)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        final Object this$carRegNo = this.getCarRegNo();
        final Object other$carRegNo = other.getCarRegNo();
        Label_0065: {
            if (this$carRegNo == null) {
                if (other$carRegNo == null) {
                    break Label_0065;
                }
            }
            else if (this$carRegNo.equals(other$carRegNo)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$customerIdNo = this.getCustomerIdNo();
        final Object other$customerIdNo = other.getCustomerIdNo();
        Label_0102: {
            if (this$customerIdNo == null) {
                if (other$customerIdNo == null) {
                    break Label_0102;
                }
            }
            else if (this$customerIdNo.equals(other$customerIdNo)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$mobileNo = this.getMobileNo();
        final Object other$mobileNo = other.getMobileNo();
        Label_0139: {
            if (this$mobileNo == null) {
                if (other$mobileNo == null) {
                    break Label_0139;
                }
            }
            else if (this$mobileNo.equals(other$mobileNo)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        Label_0176: {
            if (this$email == null) {
                if (other$email == null) {
                    break Label_0176;
                }
            }
            else if (this$email.equals(other$email)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$dateCleared = this.getDateCleared();
        final Object other$dateCleared = other.getDateCleared();
        Label_0213: {
            if (this$dateCleared == null) {
                if (other$dateCleared == null) {
                    break Label_0213;
                }
            }
            else if (this$dateCleared.equals(other$dateCleared)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        Label_0250: {
            if (this$message == null) {
                if (other$message == null) {
                    break Label_0250;
                }
            }
            else if (this$message.equals(other$message)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$barCode = this.getBarCode();
        final Object other$barCode = other.getBarCode();
        if (this$barCode == null) {
            if (other$barCode == null) {
                return true;
            }
        }
        else if (this$barCode.equals(other$barCode)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof ClearedFacility;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $carRegNo = this.getCarRegNo();
        result = result * 59 + (($carRegNo == null) ? 43 : $carRegNo.hashCode());
        final Object $customerIdNo = this.getCustomerIdNo();
        result = result * 59 + (($customerIdNo == null) ? 43 : $customerIdNo.hashCode());
        final Object $mobileNo = this.getMobileNo();
        result = result * 59 + (($mobileNo == null) ? 43 : $mobileNo.hashCode());
        final Object $email = this.getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        final Object $dateCleared = this.getDateCleared();
        result = result * 59 + (($dateCleared == null) ? 43 : $dateCleared.hashCode());
        final Object $message = this.getMessage();
        result = result * 59 + (($message == null) ? 43 : $message.hashCode());
        final Object $barCode = this.getBarCode();
        result = result * 59 + (($barCode == null) ? 43 : $barCode.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "ClearedFacility(carRegNo=" + this.getCarRegNo() + ", customerIdNo=" + this.getCustomerIdNo() + ", mobileNo=" + this.getMobileNo() + ", email=" + this.getEmail() + ", dateCleared=" + this.getDateCleared() + ", message=" + this.getMessage() + ", barCode=" + this.getBarCode() + ")";
    }
}
