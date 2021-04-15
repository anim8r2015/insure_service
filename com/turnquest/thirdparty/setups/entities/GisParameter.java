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
@Table(name = "gin_parameters", schema = "TQ_GIS")
public class GisParameter implements Serializable
{
    @Id
    @Column(name = "param_code", nullable = false)
    @SequenceGenerator(name = "GIN_PARAM_CODE_SEQ", schema = "TQ_GIS", allocationSize = 1)
    private BigDecimal code;
    @Column(name = "param_name", length = 30, nullable = false)
    private String name;
    @Column(name = "param_value", length = 200, nullable = false)
    private String value;
    @Column(name = "param_status", length = 15, nullable = true)
    private String status;
    @Column(name = "param_desc", length = 200, nullable = true)
    private String desc;
    
    public BigDecimal getCode() {
        return this.code;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public String getDesc() {
        return this.desc;
    }
    
    public void setCode(final BigDecimal code) {
        this.code = code;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setValue(final String value) {
        this.value = value;
    }
    
    public void setStatus(final String status) {
        this.status = status;
    }
    
    public void setDesc(final String desc) {
        this.desc = desc;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GisParameter)) {
            return false;
        }
        final GisParameter other = (GisParameter)o;
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
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        Label_0102: {
            if (this$name == null) {
                if (other$name == null) {
                    break Label_0102;
                }
            }
            else if (this$name.equals(other$name)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        Label_0139: {
            if (this$value == null) {
                if (other$value == null) {
                    break Label_0139;
                }
            }
            else if (this$value.equals(other$value)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        Label_0176: {
            if (this$status == null) {
                if (other$status == null) {
                    break Label_0176;
                }
            }
            else if (this$status.equals(other$status)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$desc = this.getDesc();
        final Object other$desc = other.getDesc();
        if (this$desc == null) {
            if (other$desc == null) {
                return true;
            }
        }
        else if (this$desc.equals(other$desc)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof GisParameter;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $name = this.getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        final Object $value = this.getValue();
        result = result * 59 + (($value == null) ? 43 : $value.hashCode());
        final Object $status = this.getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        final Object $desc = this.getDesc();
        result = result * 59 + (($desc == null) ? 43 : $desc.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "GisParameter(code=" + this.getCode() + ", name=" + this.getName() + ", value=" + this.getValue() + ", status=" + this.getStatus() + ", desc=" + this.getDesc() + ")";
    }
}
