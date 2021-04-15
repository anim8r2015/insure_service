// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.dto;

import java.math.BigDecimal;

public class BrkResponseDTO
{
    private String status;
    private String message;
    private BigDecimal transCode;
    
    public BrkResponseDTO() {
    }
    
    public BrkResponseDTO(final String status, final String message, final BigDecimal transCode) {
        this.status = status;
        this.message = message;
        this.transCode = transCode;
    }
    
    public BigDecimal getTransCode() {
        return this.transCode;
    }
    
    public void setTransCode(final BigDecimal transCode) {
        this.transCode = transCode;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(final String status) {
        this.status = status;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
}
