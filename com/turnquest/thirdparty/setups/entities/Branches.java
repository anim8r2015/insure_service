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

@Entity
@Table(name = "tqc_branches", schema = "TQ_CRM")
public class Branches
{
    @Id
    @Column(name = "brn_code", nullable = false)
    @SequenceGenerator(name = "TQC_BRANCH_CODE_SEQ", schema = "TQ_CRM", allocationSize = 1)
    private BigDecimal code;
    @Column(name = "brn_sht_desc", length = 15, nullable = false)
    private String brnShtDesc;
    @Column(name = "brn_name", length = 50, nullable = false)
    private String brnName;
    
    public BigDecimal getCode() {
        return this.code;
    }
    
    public String getBrnShtDesc() {
        return this.brnShtDesc;
    }
    
    public String getBrnName() {
        return this.brnName;
    }
    
    public void setCode(final BigDecimal code) {
        this.code = code;
    }
    
    public void setBrnShtDesc(final String brnShtDesc) {
        this.brnShtDesc = brnShtDesc;
    }
    
    public void setBrnName(final String brnName) {
        this.brnName = brnName;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Branches)) {
            return false;
        }
        final Branches other = (Branches)o;
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
        final Object this$brnShtDesc = this.getBrnShtDesc();
        final Object other$brnShtDesc = other.getBrnShtDesc();
        Label_0102: {
            if (this$brnShtDesc == null) {
                if (other$brnShtDesc == null) {
                    break Label_0102;
                }
            }
            else if (this$brnShtDesc.equals(other$brnShtDesc)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$brnName = this.getBrnName();
        final Object other$brnName = other.getBrnName();
        if (this$brnName == null) {
            if (other$brnName == null) {
                return true;
            }
        }
        else if (this$brnName.equals(other$brnName)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Branches;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $brnShtDesc = this.getBrnShtDesc();
        result = result * 59 + (($brnShtDesc == null) ? 43 : $brnShtDesc.hashCode());
        final Object $brnName = this.getBrnName();
        result = result * 59 + (($brnName == null) ? 43 : $brnName.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Branches(code=" + this.getCode() + ", brnShtDesc=" + this.getBrnShtDesc() + ", brnName=" + this.getBrnName() + ")";
    }
}
