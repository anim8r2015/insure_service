// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.customer.models;

import java.time.LocalDate;

public class DefaultedFacility
{
    private String carRegNo;
    private String customerIdNo;
    private String mobileNo;
    private String email;
    private Double defaultedAmount;
    private LocalDate defaultedDate;
    private String barCode;
    private String message;
    
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
    
    public Double getDefaultedAmount() {
        return this.defaultedAmount;
    }
    
    public LocalDate getDefaultedDate() {
        return this.defaultedDate;
    }
    
    public String getBarCode() {
        return this.barCode;
    }
    
    public String getMessage() {
        return this.message;
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
    
    public void setDefaultedAmount(final Double defaultedAmount) {
        this.defaultedAmount = defaultedAmount;
    }
    
    public void setDefaultedDate(final LocalDate defaultedDate) {
        this.defaultedDate = defaultedDate;
    }
    
    public void setBarCode(final String barCode) {
        this.barCode = barCode;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DefaultedFacility)) {
            return false;
        }
        final DefaultedFacility other = (DefaultedFacility)o;
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
        final Object this$defaultedAmount = this.getDefaultedAmount();
        final Object other$defaultedAmount = other.getDefaultedAmount();
        Label_0213: {
            if (this$defaultedAmount == null) {
                if (other$defaultedAmount == null) {
                    break Label_0213;
                }
            }
            else if (this$defaultedAmount.equals(other$defaultedAmount)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$defaultedDate = this.getDefaultedDate();
        final Object other$defaultedDate = other.getDefaultedDate();
        Label_0250: {
            if (this$defaultedDate == null) {
                if (other$defaultedDate == null) {
                    break Label_0250;
                }
            }
            else if (this$defaultedDate.equals(other$defaultedDate)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$barCode = this.getBarCode();
        final Object other$barCode = other.getBarCode();
        Label_0287: {
            if (this$barCode == null) {
                if (other$barCode == null) {
                    break Label_0287;
                }
            }
            else if (this$barCode.equals(other$barCode)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null) {
            if (other$message == null) {
                return true;
            }
        }
        else if (this$message.equals(other$message)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof DefaultedFacility;
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
        final Object $defaultedAmount = this.getDefaultedAmount();
        result = result * 59 + (($defaultedAmount == null) ? 43 : $defaultedAmount.hashCode());
        final Object $defaultedDate = this.getDefaultedDate();
        result = result * 59 + (($defaultedDate == null) ? 43 : $defaultedDate.hashCode());
        final Object $barCode = this.getBarCode();
        result = result * 59 + (($barCode == null) ? 43 : $barCode.hashCode());
        final Object $message = this.getMessage();
        result = result * 59 + (($message == null) ? 43 : $message.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "DefaultedFacility(carRegNo=" + this.getCarRegNo() + ", customerIdNo=" + this.getCustomerIdNo() + ", mobileNo=" + this.getMobileNo() + ", email=" + this.getEmail() + ", defaultedAmount=" + this.getDefaultedAmount() + ", defaultedDate=" + this.getDefaultedDate() + ", barCode=" + this.getBarCode() + ", message=" + this.getMessage() + ")";
    }
}
