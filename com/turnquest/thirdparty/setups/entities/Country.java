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
@Table(name = "tqc_countries", schema = "TQ_CRM")
public class Country implements Serializable
{
    @Id
    @Column(name = "cou_code", nullable = false)
    @SequenceGenerator(name = "TQC_COU_CODE_SEQ", schema = "TQ_CRM", allocationSize = 1)
    private BigDecimal code;
    @Column(name = "cou_sht_desc", length = 15, nullable = false)
    private String shtDesc;
    @Column(name = "cou_name", length = 50, nullable = false)
    private String name;
    @Column(name = "cou_base_curr", length = 22, nullable = true)
    private BigDecimal baseCurr;
    @Column(name = "cou_nationality", length = 50, nullable = false)
    private String nationality;
    @Column(name = "cou_zip_code", length = 22, nullable = true)
    private BigDecimal zipCode;
    @Column(name = "cou_schegen", length = 1, nullable = true)
    private String schegen;
    @Column(name = "cou_admin_reg_type", length = 20, nullable = true)
    private String adminRegType;
    @Column(name = "cou_admin_reg_mandatory", length = 1, nullable = true)
    private String adminRegMandatory;
    @Column(name = "cou_emb_code", length = 20, nullable = true)
    private String embCode;
    @Column(name = "cou_curr_serial", length = 22, nullable = true)
    private BigDecimal currSerial;
    @Column(name = "cou_mobile_prefix", length = 22, nullable = true)
    private BigDecimal mobilePrefix;
    @Column(name = "cou_client_number", length = 22, nullable = true)
    private BigDecimal clientNumber;
    
    public BigDecimal getCode() {
        return this.code;
    }
    
    public void setCode(final BigDecimal code) {
        this.code = code;
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
    
    public BigDecimal getBaseCurr() {
        return this.baseCurr;
    }
    
    public void setBaseCurr(final BigDecimal baseCurr) {
        this.baseCurr = baseCurr;
    }
    
    public String getNationality() {
        return this.nationality;
    }
    
    public void setNationality(final String nationality) {
        this.nationality = nationality;
    }
    
    public BigDecimal getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(final BigDecimal zipCode) {
        this.zipCode = zipCode;
    }
    
    public String getSchegen() {
        return this.schegen;
    }
    
    public void setSchegen(final String schegen) {
        this.schegen = schegen;
    }
    
    public String getAdminRegType() {
        return this.adminRegType;
    }
    
    public void setAdminRegType(final String adminRegType) {
        this.adminRegType = adminRegType;
    }
    
    public String getAdminRegMandatory() {
        return this.adminRegMandatory;
    }
    
    public void setAdminRegMandatory(final String adminRegMandatory) {
        this.adminRegMandatory = adminRegMandatory;
    }
    
    public String getEmbCode() {
        return this.embCode;
    }
    
    public void setEmbCode(final String embCode) {
        this.embCode = embCode;
    }
    
    public BigDecimal getCurrSerial() {
        return this.currSerial;
    }
    
    public void setCurrSerial(final BigDecimal currSerial) {
        this.currSerial = currSerial;
    }
    
    public BigDecimal getMobilePrefix() {
        return this.mobilePrefix;
    }
    
    public void setMobilePrefix(final BigDecimal mobilePrefix) {
        this.mobilePrefix = mobilePrefix;
    }
    
    public BigDecimal getClientNumber() {
        return this.clientNumber;
    }
    
    public void setClientNumber(final BigDecimal clientNumber) {
        this.clientNumber = clientNumber;
    }
    
    @Override
    public String toString() {
        return "Country [ code=" + this.code + ",shtDesc=" + this.shtDesc + ",name=" + this.name + ",baseCurr=" + this.baseCurr + ",nationality=" + this.nationality + ",zipCode=" + this.zipCode + ",schegen=" + this.schegen + ",adminRegType=" + this.adminRegType + ",adminRegMandatory=" + this.adminRegMandatory + ",embCode=" + this.embCode + ",currSerial=" + this.currSerial + ",mobilePrefix=" + this.mobilePrefix + ",clientNumber=" + this.clientNumber + " ]";
    }
}
