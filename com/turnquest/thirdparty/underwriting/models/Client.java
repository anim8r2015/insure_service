// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.models;

import java.time.LocalDate;
import java.math.BigDecimal;

public class Client
{
    private BigDecimal code;
    private String shtDesc;
    private String clientName;
    private String otherNames;
    private String idRegNo;
    private LocalDate dob;
    private String pin;
    private String physicalAddrs;
    private String postalAddrs;
    private BigDecimal twnCode;
    private BigDecimal couCode;
    private String emailAddrs;
    private String tel;
    private String tel2;
    private LocalDate wef;
    private LocalDate wet;
    private String smsTel;
    private String status;
    private String clntSmsPrefix;
    private String surName;
    
    public String getSurName() {
        return this.surName;
    }
    
    public void setSurName(final String surName) {
        this.surName = surName;
    }
    
    public String getClntSmsPrefix() {
        return this.clntSmsPrefix;
    }
    
    public void setClntSmsPrefix(final String clntSmsPrefix) {
        this.clntSmsPrefix = clntSmsPrefix;
    }
    
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
    
    public String getClientName() {
        return this.clientName;
    }
    
    public void setClientName(final String clientName) {
        this.clientName = clientName;
    }
    
    public String getOtherNames() {
        return this.otherNames;
    }
    
    public void setOtherNames(final String otherNames) {
        this.otherNames = otherNames;
    }
    
    public String getIdRegNo() {
        return this.idRegNo;
    }
    
    public void setIdRegNo(final String idRegNo) {
        this.idRegNo = idRegNo;
    }
    
    public LocalDate getDob() {
        return this.dob;
    }
    
    public void setDob(final LocalDate dob) {
        this.dob = dob;
    }
    
    public String getPin() {
        return this.pin;
    }
    
    public void setPin(final String pin) {
        this.pin = pin;
    }
    
    public String getPhysicalAddrs() {
        return this.physicalAddrs;
    }
    
    public void setPhysicalAddrs(final String physicalAddrs) {
        this.physicalAddrs = physicalAddrs;
    }
    
    public String getPostalAddrs() {
        return this.postalAddrs;
    }
    
    public void setPostalAddrs(final String postalAddrs) {
        this.postalAddrs = postalAddrs;
    }
    
    public BigDecimal getTwnCode() {
        return this.twnCode;
    }
    
    public void setTwnCode(final BigDecimal twnCode) {
        this.twnCode = twnCode;
    }
    
    public BigDecimal getCouCode() {
        return this.couCode;
    }
    
    public void setCouCode(final BigDecimal couCode) {
        this.couCode = couCode;
    }
    
    public String getEmailAddrs() {
        return this.emailAddrs;
    }
    
    public void setEmailAddrs(final String emailAddrs) {
        this.emailAddrs = emailAddrs;
    }
    
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(final String tel) {
        this.tel = tel;
    }
    
    public String getTel2() {
        return this.tel2;
    }
    
    public void setTel2(final String tel2) {
        this.tel2 = tel2;
    }
    
    public LocalDate getWef() {
        return this.wef;
    }
    
    public void setWef(final LocalDate wef) {
        this.wef = wef;
    }
    
    public LocalDate getWet() {
        return this.wet;
    }
    
    public void setWet(final LocalDate wet) {
        this.wet = wet;
    }
    
    public String getSmsTel() {
        return this.smsTel;
    }
    
    public void setSmsTel(final String smsTel) {
        this.smsTel = smsTel;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(final String status) {
        this.status = status;
    }
}
