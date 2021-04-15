// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.setups.entities;

import java.sql.Timestamp;
import javax.persistence.Transient;
import java.math.BigDecimal;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "tqc_currencies", schema = "TQ_CRM")
public class Currency implements Serializable
{
    @Id
    @Column(name = "cur_code", nullable = false)
    @SequenceGenerator(name = "TQC_CUR_CODE_SEQ", schema = "TQ_CRM", allocationSize = 1)
    private Long code;
    @Column(name = "cur_symbol", length = 15, nullable = false)
    private String symbol;
    @Column(name = "cur_iso3", length = 3, nullable = false)
    private String iso3;
    @Column(name = "cur_iso2", length = 3, nullable = false)
    private String iso2;
    @Column(name = "cur_desc", length = 80, nullable = false)
    private String desc;
    @Column(name = "cur_rnd", length = 22, nullable = true)
    private BigDecimal rnd;
    @Transient
    private double rate;
    @Column(name = "cur_num_word", length = 50, nullable = true)
    private String numWord;
    @Column(name = "cur_decimal_word", length = 50, nullable = true)
    private String decimalWord;
    @Column(name = "cur_web_default", length = 1, nullable = false)
    private String webDefault;
    @Column(name = "cur_created_date", length = 11, nullable = true)
    private Timestamp createdDate;
    @Column(name = "cur_updated_date", length = 11, nullable = true)
    private Timestamp updatedDate;
    
    public String getIso3() {
        return this.iso3;
    }
    
    public void setIso3(final String iso3) {
        this.iso3 = iso3;
    }
    
    public String getIso2() {
        return this.iso2;
    }
    
    public void setIso2(final String iso2) {
        this.iso2 = iso2;
    }
    
    public double getRate() {
        return this.rate;
    }
    
    public void setRate(final double rate) {
        this.rate = rate;
    }
    
    public Long getCode() {
        return this.code;
    }
    
    public void setCode(final Long code) {
        this.code = code;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(final String symbol) {
        this.symbol = symbol;
    }
    
    public String getDesc() {
        return this.desc;
    }
    
    public void setDesc(final String desc) {
        this.desc = desc;
    }
    
    public BigDecimal getRnd() {
        return this.rnd;
    }
    
    public void setRnd(final BigDecimal rnd) {
        this.rnd = rnd;
    }
    
    public String getNumWord() {
        return this.numWord;
    }
    
    public void setNumWord(final String numWord) {
        this.numWord = numWord;
    }
    
    public String getDecimalWord() {
        return this.decimalWord;
    }
    
    public void setDecimalWord(final String decimalWord) {
        this.decimalWord = decimalWord;
    }
    
    public String getWebDefault() {
        return this.webDefault;
    }
    
    public void setWebDefault(final String webDefault) {
        this.webDefault = webDefault;
    }
    
    public Timestamp getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(final Timestamp createdDate) {
        this.createdDate = createdDate;
    }
    
    public Timestamp getUpdatedDate() {
        return this.updatedDate;
    }
    
    public void setUpdatedDate(final Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }
    
    @Override
    public String toString() {
        return "Currency [ code=" + this.code + ",symbol=" + this.symbol + ",desc=" + this.desc + ",rnd=" + this.rnd + ",numWord=" + this.numWord + ",decimalWord=" + this.decimalWord + ",webDefault=" + this.webDefault + ",createdDate=" + this.createdDate + ",updatedDate=" + this.updatedDate + " ]";
    }
}
