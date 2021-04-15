// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.dto;

import java.math.BigDecimal;
import java.util.List;

public class RptParametersDTOWrapper
{
    public String encodeFormat;
    private List<RptParametersDTO> params;
    public String reportFormat;
    public BigDecimal rptCode;
    
    public String getEncodeFormat() {
        return this.encodeFormat;
    }
    
    public void setEncodeFormat(final String encodeFormat) {
        this.encodeFormat = encodeFormat;
    }
    
    public List<RptParametersDTO> getParams() {
        return this.params;
    }
    
    public void setParams(final List<RptParametersDTO> params) {
        this.params = params;
    }
    
    public String getReportFormat() {
        return this.reportFormat;
    }
    
    public void setReportFormat(final String reportFormat) {
        this.reportFormat = reportFormat;
    }
    
    public BigDecimal getRptCode() {
        return this.rptCode;
    }
    
    public void setRptCode(final BigDecimal rptCode) {
        this.rptCode = rptCode;
    }
}
