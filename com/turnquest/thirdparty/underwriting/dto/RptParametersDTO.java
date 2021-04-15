// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.dto;

import java.math.BigDecimal;

public class RptParametersDTO
{
    public String name;
    public BigDecimal value;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public BigDecimal getValue() {
        return this.value;
    }
    
    public void setValue(final BigDecimal value) {
        this.value = value;
    }
}
