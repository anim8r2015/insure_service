// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.entities;

import javax.persistence.Column;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "API_MASTER_RISK_DTLS")
public class MasterRiskDtls
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "API_MRD_SEQ")
    @SequenceGenerator(name = "API_MRD_SEQ", allocationSize = 1, sequenceName = "API_MRD_SEQ")
    @Column(name = "MRD_CODE")
    private BigDecimal code;
    @Column(name = "MRD_TABLE_NAME")
    private String tableName;
    @Column(name = "MRD_TABLE_SEQ")
    private String tableSeq;
    @Column(name = "MRD_TABLE_PREFIX")
    private String tablePrefix;
    @Column(name = "MRD_IPU_ID")
    private BigDecimal ipuId;
    @Column(name = "MRD_COLUMN_NAMES")
    private String columnNames;
    @Column(name = "MRD_COLUMN_VALUES")
    private String columnvalues;
    
    public BigDecimal getCode() {
        return this.code;
    }
    
    public String getTableName() {
        return this.tableName;
    }
    
    public String getTableSeq() {
        return this.tableSeq;
    }
    
    public String getTablePrefix() {
        return this.tablePrefix;
    }
    
    public BigDecimal getIpuId() {
        return this.ipuId;
    }
    
    public String getColumnNames() {
        return this.columnNames;
    }
    
    public String getColumnvalues() {
        return this.columnvalues;
    }
    
    public void setCode(final BigDecimal code) {
        this.code = code;
    }
    
    public void setTableName(final String tableName) {
        this.tableName = tableName;
    }
    
    public void setTableSeq(final String tableSeq) {
        this.tableSeq = tableSeq;
    }
    
    public void setTablePrefix(final String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }
    
    public void setIpuId(final BigDecimal ipuId) {
        this.ipuId = ipuId;
    }
    
    public void setColumnNames(final String columnNames) {
        this.columnNames = columnNames;
    }
    
    public void setColumnvalues(final String columnvalues) {
        this.columnvalues = columnvalues;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MasterRiskDtls)) {
            return false;
        }
        final MasterRiskDtls other = (MasterRiskDtls)o;
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
        final Object this$tableName = this.getTableName();
        final Object other$tableName = other.getTableName();
        Label_0102: {
            if (this$tableName == null) {
                if (other$tableName == null) {
                    break Label_0102;
                }
            }
            else if (this$tableName.equals(other$tableName)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$tableSeq = this.getTableSeq();
        final Object other$tableSeq = other.getTableSeq();
        Label_0139: {
            if (this$tableSeq == null) {
                if (other$tableSeq == null) {
                    break Label_0139;
                }
            }
            else if (this$tableSeq.equals(other$tableSeq)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$tablePrefix = this.getTablePrefix();
        final Object other$tablePrefix = other.getTablePrefix();
        Label_0176: {
            if (this$tablePrefix == null) {
                if (other$tablePrefix == null) {
                    break Label_0176;
                }
            }
            else if (this$tablePrefix.equals(other$tablePrefix)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$ipuId = this.getIpuId();
        final Object other$ipuId = other.getIpuId();
        Label_0213: {
            if (this$ipuId == null) {
                if (other$ipuId == null) {
                    break Label_0213;
                }
            }
            else if (this$ipuId.equals(other$ipuId)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$columnNames = this.getColumnNames();
        final Object other$columnNames = other.getColumnNames();
        Label_0250: {
            if (this$columnNames == null) {
                if (other$columnNames == null) {
                    break Label_0250;
                }
            }
            else if (this$columnNames.equals(other$columnNames)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$columnvalues = this.getColumnvalues();
        final Object other$columnvalues = other.getColumnvalues();
        if (this$columnvalues == null) {
            if (other$columnvalues == null) {
                return true;
            }
        }
        else if (this$columnvalues.equals(other$columnvalues)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof MasterRiskDtls;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $tableName = this.getTableName();
        result = result * 59 + (($tableName == null) ? 43 : $tableName.hashCode());
        final Object $tableSeq = this.getTableSeq();
        result = result * 59 + (($tableSeq == null) ? 43 : $tableSeq.hashCode());
        final Object $tablePrefix = this.getTablePrefix();
        result = result * 59 + (($tablePrefix == null) ? 43 : $tablePrefix.hashCode());
        final Object $ipuId = this.getIpuId();
        result = result * 59 + (($ipuId == null) ? 43 : $ipuId.hashCode());
        final Object $columnNames = this.getColumnNames();
        result = result * 59 + (($columnNames == null) ? 43 : $columnNames.hashCode());
        final Object $columnvalues = this.getColumnvalues();
        result = result * 59 + (($columnvalues == null) ? 43 : $columnvalues.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "MasterRiskDtls(code=" + this.getCode() + ", tableName=" + this.getTableName() + ", tableSeq=" + this.getTableSeq() + ", tablePrefix=" + this.getTablePrefix() + ", ipuId=" + this.getIpuId() + ", columnNames=" + this.getColumnNames() + ", columnvalues=" + this.getColumnvalues() + ")";
    }
}
