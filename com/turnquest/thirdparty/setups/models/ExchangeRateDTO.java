// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.setups.models;

import java.time.LocalDate;

public class ExchangeRateDTO
{
    private String fromIso3;
    private String toIso3;
    private Double amt;
    private LocalDate date;
    
    public String getFromIso3() {
        return this.fromIso3;
    }
    
    public void setFromIso3(final String fromIso3) {
        this.fromIso3 = fromIso3;
    }
    
    public String getToIso3() {
        return this.toIso3;
    }
    
    public void setToIso3(final String toIso3) {
        this.toIso3 = toIso3;
    }
    
    public Double getAmt() {
        return this.amt;
    }
    
    public void setAmt(final Double amt) {
        this.amt = amt;
    }
    
    public LocalDate getDate() {
        return this.date;
    }
    
    public void setDate(final LocalDate date) {
        this.date = date;
    }
}
