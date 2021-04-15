// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.policy;

import java.math.BigDecimal;

public class AmlResponse
{
    private BigDecimal transCode;
    private String message;
    private String status;
    
    public AmlResponse() {
    }
    
    public AmlResponse(final BigDecimal transCode, final String message, final String status) {
        this.transCode = transCode;
        this.message = message;
        this.status = status;
    }
    
    public BigDecimal getTransCode() {
        return this.transCode;
    }
    
    public void setTransCode(final BigDecimal transCode) {
        this.transCode = transCode;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(final String status) {
        this.status = status;
    }
}
