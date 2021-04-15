// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.entities;

import java.sql.Date;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "api_web_client_rec")
public class AgencyClientInfo implements Serializable
{
    @Id
    @Column(name = "clntw_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GIN_CLNTW_CODE_SEQ")
    @SequenceGenerator(name = "GIN_CLNTW_CODE_SEQ", schema = "TQ_GIS", allocationSize = 1, sequenceName = "TQ_GIS.GIN_CLNTW_CODE_SEQ")
    private BigDecimal clntwId;
    @Column(name = "clntw_code", length = 26, nullable = true)
    private BigDecimal code;
    @Column(name = "clntw_sht_desc", length = 100, nullable = true)
    private String shortDescription;
    @Column(name = "clntw_name", length = 200, nullable = true)
    private String name;
    @Column(name = "clntw_other_names", length = 200, nullable = true)
    private String otherNames;
    @Column(name = "clntw_dob", length = 7, nullable = true)
    private Date dateOfBirth;
    @Column(name = "clntw_id_reg_no", length = 100, nullable = true)
    private String idRegistrationNumber;
    @Column(name = "clntw_pin", length = 50, nullable = true)
    private String pin;
    @Column(name = "clntw_physical_addrs", length = 200, nullable = true)
    private String physicalAddress;
    @Column(name = "clntw_postal_addrs", length = 200, nullable = true)
    private String postalAddress;
    @Column(name = "clntw_email_addrs", length = 200, nullable = true)
    private String emailAddress;
    @Column(name = "clntw_tel", length = 26, nullable = true)
    private String telephone1;
    @Column(name = "clntw_tel2", length = 26, nullable = true)
    private String telephone2;
    @Column(name = "clntw_status", length = 26, nullable = true)
    private String status;
    @Column(name = "clntw_fax", length = 26, nullable = true)
    private String fax;
    @Column(name = "clntw_type", length = 26, nullable = true)
    private String type;
    @Column(name = "clntw_brn_code", length = 22, nullable = true)
    private BigDecimal branchCode;
    @Column(name = "clntw_request_id", length = 26, nullable = true)
    private String requestId;
    @Column(name = "clntw_occupation", length = 100, nullable = true)
    private String occupation;
    @Column(name = "clntw_smstel", length = 100, nullable = true)
    private String smsTel;
    @Column(name = "clntw_smstel2", length = 100, nullable = true)
    private String smsTel2;
    @Column(name = "clntw_gender", length = 100, nullable = true)
    private String gender;
    @Column(name = "clntw_country", length = 100, nullable = true)
    private String country;
    @Column(name = "clntw_town", length = 100, nullable = true)
    private String town;
    
    public BigDecimal getClntwId() {
        return this.clntwId;
    }
    
    public BigDecimal getCode() {
        return this.code;
    }
    
    public String getShortDescription() {
        return this.shortDescription;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getOtherNames() {
        return this.otherNames;
    }
    
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public String getIdRegistrationNumber() {
        return this.idRegistrationNumber;
    }
    
    public String getPin() {
        return this.pin;
    }
    
    public String getPhysicalAddress() {
        return this.physicalAddress;
    }
    
    public String getPostalAddress() {
        return this.postalAddress;
    }
    
    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public String getTelephone1() {
        return this.telephone1;
    }
    
    public String getTelephone2() {
        return this.telephone2;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public String getFax() {
        return this.fax;
    }
    
    public String getType() {
        return this.type;
    }
    
    public BigDecimal getBranchCode() {
        return this.branchCode;
    }
    
    public String getRequestId() {
        return this.requestId;
    }
    
    public String getOccupation() {
        return this.occupation;
    }
    
    public String getSmsTel() {
        return this.smsTel;
    }
    
    public String getSmsTel2() {
        return this.smsTel2;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public String getTown() {
        return this.town;
    }
    
    public void setClntwId(final BigDecimal clntwId) {
        this.clntwId = clntwId;
    }
    
    public void setCode(final BigDecimal code) {
        this.code = code;
    }
    
    public void setShortDescription(final String shortDescription) {
        this.shortDescription = shortDescription;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setOtherNames(final String otherNames) {
        this.otherNames = otherNames;
    }
    
    public void setDateOfBirth(final Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setIdRegistrationNumber(final String idRegistrationNumber) {
        this.idRegistrationNumber = idRegistrationNumber;
    }
    
    public void setPin(final String pin) {
        this.pin = pin;
    }
    
    public void setPhysicalAddress(final String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }
    
    public void setPostalAddress(final String postalAddress) {
        this.postalAddress = postalAddress;
    }
    
    public void setEmailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public void setTelephone1(final String telephone1) {
        this.telephone1 = telephone1;
    }
    
    public void setTelephone2(final String telephone2) {
        this.telephone2 = telephone2;
    }
    
    public void setStatus(final String status) {
        this.status = status;
    }
    
    public void setFax(final String fax) {
        this.fax = fax;
    }
    
    public void setType(final String type) {
        this.type = type;
    }
    
    public void setBranchCode(final BigDecimal branchCode) {
        this.branchCode = branchCode;
    }
    
    public void setRequestId(final String requestId) {
        this.requestId = requestId;
    }
    
    public void setOccupation(final String occupation) {
        this.occupation = occupation;
    }
    
    public void setSmsTel(final String smsTel) {
        this.smsTel = smsTel;
    }
    
    public void setSmsTel2(final String smsTel2) {
        this.smsTel2 = smsTel2;
    }
    
    public void setGender(final String gender) {
        this.gender = gender;
    }
    
    public void setCountry(final String country) {
        this.country = country;
    }
    
    public void setTown(final String town) {
        this.town = town;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgencyClientInfo)) {
            return false;
        }
        final AgencyClientInfo other = (AgencyClientInfo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$clntwId = this.getClntwId();
        final Object other$clntwId = other.getClntwId();
        Label_0065: {
            if (this$clntwId == null) {
                if (other$clntwId == null) {
                    break Label_0065;
                }
            }
            else if (this$clntwId.equals(other$clntwId)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        Label_0102: {
            if (this$code == null) {
                if (other$code == null) {
                    break Label_0102;
                }
            }
            else if (this$code.equals(other$code)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$shortDescription = this.getShortDescription();
        final Object other$shortDescription = other.getShortDescription();
        Label_0139: {
            if (this$shortDescription == null) {
                if (other$shortDescription == null) {
                    break Label_0139;
                }
            }
            else if (this$shortDescription.equals(other$shortDescription)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        Label_0176: {
            if (this$name == null) {
                if (other$name == null) {
                    break Label_0176;
                }
            }
            else if (this$name.equals(other$name)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$otherNames = this.getOtherNames();
        final Object other$otherNames = other.getOtherNames();
        Label_0213: {
            if (this$otherNames == null) {
                if (other$otherNames == null) {
                    break Label_0213;
                }
            }
            else if (this$otherNames.equals(other$otherNames)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$dateOfBirth = this.getDateOfBirth();
        final Object other$dateOfBirth = other.getDateOfBirth();
        Label_0250: {
            if (this$dateOfBirth == null) {
                if (other$dateOfBirth == null) {
                    break Label_0250;
                }
            }
            else if (this$dateOfBirth.equals(other$dateOfBirth)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$idRegistrationNumber = this.getIdRegistrationNumber();
        final Object other$idRegistrationNumber = other.getIdRegistrationNumber();
        Label_0287: {
            if (this$idRegistrationNumber == null) {
                if (other$idRegistrationNumber == null) {
                    break Label_0287;
                }
            }
            else if (this$idRegistrationNumber.equals(other$idRegistrationNumber)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$pin = this.getPin();
        final Object other$pin = other.getPin();
        Label_0324: {
            if (this$pin == null) {
                if (other$pin == null) {
                    break Label_0324;
                }
            }
            else if (this$pin.equals(other$pin)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$physicalAddress = this.getPhysicalAddress();
        final Object other$physicalAddress = other.getPhysicalAddress();
        Label_0361: {
            if (this$physicalAddress == null) {
                if (other$physicalAddress == null) {
                    break Label_0361;
                }
            }
            else if (this$physicalAddress.equals(other$physicalAddress)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$postalAddress = this.getPostalAddress();
        final Object other$postalAddress = other.getPostalAddress();
        Label_0398: {
            if (this$postalAddress == null) {
                if (other$postalAddress == null) {
                    break Label_0398;
                }
            }
            else if (this$postalAddress.equals(other$postalAddress)) {
                break Label_0398;
            }
            return false;
        }
        final Object this$emailAddress = this.getEmailAddress();
        final Object other$emailAddress = other.getEmailAddress();
        Label_0435: {
            if (this$emailAddress == null) {
                if (other$emailAddress == null) {
                    break Label_0435;
                }
            }
            else if (this$emailAddress.equals(other$emailAddress)) {
                break Label_0435;
            }
            return false;
        }
        final Object this$telephone1 = this.getTelephone1();
        final Object other$telephone1 = other.getTelephone1();
        Label_0472: {
            if (this$telephone1 == null) {
                if (other$telephone1 == null) {
                    break Label_0472;
                }
            }
            else if (this$telephone1.equals(other$telephone1)) {
                break Label_0472;
            }
            return false;
        }
        final Object this$telephone2 = this.getTelephone2();
        final Object other$telephone2 = other.getTelephone2();
        Label_0509: {
            if (this$telephone2 == null) {
                if (other$telephone2 == null) {
                    break Label_0509;
                }
            }
            else if (this$telephone2.equals(other$telephone2)) {
                break Label_0509;
            }
            return false;
        }
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        Label_0546: {
            if (this$status == null) {
                if (other$status == null) {
                    break Label_0546;
                }
            }
            else if (this$status.equals(other$status)) {
                break Label_0546;
            }
            return false;
        }
        final Object this$fax = this.getFax();
        final Object other$fax = other.getFax();
        Label_0583: {
            if (this$fax == null) {
                if (other$fax == null) {
                    break Label_0583;
                }
            }
            else if (this$fax.equals(other$fax)) {
                break Label_0583;
            }
            return false;
        }
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        Label_0620: {
            if (this$type == null) {
                if (other$type == null) {
                    break Label_0620;
                }
            }
            else if (this$type.equals(other$type)) {
                break Label_0620;
            }
            return false;
        }
        final Object this$branchCode = this.getBranchCode();
        final Object other$branchCode = other.getBranchCode();
        Label_0657: {
            if (this$branchCode == null) {
                if (other$branchCode == null) {
                    break Label_0657;
                }
            }
            else if (this$branchCode.equals(other$branchCode)) {
                break Label_0657;
            }
            return false;
        }
        final Object this$requestId = this.getRequestId();
        final Object other$requestId = other.getRequestId();
        Label_0694: {
            if (this$requestId == null) {
                if (other$requestId == null) {
                    break Label_0694;
                }
            }
            else if (this$requestId.equals(other$requestId)) {
                break Label_0694;
            }
            return false;
        }
        final Object this$occupation = this.getOccupation();
        final Object other$occupation = other.getOccupation();
        Label_0731: {
            if (this$occupation == null) {
                if (other$occupation == null) {
                    break Label_0731;
                }
            }
            else if (this$occupation.equals(other$occupation)) {
                break Label_0731;
            }
            return false;
        }
        final Object this$smsTel = this.getSmsTel();
        final Object other$smsTel = other.getSmsTel();
        Label_0768: {
            if (this$smsTel == null) {
                if (other$smsTel == null) {
                    break Label_0768;
                }
            }
            else if (this$smsTel.equals(other$smsTel)) {
                break Label_0768;
            }
            return false;
        }
        final Object this$smsTel2 = this.getSmsTel2();
        final Object other$smsTel2 = other.getSmsTel2();
        Label_0805: {
            if (this$smsTel2 == null) {
                if (other$smsTel2 == null) {
                    break Label_0805;
                }
            }
            else if (this$smsTel2.equals(other$smsTel2)) {
                break Label_0805;
            }
            return false;
        }
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        Label_0842: {
            if (this$gender == null) {
                if (other$gender == null) {
                    break Label_0842;
                }
            }
            else if (this$gender.equals(other$gender)) {
                break Label_0842;
            }
            return false;
        }
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        Label_0879: {
            if (this$country == null) {
                if (other$country == null) {
                    break Label_0879;
                }
            }
            else if (this$country.equals(other$country)) {
                break Label_0879;
            }
            return false;
        }
        final Object this$town = this.getTown();
        final Object other$town = other.getTown();
        if (this$town == null) {
            if (other$town == null) {
                return true;
            }
        }
        else if (this$town.equals(other$town)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof AgencyClientInfo;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $clntwId = this.getClntwId();
        result = result * 59 + (($clntwId == null) ? 43 : $clntwId.hashCode());
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $shortDescription = this.getShortDescription();
        result = result * 59 + (($shortDescription == null) ? 43 : $shortDescription.hashCode());
        final Object $name = this.getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        final Object $otherNames = this.getOtherNames();
        result = result * 59 + (($otherNames == null) ? 43 : $otherNames.hashCode());
        final Object $dateOfBirth = this.getDateOfBirth();
        result = result * 59 + (($dateOfBirth == null) ? 43 : $dateOfBirth.hashCode());
        final Object $idRegistrationNumber = this.getIdRegistrationNumber();
        result = result * 59 + (($idRegistrationNumber == null) ? 43 : $idRegistrationNumber.hashCode());
        final Object $pin = this.getPin();
        result = result * 59 + (($pin == null) ? 43 : $pin.hashCode());
        final Object $physicalAddress = this.getPhysicalAddress();
        result = result * 59 + (($physicalAddress == null) ? 43 : $physicalAddress.hashCode());
        final Object $postalAddress = this.getPostalAddress();
        result = result * 59 + (($postalAddress == null) ? 43 : $postalAddress.hashCode());
        final Object $emailAddress = this.getEmailAddress();
        result = result * 59 + (($emailAddress == null) ? 43 : $emailAddress.hashCode());
        final Object $telephone1 = this.getTelephone1();
        result = result * 59 + (($telephone1 == null) ? 43 : $telephone1.hashCode());
        final Object $telephone2 = this.getTelephone2();
        result = result * 59 + (($telephone2 == null) ? 43 : $telephone2.hashCode());
        final Object $status = this.getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        final Object $fax = this.getFax();
        result = result * 59 + (($fax == null) ? 43 : $fax.hashCode());
        final Object $type = this.getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        final Object $branchCode = this.getBranchCode();
        result = result * 59 + (($branchCode == null) ? 43 : $branchCode.hashCode());
        final Object $requestId = this.getRequestId();
        result = result * 59 + (($requestId == null) ? 43 : $requestId.hashCode());
        final Object $occupation = this.getOccupation();
        result = result * 59 + (($occupation == null) ? 43 : $occupation.hashCode());
        final Object $smsTel = this.getSmsTel();
        result = result * 59 + (($smsTel == null) ? 43 : $smsTel.hashCode());
        final Object $smsTel2 = this.getSmsTel2();
        result = result * 59 + (($smsTel2 == null) ? 43 : $smsTel2.hashCode());
        final Object $gender = this.getGender();
        result = result * 59 + (($gender == null) ? 43 : $gender.hashCode());
        final Object $country = this.getCountry();
        result = result * 59 + (($country == null) ? 43 : $country.hashCode());
        final Object $town = this.getTown();
        result = result * 59 + (($town == null) ? 43 : $town.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "AgencyClientInfo(clntwId=" + this.getClntwId() + ", code=" + this.getCode() + ", shortDescription=" + this.getShortDescription() + ", name=" + this.getName() + ", otherNames=" + this.getOtherNames() + ", dateOfBirth=" + this.getDateOfBirth() + ", idRegistrationNumber=" + this.getIdRegistrationNumber() + ", pin=" + this.getPin() + ", physicalAddress=" + this.getPhysicalAddress() + ", postalAddress=" + this.getPostalAddress() + ", emailAddress=" + this.getEmailAddress() + ", telephone1=" + this.getTelephone1() + ", telephone2=" + this.getTelephone2() + ", status=" + this.getStatus() + ", fax=" + this.getFax() + ", type=" + this.getType() + ", branchCode=" + this.getBranchCode() + ", requestId=" + this.getRequestId() + ", occupation=" + this.getOccupation() + ", smsTel=" + this.getSmsTel() + ", smsTel2=" + this.getSmsTel2() + ", gender=" + this.getGender() + ", country=" + this.getCountry() + ", town=" + this.getTown() + ")";
    }
}
