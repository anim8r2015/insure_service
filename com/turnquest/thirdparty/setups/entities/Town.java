// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.setups.entities;

import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "tqc_towns", schema = "TQ_CRM")
public class Town implements Serializable
{
    @Id
    @Column(name = "twn_code", nullable = false)
    @SequenceGenerator(name = "TQC_TWN_CODE_SEQ", schema = "TQ_CRM", allocationSize = 1)
    private BigDecimal code;
    @Column(name = "twn_cou_code", length = 22, nullable = false)
    private BigDecimal couCode;
    @Column(name = "twn_sht_desc", length = 15, nullable = false)
    private String shtDesc;
    @Column(name = "twn_name", length = 50, nullable = false)
    private String name;
    @Column(name = "twn_sts_code", length = 22, nullable = true)
    private BigDecimal stsCode;
    
    public BigDecimal getCode() {
        return this.code;
    }
    
    public void setCode(final BigDecimal code) {
        this.code = code;
    }
    
    public BigDecimal getCouCode() {
        return this.couCode;
    }
    
    public void setCouCode(final BigDecimal couCode) {
        this.couCode = couCode;
    }
    
    public String getShtDesc() {
        return this.shtDesc;
    }
    
    public void setShtDesc(final String shtDesc) {
        this.shtDesc = shtDesc;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public BigDecimal getStsCode() {
        return this.stsCode;
    }
    
    public void setStsCode(final BigDecimal stsCode) {
        this.stsCode = stsCode;
    }
    
    @Override
    public String toString() {
        return "Town [ code=" + this.code + ",couCode=" + this.couCode + ",shtDesc=" + this.shtDesc + ",name=" + this.name + ",stsCode=" + this.stsCode + " ]";
    }
}
