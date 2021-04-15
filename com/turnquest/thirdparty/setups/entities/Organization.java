// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.setups.entities;

import java.util.Arrays;
import java.sql.Blob;
import java.math.BigDecimal;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "TQC_ORGANIZATIONS", schema = "TQ_CRM")
public class Organization implements Serializable
{
    @Id
    @Column(name = "org_code", nullable = false)
    @SequenceGenerator(name = "TQC_ORG_CODE_SEQ", schema = "TQ_CRM", allocationSize = 1)
    private Long code;
    @Column(name = "org_sht_desc", length = 20, nullable = false)
    private String shtDesc;
    @Column(name = "org_name", length = 100, nullable = false)
    private String name;
    @Column(name = "org_addrs", length = 100, nullable = true)
    private String addrs;
    @Column(name = "org_twn_code", length = 22, nullable = true)
    private BigDecimal twnCode;
    @Column(name = "org_cou_code", length = 22, nullable = true)
    private BigDecimal couCode;
    @Column(name = "org_email_addrs", length = 150, nullable = true)
    private String emailAddrs;
    @Column(name = "org_phy_addrs", length = 150, nullable = true)
    private String phyAddrs;
    @Column(name = "org_cur_code", length = 22, nullable = true)
    private Long curCode;
    @Column(name = "org_zip", length = 15, nullable = true)
    private String zip;
    @Column(name = "org_fax", length = 50, nullable = true)
    private String fax;
    @Column(name = "org_tel1", length = 50, nullable = true)
    private String tel1;
    @Column(name = "org_tel2", length = 30, nullable = true)
    private String tel2;
    @Column(name = "org_rpt_logo", length = 86, nullable = true)
    private Blob rptLogo;
    @Column(name = "org_motto", length = 2000, nullable = true)
    private String motto;
    @Column(name = "org_pin_no", length = 30, nullable = true)
    private String pinNo;
    @Column(name = "org_ed_code", length = 15, nullable = true)
    private String edCode;
    @Column(name = "org_item_acc_code", length = 15, nullable = true)
    private String itemAccCode;
    @Column(name = "org_other_name", length = 35, nullable = true)
    private String otherName;
    @Column(name = "org_type", length = 3, nullable = true)
    private String type;
    @Column(name = "org_web_brn_code", length = 22, nullable = true)
    private Long webBrnCode;
    @Column(name = "org_web_addrs", length = 150, nullable = true)
    private String webAddrs;
    @Column(name = "org_agn_code", length = 22, nullable = true)
    private BigDecimal agnCode;
    @Column(name = "org_directors", length = 2000, nullable = true)
    private String directors;
    @Column(name = "org_lang_code", length = 22, nullable = true)
    private BigDecimal langCode;
    @Column(name = "org_avatar", length = 86, nullable = true)
    private Blob avatar;
    @Column(name = "org_logo_b64", length = 86, nullable = true)
    private Blob logoB64;
    @Column(name = "org_alt_brn_code", length = 22, nullable = true)
    private BigDecimal altBrnCode;
    @Column(name = "org_sts_code", length = 22, nullable = true)
    private BigDecimal stsCode;
    @Column(name = "org_grp_logo", length = 86, nullable = true)
    private Blob grpLogo;
    @Column(name = "org_regulator_logo", length = 86, nullable = true)
    private Blob regulatorLogo;
    @Column(name = "org_exec_director", length = 100, nullable = true)
    private String execDirector;
    @Column(name = "org_managing_director", length = 100, nullable = true)
    private String managingDirector;
    @Column(name = "org_cert_name", length = 100, nullable = true)
    private String certName;
    @Column(name = "org_kra_tax_reg", length = 30, nullable = true)
    private String kraTaxReg;
    @Column(name = "org_vat_number", length = 22, nullable = true)
    private BigDecimal vatNumber;
    @Column(name = "org_logo4", length = 0, nullable = true)
    private byte[] logo4;
    @Column(name = "org_mobile1", length = 50, nullable = true)
    private String mobile1;
    @Column(name = "org_mobile2", length = 50, nullable = true)
    private String mobile2;
    @Column(name = "org_cert_sign", length = 86, nullable = true)
    private Blob certSign;
    @Column(name = "org_bnk_code", length = 22, nullable = true)
    private BigDecimal bnkCode;
    @Column(name = "org_bbr_code", length = 22, nullable = true)
    private BigDecimal bbrCode;
    @Column(name = "org_bank_account_no", length = 20, nullable = true)
    private String bankAccountNo;
    @Column(name = "org_bank_account_name", length = 100, nullable = true)
    private String bankAccountName;
    @Column(name = "org_swift_code", length = 40, nullable = true)
    private String swiftCode;
    
    public Long getCode() {
        return this.code;
    }
    
    public String getShtDesc() {
        return this.shtDesc;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getAddrs() {
        return this.addrs;
    }
    
    public BigDecimal getTwnCode() {
        return this.twnCode;
    }
    
    public BigDecimal getCouCode() {
        return this.couCode;
    }
    
    public String getEmailAddrs() {
        return this.emailAddrs;
    }
    
    public String getPhyAddrs() {
        return this.phyAddrs;
    }
    
    public Long getCurCode() {
        return this.curCode;
    }
    
    public String getZip() {
        return this.zip;
    }
    
    public String getFax() {
        return this.fax;
    }
    
    public String getTel1() {
        return this.tel1;
    }
    
    public String getTel2() {
        return this.tel2;
    }
    
    public Blob getRptLogo() {
        return this.rptLogo;
    }
    
    public String getMotto() {
        return this.motto;
    }
    
    public String getPinNo() {
        return this.pinNo;
    }
    
    public String getEdCode() {
        return this.edCode;
    }
    
    public String getItemAccCode() {
        return this.itemAccCode;
    }
    
    public String getOtherName() {
        return this.otherName;
    }
    
    public String getType() {
        return this.type;
    }
    
    public Long getWebBrnCode() {
        return this.webBrnCode;
    }
    
    public String getWebAddrs() {
        return this.webAddrs;
    }
    
    public BigDecimal getAgnCode() {
        return this.agnCode;
    }
    
    public String getDirectors() {
        return this.directors;
    }
    
    public BigDecimal getLangCode() {
        return this.langCode;
    }
    
    public Blob getAvatar() {
        return this.avatar;
    }
    
    public Blob getLogoB64() {
        return this.logoB64;
    }
    
    public BigDecimal getAltBrnCode() {
        return this.altBrnCode;
    }
    
    public BigDecimal getStsCode() {
        return this.stsCode;
    }
    
    public Blob getGrpLogo() {
        return this.grpLogo;
    }
    
    public Blob getRegulatorLogo() {
        return this.regulatorLogo;
    }
    
    public String getExecDirector() {
        return this.execDirector;
    }
    
    public String getManagingDirector() {
        return this.managingDirector;
    }
    
    public String getCertName() {
        return this.certName;
    }
    
    public String getKraTaxReg() {
        return this.kraTaxReg;
    }
    
    public BigDecimal getVatNumber() {
        return this.vatNumber;
    }
    
    public byte[] getLogo4() {
        return this.logo4;
    }
    
    public String getMobile1() {
        return this.mobile1;
    }
    
    public String getMobile2() {
        return this.mobile2;
    }
    
    public Blob getCertSign() {
        return this.certSign;
    }
    
    public BigDecimal getBnkCode() {
        return this.bnkCode;
    }
    
    public BigDecimal getBbrCode() {
        return this.bbrCode;
    }
    
    public String getBankAccountNo() {
        return this.bankAccountNo;
    }
    
    public String getBankAccountName() {
        return this.bankAccountName;
    }
    
    public String getSwiftCode() {
        return this.swiftCode;
    }
    
    public void setCode(final Long code) {
        this.code = code;
    }
    
    public void setShtDesc(final String shtDesc) {
        this.shtDesc = shtDesc;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setAddrs(final String addrs) {
        this.addrs = addrs;
    }
    
    public void setTwnCode(final BigDecimal twnCode) {
        this.twnCode = twnCode;
    }
    
    public void setCouCode(final BigDecimal couCode) {
        this.couCode = couCode;
    }
    
    public void setEmailAddrs(final String emailAddrs) {
        this.emailAddrs = emailAddrs;
    }
    
    public void setPhyAddrs(final String phyAddrs) {
        this.phyAddrs = phyAddrs;
    }
    
    public void setCurCode(final Long curCode) {
        this.curCode = curCode;
    }
    
    public void setZip(final String zip) {
        this.zip = zip;
    }
    
    public void setFax(final String fax) {
        this.fax = fax;
    }
    
    public void setTel1(final String tel1) {
        this.tel1 = tel1;
    }
    
    public void setTel2(final String tel2) {
        this.tel2 = tel2;
    }
    
    public void setRptLogo(final Blob rptLogo) {
        this.rptLogo = rptLogo;
    }
    
    public void setMotto(final String motto) {
        this.motto = motto;
    }
    
    public void setPinNo(final String pinNo) {
        this.pinNo = pinNo;
    }
    
    public void setEdCode(final String edCode) {
        this.edCode = edCode;
    }
    
    public void setItemAccCode(final String itemAccCode) {
        this.itemAccCode = itemAccCode;
    }
    
    public void setOtherName(final String otherName) {
        this.otherName = otherName;
    }
    
    public void setType(final String type) {
        this.type = type;
    }
    
    public void setWebBrnCode(final Long webBrnCode) {
        this.webBrnCode = webBrnCode;
    }
    
    public void setWebAddrs(final String webAddrs) {
        this.webAddrs = webAddrs;
    }
    
    public void setAgnCode(final BigDecimal agnCode) {
        this.agnCode = agnCode;
    }
    
    public void setDirectors(final String directors) {
        this.directors = directors;
    }
    
    public void setLangCode(final BigDecimal langCode) {
        this.langCode = langCode;
    }
    
    public void setAvatar(final Blob avatar) {
        this.avatar = avatar;
    }
    
    public void setLogoB64(final Blob logoB64) {
        this.logoB64 = logoB64;
    }
    
    public void setAltBrnCode(final BigDecimal altBrnCode) {
        this.altBrnCode = altBrnCode;
    }
    
    public void setStsCode(final BigDecimal stsCode) {
        this.stsCode = stsCode;
    }
    
    public void setGrpLogo(final Blob grpLogo) {
        this.grpLogo = grpLogo;
    }
    
    public void setRegulatorLogo(final Blob regulatorLogo) {
        this.regulatorLogo = regulatorLogo;
    }
    
    public void setExecDirector(final String execDirector) {
        this.execDirector = execDirector;
    }
    
    public void setManagingDirector(final String managingDirector) {
        this.managingDirector = managingDirector;
    }
    
    public void setCertName(final String certName) {
        this.certName = certName;
    }
    
    public void setKraTaxReg(final String kraTaxReg) {
        this.kraTaxReg = kraTaxReg;
    }
    
    public void setVatNumber(final BigDecimal vatNumber) {
        this.vatNumber = vatNumber;
    }
    
    public void setLogo4(final byte[] logo4) {
        this.logo4 = logo4;
    }
    
    public void setMobile1(final String mobile1) {
        this.mobile1 = mobile1;
    }
    
    public void setMobile2(final String mobile2) {
        this.mobile2 = mobile2;
    }
    
    public void setCertSign(final Blob certSign) {
        this.certSign = certSign;
    }
    
    public void setBnkCode(final BigDecimal bnkCode) {
        this.bnkCode = bnkCode;
    }
    
    public void setBbrCode(final BigDecimal bbrCode) {
        this.bbrCode = bbrCode;
    }
    
    public void setBankAccountNo(final String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }
    
    public void setBankAccountName(final String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }
    
    public void setSwiftCode(final String swiftCode) {
        this.swiftCode = swiftCode;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Organization)) {
            return false;
        }
        final Organization other = (Organization)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        Label_0065: {
            if (this$code == null) {
                if (other$code == null) {
                    break Label_0065;
                }
            }
            else if (this$code.equals(other$code)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$shtDesc = this.getShtDesc();
        final Object other$shtDesc = other.getShtDesc();
        Label_0102: {
            if (this$shtDesc == null) {
                if (other$shtDesc == null) {
                    break Label_0102;
                }
            }
            else if (this$shtDesc.equals(other$shtDesc)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        Label_0139: {
            if (this$name == null) {
                if (other$name == null) {
                    break Label_0139;
                }
            }
            else if (this$name.equals(other$name)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$addrs = this.getAddrs();
        final Object other$addrs = other.getAddrs();
        Label_0176: {
            if (this$addrs == null) {
                if (other$addrs == null) {
                    break Label_0176;
                }
            }
            else if (this$addrs.equals(other$addrs)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$twnCode = this.getTwnCode();
        final Object other$twnCode = other.getTwnCode();
        Label_0213: {
            if (this$twnCode == null) {
                if (other$twnCode == null) {
                    break Label_0213;
                }
            }
            else if (this$twnCode.equals(other$twnCode)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$couCode = this.getCouCode();
        final Object other$couCode = other.getCouCode();
        Label_0250: {
            if (this$couCode == null) {
                if (other$couCode == null) {
                    break Label_0250;
                }
            }
            else if (this$couCode.equals(other$couCode)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$emailAddrs = this.getEmailAddrs();
        final Object other$emailAddrs = other.getEmailAddrs();
        Label_0287: {
            if (this$emailAddrs == null) {
                if (other$emailAddrs == null) {
                    break Label_0287;
                }
            }
            else if (this$emailAddrs.equals(other$emailAddrs)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$phyAddrs = this.getPhyAddrs();
        final Object other$phyAddrs = other.getPhyAddrs();
        Label_0324: {
            if (this$phyAddrs == null) {
                if (other$phyAddrs == null) {
                    break Label_0324;
                }
            }
            else if (this$phyAddrs.equals(other$phyAddrs)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$curCode = this.getCurCode();
        final Object other$curCode = other.getCurCode();
        Label_0361: {
            if (this$curCode == null) {
                if (other$curCode == null) {
                    break Label_0361;
                }
            }
            else if (this$curCode.equals(other$curCode)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$zip = this.getZip();
        final Object other$zip = other.getZip();
        Label_0398: {
            if (this$zip == null) {
                if (other$zip == null) {
                    break Label_0398;
                }
            }
            else if (this$zip.equals(other$zip)) {
                break Label_0398;
            }
            return false;
        }
        final Object this$fax = this.getFax();
        final Object other$fax = other.getFax();
        Label_0435: {
            if (this$fax == null) {
                if (other$fax == null) {
                    break Label_0435;
                }
            }
            else if (this$fax.equals(other$fax)) {
                break Label_0435;
            }
            return false;
        }
        final Object this$tel1 = this.getTel1();
        final Object other$tel1 = other.getTel1();
        Label_0472: {
            if (this$tel1 == null) {
                if (other$tel1 == null) {
                    break Label_0472;
                }
            }
            else if (this$tel1.equals(other$tel1)) {
                break Label_0472;
            }
            return false;
        }
        final Object this$tel2 = this.getTel2();
        final Object other$tel2 = other.getTel2();
        Label_0509: {
            if (this$tel2 == null) {
                if (other$tel2 == null) {
                    break Label_0509;
                }
            }
            else if (this$tel2.equals(other$tel2)) {
                break Label_0509;
            }
            return false;
        }
        final Object this$rptLogo = this.getRptLogo();
        final Object other$rptLogo = other.getRptLogo();
        Label_0546: {
            if (this$rptLogo == null) {
                if (other$rptLogo == null) {
                    break Label_0546;
                }
            }
            else if (this$rptLogo.equals(other$rptLogo)) {
                break Label_0546;
            }
            return false;
        }
        final Object this$motto = this.getMotto();
        final Object other$motto = other.getMotto();
        Label_0583: {
            if (this$motto == null) {
                if (other$motto == null) {
                    break Label_0583;
                }
            }
            else if (this$motto.equals(other$motto)) {
                break Label_0583;
            }
            return false;
        }
        final Object this$pinNo = this.getPinNo();
        final Object other$pinNo = other.getPinNo();
        Label_0620: {
            if (this$pinNo == null) {
                if (other$pinNo == null) {
                    break Label_0620;
                }
            }
            else if (this$pinNo.equals(other$pinNo)) {
                break Label_0620;
            }
            return false;
        }
        final Object this$edCode = this.getEdCode();
        final Object other$edCode = other.getEdCode();
        Label_0657: {
            if (this$edCode == null) {
                if (other$edCode == null) {
                    break Label_0657;
                }
            }
            else if (this$edCode.equals(other$edCode)) {
                break Label_0657;
            }
            return false;
        }
        final Object this$itemAccCode = this.getItemAccCode();
        final Object other$itemAccCode = other.getItemAccCode();
        Label_0694: {
            if (this$itemAccCode == null) {
                if (other$itemAccCode == null) {
                    break Label_0694;
                }
            }
            else if (this$itemAccCode.equals(other$itemAccCode)) {
                break Label_0694;
            }
            return false;
        }
        final Object this$otherName = this.getOtherName();
        final Object other$otherName = other.getOtherName();
        Label_0731: {
            if (this$otherName == null) {
                if (other$otherName == null) {
                    break Label_0731;
                }
            }
            else if (this$otherName.equals(other$otherName)) {
                break Label_0731;
            }
            return false;
        }
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        Label_0768: {
            if (this$type == null) {
                if (other$type == null) {
                    break Label_0768;
                }
            }
            else if (this$type.equals(other$type)) {
                break Label_0768;
            }
            return false;
        }
        final Object this$webBrnCode = this.getWebBrnCode();
        final Object other$webBrnCode = other.getWebBrnCode();
        Label_0805: {
            if (this$webBrnCode == null) {
                if (other$webBrnCode == null) {
                    break Label_0805;
                }
            }
            else if (this$webBrnCode.equals(other$webBrnCode)) {
                break Label_0805;
            }
            return false;
        }
        final Object this$webAddrs = this.getWebAddrs();
        final Object other$webAddrs = other.getWebAddrs();
        Label_0842: {
            if (this$webAddrs == null) {
                if (other$webAddrs == null) {
                    break Label_0842;
                }
            }
            else if (this$webAddrs.equals(other$webAddrs)) {
                break Label_0842;
            }
            return false;
        }
        final Object this$agnCode = this.getAgnCode();
        final Object other$agnCode = other.getAgnCode();
        Label_0879: {
            if (this$agnCode == null) {
                if (other$agnCode == null) {
                    break Label_0879;
                }
            }
            else if (this$agnCode.equals(other$agnCode)) {
                break Label_0879;
            }
            return false;
        }
        final Object this$directors = this.getDirectors();
        final Object other$directors = other.getDirectors();
        Label_0916: {
            if (this$directors == null) {
                if (other$directors == null) {
                    break Label_0916;
                }
            }
            else if (this$directors.equals(other$directors)) {
                break Label_0916;
            }
            return false;
        }
        final Object this$langCode = this.getLangCode();
        final Object other$langCode = other.getLangCode();
        Label_0953: {
            if (this$langCode == null) {
                if (other$langCode == null) {
                    break Label_0953;
                }
            }
            else if (this$langCode.equals(other$langCode)) {
                break Label_0953;
            }
            return false;
        }
        final Object this$avatar = this.getAvatar();
        final Object other$avatar = other.getAvatar();
        Label_0990: {
            if (this$avatar == null) {
                if (other$avatar == null) {
                    break Label_0990;
                }
            }
            else if (this$avatar.equals(other$avatar)) {
                break Label_0990;
            }
            return false;
        }
        final Object this$logoB64 = this.getLogoB64();
        final Object other$logoB64 = other.getLogoB64();
        Label_1027: {
            if (this$logoB64 == null) {
                if (other$logoB64 == null) {
                    break Label_1027;
                }
            }
            else if (this$logoB64.equals(other$logoB64)) {
                break Label_1027;
            }
            return false;
        }
        final Object this$altBrnCode = this.getAltBrnCode();
        final Object other$altBrnCode = other.getAltBrnCode();
        Label_1064: {
            if (this$altBrnCode == null) {
                if (other$altBrnCode == null) {
                    break Label_1064;
                }
            }
            else if (this$altBrnCode.equals(other$altBrnCode)) {
                break Label_1064;
            }
            return false;
        }
        final Object this$stsCode = this.getStsCode();
        final Object other$stsCode = other.getStsCode();
        Label_1101: {
            if (this$stsCode == null) {
                if (other$stsCode == null) {
                    break Label_1101;
                }
            }
            else if (this$stsCode.equals(other$stsCode)) {
                break Label_1101;
            }
            return false;
        }
        final Object this$grpLogo = this.getGrpLogo();
        final Object other$grpLogo = other.getGrpLogo();
        Label_1138: {
            if (this$grpLogo == null) {
                if (other$grpLogo == null) {
                    break Label_1138;
                }
            }
            else if (this$grpLogo.equals(other$grpLogo)) {
                break Label_1138;
            }
            return false;
        }
        final Object this$regulatorLogo = this.getRegulatorLogo();
        final Object other$regulatorLogo = other.getRegulatorLogo();
        Label_1175: {
            if (this$regulatorLogo == null) {
                if (other$regulatorLogo == null) {
                    break Label_1175;
                }
            }
            else if (this$regulatorLogo.equals(other$regulatorLogo)) {
                break Label_1175;
            }
            return false;
        }
        final Object this$execDirector = this.getExecDirector();
        final Object other$execDirector = other.getExecDirector();
        Label_1212: {
            if (this$execDirector == null) {
                if (other$execDirector == null) {
                    break Label_1212;
                }
            }
            else if (this$execDirector.equals(other$execDirector)) {
                break Label_1212;
            }
            return false;
        }
        final Object this$managingDirector = this.getManagingDirector();
        final Object other$managingDirector = other.getManagingDirector();
        Label_1249: {
            if (this$managingDirector == null) {
                if (other$managingDirector == null) {
                    break Label_1249;
                }
            }
            else if (this$managingDirector.equals(other$managingDirector)) {
                break Label_1249;
            }
            return false;
        }
        final Object this$certName = this.getCertName();
        final Object other$certName = other.getCertName();
        Label_1286: {
            if (this$certName == null) {
                if (other$certName == null) {
                    break Label_1286;
                }
            }
            else if (this$certName.equals(other$certName)) {
                break Label_1286;
            }
            return false;
        }
        final Object this$kraTaxReg = this.getKraTaxReg();
        final Object other$kraTaxReg = other.getKraTaxReg();
        Label_1323: {
            if (this$kraTaxReg == null) {
                if (other$kraTaxReg == null) {
                    break Label_1323;
                }
            }
            else if (this$kraTaxReg.equals(other$kraTaxReg)) {
                break Label_1323;
            }
            return false;
        }
        final Object this$vatNumber = this.getVatNumber();
        final Object other$vatNumber = other.getVatNumber();
        Label_1360: {
            if (this$vatNumber == null) {
                if (other$vatNumber == null) {
                    break Label_1360;
                }
            }
            else if (this$vatNumber.equals(other$vatNumber)) {
                break Label_1360;
            }
            return false;
        }
        if (!Arrays.equals(this.getLogo4(), other.getLogo4())) {
            return false;
        }
        final Object this$mobile1 = this.getMobile1();
        final Object other$mobile1 = other.getMobile1();
        Label_1413: {
            if (this$mobile1 == null) {
                if (other$mobile1 == null) {
                    break Label_1413;
                }
            }
            else if (this$mobile1.equals(other$mobile1)) {
                break Label_1413;
            }
            return false;
        }
        final Object this$mobile2 = this.getMobile2();
        final Object other$mobile2 = other.getMobile2();
        Label_1450: {
            if (this$mobile2 == null) {
                if (other$mobile2 == null) {
                    break Label_1450;
                }
            }
            else if (this$mobile2.equals(other$mobile2)) {
                break Label_1450;
            }
            return false;
        }
        final Object this$certSign = this.getCertSign();
        final Object other$certSign = other.getCertSign();
        Label_1487: {
            if (this$certSign == null) {
                if (other$certSign == null) {
                    break Label_1487;
                }
            }
            else if (this$certSign.equals(other$certSign)) {
                break Label_1487;
            }
            return false;
        }
        final Object this$bnkCode = this.getBnkCode();
        final Object other$bnkCode = other.getBnkCode();
        Label_1524: {
            if (this$bnkCode == null) {
                if (other$bnkCode == null) {
                    break Label_1524;
                }
            }
            else if (this$bnkCode.equals(other$bnkCode)) {
                break Label_1524;
            }
            return false;
        }
        final Object this$bbrCode = this.getBbrCode();
        final Object other$bbrCode = other.getBbrCode();
        Label_1561: {
            if (this$bbrCode == null) {
                if (other$bbrCode == null) {
                    break Label_1561;
                }
            }
            else if (this$bbrCode.equals(other$bbrCode)) {
                break Label_1561;
            }
            return false;
        }
        final Object this$bankAccountNo = this.getBankAccountNo();
        final Object other$bankAccountNo = other.getBankAccountNo();
        Label_1598: {
            if (this$bankAccountNo == null) {
                if (other$bankAccountNo == null) {
                    break Label_1598;
                }
            }
            else if (this$bankAccountNo.equals(other$bankAccountNo)) {
                break Label_1598;
            }
            return false;
        }
        final Object this$bankAccountName = this.getBankAccountName();
        final Object other$bankAccountName = other.getBankAccountName();
        Label_1635: {
            if (this$bankAccountName == null) {
                if (other$bankAccountName == null) {
                    break Label_1635;
                }
            }
            else if (this$bankAccountName.equals(other$bankAccountName)) {
                break Label_1635;
            }
            return false;
        }
        final Object this$swiftCode = this.getSwiftCode();
        final Object other$swiftCode = other.getSwiftCode();
        if (this$swiftCode == null) {
            if (other$swiftCode == null) {
                return true;
            }
        }
        else if (this$swiftCode.equals(other$swiftCode)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Organization;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $shtDesc = this.getShtDesc();
        result = result * 59 + (($shtDesc == null) ? 43 : $shtDesc.hashCode());
        final Object $name = this.getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        final Object $addrs = this.getAddrs();
        result = result * 59 + (($addrs == null) ? 43 : $addrs.hashCode());
        final Object $twnCode = this.getTwnCode();
        result = result * 59 + (($twnCode == null) ? 43 : $twnCode.hashCode());
        final Object $couCode = this.getCouCode();
        result = result * 59 + (($couCode == null) ? 43 : $couCode.hashCode());
        final Object $emailAddrs = this.getEmailAddrs();
        result = result * 59 + (($emailAddrs == null) ? 43 : $emailAddrs.hashCode());
        final Object $phyAddrs = this.getPhyAddrs();
        result = result * 59 + (($phyAddrs == null) ? 43 : $phyAddrs.hashCode());
        final Object $curCode = this.getCurCode();
        result = result * 59 + (($curCode == null) ? 43 : $curCode.hashCode());
        final Object $zip = this.getZip();
        result = result * 59 + (($zip == null) ? 43 : $zip.hashCode());
        final Object $fax = this.getFax();
        result = result * 59 + (($fax == null) ? 43 : $fax.hashCode());
        final Object $tel1 = this.getTel1();
        result = result * 59 + (($tel1 == null) ? 43 : $tel1.hashCode());
        final Object $tel2 = this.getTel2();
        result = result * 59 + (($tel2 == null) ? 43 : $tel2.hashCode());
        final Object $rptLogo = this.getRptLogo();
        result = result * 59 + (($rptLogo == null) ? 43 : $rptLogo.hashCode());
        final Object $motto = this.getMotto();
        result = result * 59 + (($motto == null) ? 43 : $motto.hashCode());
        final Object $pinNo = this.getPinNo();
        result = result * 59 + (($pinNo == null) ? 43 : $pinNo.hashCode());
        final Object $edCode = this.getEdCode();
        result = result * 59 + (($edCode == null) ? 43 : $edCode.hashCode());
        final Object $itemAccCode = this.getItemAccCode();
        result = result * 59 + (($itemAccCode == null) ? 43 : $itemAccCode.hashCode());
        final Object $otherName = this.getOtherName();
        result = result * 59 + (($otherName == null) ? 43 : $otherName.hashCode());
        final Object $type = this.getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        final Object $webBrnCode = this.getWebBrnCode();
        result = result * 59 + (($webBrnCode == null) ? 43 : $webBrnCode.hashCode());
        final Object $webAddrs = this.getWebAddrs();
        result = result * 59 + (($webAddrs == null) ? 43 : $webAddrs.hashCode());
        final Object $agnCode = this.getAgnCode();
        result = result * 59 + (($agnCode == null) ? 43 : $agnCode.hashCode());
        final Object $directors = this.getDirectors();
        result = result * 59 + (($directors == null) ? 43 : $directors.hashCode());
        final Object $langCode = this.getLangCode();
        result = result * 59 + (($langCode == null) ? 43 : $langCode.hashCode());
        final Object $avatar = this.getAvatar();
        result = result * 59 + (($avatar == null) ? 43 : $avatar.hashCode());
        final Object $logoB64 = this.getLogoB64();
        result = result * 59 + (($logoB64 == null) ? 43 : $logoB64.hashCode());
        final Object $altBrnCode = this.getAltBrnCode();
        result = result * 59 + (($altBrnCode == null) ? 43 : $altBrnCode.hashCode());
        final Object $stsCode = this.getStsCode();
        result = result * 59 + (($stsCode == null) ? 43 : $stsCode.hashCode());
        final Object $grpLogo = this.getGrpLogo();
        result = result * 59 + (($grpLogo == null) ? 43 : $grpLogo.hashCode());
        final Object $regulatorLogo = this.getRegulatorLogo();
        result = result * 59 + (($regulatorLogo == null) ? 43 : $regulatorLogo.hashCode());
        final Object $execDirector = this.getExecDirector();
        result = result * 59 + (($execDirector == null) ? 43 : $execDirector.hashCode());
        final Object $managingDirector = this.getManagingDirector();
        result = result * 59 + (($managingDirector == null) ? 43 : $managingDirector.hashCode());
        final Object $certName = this.getCertName();
        result = result * 59 + (($certName == null) ? 43 : $certName.hashCode());
        final Object $kraTaxReg = this.getKraTaxReg();
        result = result * 59 + (($kraTaxReg == null) ? 43 : $kraTaxReg.hashCode());
        final Object $vatNumber = this.getVatNumber();
        result = result * 59 + (($vatNumber == null) ? 43 : $vatNumber.hashCode());
        result = result * 59 + Arrays.hashCode(this.getLogo4());
        final Object $mobile1 = this.getMobile1();
        result = result * 59 + (($mobile1 == null) ? 43 : $mobile1.hashCode());
        final Object $mobile2 = this.getMobile2();
        result = result * 59 + (($mobile2 == null) ? 43 : $mobile2.hashCode());
        final Object $certSign = this.getCertSign();
        result = result * 59 + (($certSign == null) ? 43 : $certSign.hashCode());
        final Object $bnkCode = this.getBnkCode();
        result = result * 59 + (($bnkCode == null) ? 43 : $bnkCode.hashCode());
        final Object $bbrCode = this.getBbrCode();
        result = result * 59 + (($bbrCode == null) ? 43 : $bbrCode.hashCode());
        final Object $bankAccountNo = this.getBankAccountNo();
        result = result * 59 + (($bankAccountNo == null) ? 43 : $bankAccountNo.hashCode());
        final Object $bankAccountName = this.getBankAccountName();
        result = result * 59 + (($bankAccountName == null) ? 43 : $bankAccountName.hashCode());
        final Object $swiftCode = this.getSwiftCode();
        result = result * 59 + (($swiftCode == null) ? 43 : $swiftCode.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Organization(code=" + this.getCode() + ", shtDesc=" + this.getShtDesc() + ", name=" + this.getName() + ", addrs=" + this.getAddrs() + ", twnCode=" + this.getTwnCode() + ", couCode=" + this.getCouCode() + ", emailAddrs=" + this.getEmailAddrs() + ", phyAddrs=" + this.getPhyAddrs() + ", curCode=" + this.getCurCode() + ", zip=" + this.getZip() + ", fax=" + this.getFax() + ", tel1=" + this.getTel1() + ", tel2=" + this.getTel2() + ", rptLogo=" + this.getRptLogo() + ", motto=" + this.getMotto() + ", pinNo=" + this.getPinNo() + ", edCode=" + this.getEdCode() + ", itemAccCode=" + this.getItemAccCode() + ", otherName=" + this.getOtherName() + ", type=" + this.getType() + ", webBrnCode=" + this.getWebBrnCode() + ", webAddrs=" + this.getWebAddrs() + ", agnCode=" + this.getAgnCode() + ", directors=" + this.getDirectors() + ", langCode=" + this.getLangCode() + ", avatar=" + this.getAvatar() + ", logoB64=" + this.getLogoB64() + ", altBrnCode=" + this.getAltBrnCode() + ", stsCode=" + this.getStsCode() + ", grpLogo=" + this.getGrpLogo() + ", regulatorLogo=" + this.getRegulatorLogo() + ", execDirector=" + this.getExecDirector() + ", managingDirector=" + this.getManagingDirector() + ", certName=" + this.getCertName() + ", kraTaxReg=" + this.getKraTaxReg() + ", vatNumber=" + this.getVatNumber() + ", logo4=" + Arrays.toString(this.getLogo4()) + ", mobile1=" + this.getMobile1() + ", mobile2=" + this.getMobile2() + ", certSign=" + this.getCertSign() + ", bnkCode=" + this.getBnkCode() + ", bbrCode=" + this.getBbrCode() + ", bankAccountNo=" + this.getBankAccountNo() + ", bankAccountName=" + this.getBankAccountName() + ", swiftCode=" + this.getSwiftCode() + ")";
    }
}
