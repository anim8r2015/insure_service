// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.customer.models;

public class CustomerModel
{
    private String clientName;
    private String carRegNo;
    private String mobileNo;
    private String email;
    private String customerIdNo;
    private Double carValue;
    private String message;
    
    public String getClientName() {
        return this.clientName;
    }
    
    public String getCarRegNo() {
        return this.carRegNo;
    }
    
    public String getMobileNo() {
        return this.mobileNo;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getCustomerIdNo() {
        return this.customerIdNo;
    }
    
    public Double getCarValue() {
        return this.carValue;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setClientName(final String clientName) {
        this.clientName = clientName;
    }
    
    public void setCarRegNo(final String carRegNo) {
        this.carRegNo = carRegNo;
    }
    
    public void setMobileNo(final String mobileNo) {
        this.mobileNo = mobileNo;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public void setCustomerIdNo(final String customerIdNo) {
        this.customerIdNo = customerIdNo;
    }
    
    public void setCarValue(final Double carValue) {
        this.carValue = carValue;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CustomerModel)) {
            return false;
        }
        final CustomerModel other = (CustomerModel)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        final Object this$clientName = this.getClientName();
        final Object other$clientName = other.getClientName();
        Label_0065: {
            if (this$clientName == null) {
                if (other$clientName == null) {
                    break Label_0065;
                }
            }
            else if (this$clientName.equals(other$clientName)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$carRegNo = this.getCarRegNo();
        final Object other$carRegNo = other.getCarRegNo();
        Label_0102: {
            if (this$carRegNo == null) {
                if (other$carRegNo == null) {
                    break Label_0102;
                }
            }
            else if (this$carRegNo.equals(other$carRegNo)) {
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
        final Object this$customerIdNo = this.getCustomerIdNo();
        final Object other$customerIdNo = other.getCustomerIdNo();
        Label_0213: {
            if (this$customerIdNo == null) {
                if (other$customerIdNo == null) {
                    break Label_0213;
                }
            }
            else if (this$customerIdNo.equals(other$customerIdNo)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$carValue = this.getCarValue();
        final Object other$carValue = other.getCarValue();
        Label_0250: {
            if (this$carValue == null) {
                if (other$carValue == null) {
                    break Label_0250;
                }
            }
            else if (this$carValue.equals(other$carValue)) {
                break Label_0250;
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
        return other instanceof CustomerModel;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $clientName = this.getClientName();
        result = result * 59 + (($clientName == null) ? 43 : $clientName.hashCode());
        final Object $carRegNo = this.getCarRegNo();
        result = result * 59 + (($carRegNo == null) ? 43 : $carRegNo.hashCode());
        final Object $mobileNo = this.getMobileNo();
        result = result * 59 + (($mobileNo == null) ? 43 : $mobileNo.hashCode());
        final Object $email = this.getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        final Object $customerIdNo = this.getCustomerIdNo();
        result = result * 59 + (($customerIdNo == null) ? 43 : $customerIdNo.hashCode());
        final Object $carValue = this.getCarValue();
        result = result * 59 + (($carValue == null) ? 43 : $carValue.hashCode());
        final Object $message = this.getMessage();
        result = result * 59 + (($message == null) ? 43 : $message.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "CustomerModel(clientName=" + this.getClientName() + ", carRegNo=" + this.getCarRegNo() + ", mobileNo=" + this.getMobileNo() + ", email=" + this.getEmail() + ", customerIdNo=" + this.getCustomerIdNo() + ", carValue=" + this.getCarValue() + ", message=" + this.getMessage() + ")";
    }
}
