// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.customer.models;

import java.time.LocalDate;

public class Disbursement
{
    private String barCode;
    private String mPesaRef;
    private Double paymentAmount;
    private Double financingCost;
    private String carRegNo;
    private String mobileNo;
    private String email;
    private LocalDate dateCleared;
    private String message;
    
    public String getBarCode() {
        return this.barCode;
    }
    
    public String getMPesaRef() {
        return this.mPesaRef;
    }
    
    public Double getPaymentAmount() {
        return this.paymentAmount;
    }
    
    public Double getFinancingCost() {
        return this.financingCost;
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
    
    public LocalDate getDateCleared() {
        return this.dateCleared;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setBarCode(final String barCode) {
        this.barCode = barCode;
    }
    
    public void setMPesaRef(final String mPesaRef) {
        this.mPesaRef = mPesaRef;
    }
    
    public void setPaymentAmount(final Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
    
    public void setFinancingCost(final Double financingCost) {
        this.financingCost = financingCost;
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
    
    public void setDateCleared(final LocalDate dateCleared) {
        this.dateCleared = dateCleared;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Disbursement)) {
            return false;
        }
        final Disbursement other = (Disbursement)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        final Object this$barCode = this.getBarCode();
        final Object other$barCode = other.getBarCode();
        Label_0065: {
            if (this$barCode == null) {
                if (other$barCode == null) {
                    break Label_0065;
                }
            }
            else if (this$barCode.equals(other$barCode)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$mPesaRef = this.getMPesaRef();
        final Object other$mPesaRef = other.getMPesaRef();
        Label_0102: {
            if (this$mPesaRef == null) {
                if (other$mPesaRef == null) {
                    break Label_0102;
                }
            }
            else if (this$mPesaRef.equals(other$mPesaRef)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$paymentAmount = this.getPaymentAmount();
        final Object other$paymentAmount = other.getPaymentAmount();
        Label_0139: {
            if (this$paymentAmount == null) {
                if (other$paymentAmount == null) {
                    break Label_0139;
                }
            }
            else if (this$paymentAmount.equals(other$paymentAmount)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$financingCost = this.getFinancingCost();
        final Object other$financingCost = other.getFinancingCost();
        Label_0176: {
            if (this$financingCost == null) {
                if (other$financingCost == null) {
                    break Label_0176;
                }
            }
            else if (this$financingCost.equals(other$financingCost)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$carRegNo = this.getCarRegNo();
        final Object other$carRegNo = other.getCarRegNo();
        Label_0213: {
            if (this$carRegNo == null) {
                if (other$carRegNo == null) {
                    break Label_0213;
                }
            }
            else if (this$carRegNo.equals(other$carRegNo)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$mobileNo = this.getMobileNo();
        final Object other$mobileNo = other.getMobileNo();
        Label_0250: {
            if (this$mobileNo == null) {
                if (other$mobileNo == null) {
                    break Label_0250;
                }
            }
            else if (this$mobileNo.equals(other$mobileNo)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        Label_0287: {
            if (this$email == null) {
                if (other$email == null) {
                    break Label_0287;
                }
            }
            else if (this$email.equals(other$email)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$dateCleared = this.getDateCleared();
        final Object other$dateCleared = other.getDateCleared();
        Label_0324: {
            if (this$dateCleared == null) {
                if (other$dateCleared == null) {
                    break Label_0324;
                }
            }
            else if (this$dateCleared.equals(other$dateCleared)) {
                break Label_0324;
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
        return other instanceof Disbursement;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $barCode = this.getBarCode();
        result = result * 59 + (($barCode == null) ? 43 : $barCode.hashCode());
        final Object $mPesaRef = this.getMPesaRef();
        result = result * 59 + (($mPesaRef == null) ? 43 : $mPesaRef.hashCode());
        final Object $paymentAmount = this.getPaymentAmount();
        result = result * 59 + (($paymentAmount == null) ? 43 : $paymentAmount.hashCode());
        final Object $financingCost = this.getFinancingCost();
        result = result * 59 + (($financingCost == null) ? 43 : $financingCost.hashCode());
        final Object $carRegNo = this.getCarRegNo();
        result = result * 59 + (($carRegNo == null) ? 43 : $carRegNo.hashCode());
        final Object $mobileNo = this.getMobileNo();
        result = result * 59 + (($mobileNo == null) ? 43 : $mobileNo.hashCode());
        final Object $email = this.getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        final Object $dateCleared = this.getDateCleared();
        result = result * 59 + (($dateCleared == null) ? 43 : $dateCleared.hashCode());
        final Object $message = this.getMessage();
        result = result * 59 + (($message == null) ? 43 : $message.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Disbursement(barCode=" + this.getBarCode() + ", mPesaRef=" + this.getMPesaRef() + ", paymentAmount=" + this.getPaymentAmount() + ", financingCost=" + this.getFinancingCost() + ", carRegNo=" + this.getCarRegNo() + ", mobileNo=" + this.getMobileNo() + ", email=" + this.getEmail() + ", dateCleared=" + this.getDateCleared() + ", message=" + this.getMessage() + ")";
    }
}
