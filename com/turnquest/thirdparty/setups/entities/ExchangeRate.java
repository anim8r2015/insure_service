// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.setups.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "tqc_currency_rates", schema = "tq_crm")
public class ExchangeRate implements Serializable
{
    @Id
    @Column(name = "crt_code", nullable = false)
    @SequenceGenerator(name = "TQC_CRT_CODE_SEQ", schema = "TQ_CRM", allocationSize = 1)
    private Long code;
    @Column(name = "crt_cur_code", nullable = false)
    private Long curCode;
    @Column(name = "crt_rate", nullable = false)
    private Double rate;
    @Column(name = "crt_date", nullable = false)
    private Timestamp date;
    @Column(name = "crt_base_cur_code", nullable = true)
    private Long baseCurCode;
    @Column(name = "crt_wef", nullable = true)
    private Timestamp wef;
    @Column(name = "crt_wet", nullable = true)
    private Timestamp wet;
    @Column(name = "crt_created_by", length = 50, nullable = true)
    private String createdBy;
    @Column(name = "crt_updated_by", length = 50, nullable = true)
    private String updatedBy;
    @Column(name = "crt_created_date", nullable = true)
    private Date createdDate;
    @Column(name = "crt_updated_date", nullable = true)
    private Date updatedDate;
    @ManyToOne
    @JoinColumn(name = "crt_cur_code", insertable = false, updatable = false)
    private Currency currency;
    
    public Long getCode() {
        return this.code;
    }
    
    public Long getCurCode() {
        return this.curCode;
    }
    
    public Double getRate() {
        return this.rate;
    }
    
    public Timestamp getDate() {
        return this.date;
    }
    
    public Long getBaseCurCode() {
        return this.baseCurCode;
    }
    
    public Timestamp getWef() {
        return this.wef;
    }
    
    public Timestamp getWet() {
        return this.wet;
    }
    
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public String getUpdatedBy() {
        return this.updatedBy;
    }
    
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public Date getUpdatedDate() {
        return this.updatedDate;
    }
    
    public Currency getCurrency() {
        return this.currency;
    }
    
    public void setCode(final Long code) {
        this.code = code;
    }
    
    public void setCurCode(final Long curCode) {
        this.curCode = curCode;
    }
    
    public void setRate(final Double rate) {
        this.rate = rate;
    }
    
    public void setDate(final Timestamp date) {
        this.date = date;
    }
    
    public void setBaseCurCode(final Long baseCurCode) {
        this.baseCurCode = baseCurCode;
    }
    
    public void setWef(final Timestamp wef) {
        this.wef = wef;
    }
    
    public void setWet(final Timestamp wet) {
        this.wet = wet;
    }
    
    public void setCreatedBy(final String createdBy) {
        this.createdBy = createdBy;
    }
    
    public void setUpdatedBy(final String updatedBy) {
        this.updatedBy = updatedBy;
    }
    
    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }
    
    public void setUpdatedDate(final Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    
    public void setCurrency(final Currency currency) {
        this.currency = currency;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ExchangeRate)) {
            return false;
        }
        final ExchangeRate other = (ExchangeRate)o;
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
        final Object this$curCode = this.getCurCode();
        final Object other$curCode = other.getCurCode();
        Label_0102: {
            if (this$curCode == null) {
                if (other$curCode == null) {
                    break Label_0102;
                }
            }
            else if (this$curCode.equals(other$curCode)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$rate = this.getRate();
        final Object other$rate = other.getRate();
        Label_0139: {
            if (this$rate == null) {
                if (other$rate == null) {
                    break Label_0139;
                }
            }
            else if (this$rate.equals(other$rate)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$date = this.getDate();
        final Object other$date = other.getDate();
        Label_0176: {
            if (this$date == null) {
                if (other$date == null) {
                    break Label_0176;
                }
            }
            else if (this$date.equals(other$date)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$baseCurCode = this.getBaseCurCode();
        final Object other$baseCurCode = other.getBaseCurCode();
        Label_0213: {
            if (this$baseCurCode == null) {
                if (other$baseCurCode == null) {
                    break Label_0213;
                }
            }
            else if (this$baseCurCode.equals(other$baseCurCode)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$wef = this.getWef();
        final Object other$wef = other.getWef();
        Label_0250: {
            if (this$wef == null) {
                if (other$wef == null) {
                    break Label_0250;
                }
            }
            else if (this$wef.equals(other$wef)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$wet = this.getWet();
        final Object other$wet = other.getWet();
        Label_0287: {
            if (this$wet == null) {
                if (other$wet == null) {
                    break Label_0287;
                }
            }
            else if (this$wet.equals(other$wet)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$createdBy = this.getCreatedBy();
        final Object other$createdBy = other.getCreatedBy();
        Label_0324: {
            if (this$createdBy == null) {
                if (other$createdBy == null) {
                    break Label_0324;
                }
            }
            else if (this$createdBy.equals(other$createdBy)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$updatedBy = this.getUpdatedBy();
        final Object other$updatedBy = other.getUpdatedBy();
        Label_0361: {
            if (this$updatedBy == null) {
                if (other$updatedBy == null) {
                    break Label_0361;
                }
            }
            else if (this$updatedBy.equals(other$updatedBy)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$createdDate = this.getCreatedDate();
        final Object other$createdDate = other.getCreatedDate();
        Label_0398: {
            if (this$createdDate == null) {
                if (other$createdDate == null) {
                    break Label_0398;
                }
            }
            else if (this$createdDate.equals(other$createdDate)) {
                break Label_0398;
            }
            return false;
        }
        final Object this$updatedDate = this.getUpdatedDate();
        final Object other$updatedDate = other.getUpdatedDate();
        Label_0435: {
            if (this$updatedDate == null) {
                if (other$updatedDate == null) {
                    break Label_0435;
                }
            }
            else if (this$updatedDate.equals(other$updatedDate)) {
                break Label_0435;
            }
            return false;
        }
        final Object this$currency = this.getCurrency();
        final Object other$currency = other.getCurrency();
        if (this$currency == null) {
            if (other$currency == null) {
                return true;
            }
        }
        else if (this$currency.equals(other$currency)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof ExchangeRate;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $curCode = this.getCurCode();
        result = result * 59 + (($curCode == null) ? 43 : $curCode.hashCode());
        final Object $rate = this.getRate();
        result = result * 59 + (($rate == null) ? 43 : $rate.hashCode());
        final Object $date = this.getDate();
        result = result * 59 + (($date == null) ? 43 : $date.hashCode());
        final Object $baseCurCode = this.getBaseCurCode();
        result = result * 59 + (($baseCurCode == null) ? 43 : $baseCurCode.hashCode());
        final Object $wef = this.getWef();
        result = result * 59 + (($wef == null) ? 43 : $wef.hashCode());
        final Object $wet = this.getWet();
        result = result * 59 + (($wet == null) ? 43 : $wet.hashCode());
        final Object $createdBy = this.getCreatedBy();
        result = result * 59 + (($createdBy == null) ? 43 : $createdBy.hashCode());
        final Object $updatedBy = this.getUpdatedBy();
        result = result * 59 + (($updatedBy == null) ? 43 : $updatedBy.hashCode());
        final Object $createdDate = this.getCreatedDate();
        result = result * 59 + (($createdDate == null) ? 43 : $createdDate.hashCode());
        final Object $updatedDate = this.getUpdatedDate();
        result = result * 59 + (($updatedDate == null) ? 43 : $updatedDate.hashCode());
        final Object $currency = this.getCurrency();
        result = result * 59 + (($currency == null) ? 43 : $currency.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "ExchangeRate(code=" + this.getCode() + ", curCode=" + this.getCurCode() + ", rate=" + this.getRate() + ", date=" + this.getDate() + ", baseCurCode=" + this.getBaseCurCode() + ", wef=" + this.getWef() + ", wet=" + this.getWet() + ", createdBy=" + this.getCreatedBy() + ", updatedBy=" + this.getUpdatedBy() + ", createdDate=" + this.getCreatedDate() + ", updatedDate=" + this.getUpdatedDate() + ", currency=" + this.getCurrency() + ")";
    }
}
