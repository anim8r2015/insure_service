// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.policy;

public class PaymentConfirmationResponse
{
    private String mpesaRef;
    private String transmittalNo;
    private String amount;
    private String receivedFrom;
    private String phoneNumber;
    private String receivedDate;
    private String receiptNo;
    
    public String getMpesaRef() {
        return this.mpesaRef;
    }
    
    public void setMpesaRef(final String mpesaRef) {
        this.mpesaRef = mpesaRef;
    }
    
    public String getTransmittalNo() {
        return this.transmittalNo;
    }
    
    public void setTransmittalNo(final String transmittalNo) {
        this.transmittalNo = transmittalNo;
    }
    
    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(final String amount) {
        this.amount = amount;
    }
    
    public String getReceivedFrom() {
        return this.receivedFrom;
    }
    
    public void setReceivedFrom(final String receivedFrom) {
        this.receivedFrom = receivedFrom;
    }
    
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getReceivedDate() {
        return this.receivedDate;
    }
    
    public void setReceivedDate(final String receivedDate) {
        this.receivedDate = receivedDate;
    }
    
    public String getReceiptNo() {
        return this.receiptNo;
    }
    
    public void setReceiptNo(final String receiptNo) {
        this.receiptNo = receiptNo;
    }
}
