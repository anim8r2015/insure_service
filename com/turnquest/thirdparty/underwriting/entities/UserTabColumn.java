// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "USER_TAB_COLUMNS")
public class UserTabColumn
{
    @Id
    @Column(name = "COLUMN_ID")
    private BigDecimal columnId;
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Column(name = "COLUMN_NAME")
    private String columnName;
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Column(name = "DATA_LENGTH")
    private BigDecimal dataLength;
    
    public BigDecimal getColumnId() {
        return this.columnId;
    }
    
    public String getTableName() {
        return this.tableName;
    }
    
    public String getColumnName() {
        return this.columnName;
    }
    
    public String getDataType() {
        return this.dataType;
    }
    
    public BigDecimal getDataLength() {
        return this.dataLength;
    }
    
    public void setColumnId(final BigDecimal columnId) {
        this.columnId = columnId;
    }
    
    public void setTableName(final String tableName) {
        this.tableName = tableName;
    }
    
    public void setColumnName(final String columnName) {
        this.columnName = columnName;
    }
    
    public void setDataType(final String dataType) {
        this.dataType = dataType;
    }
    
    public void setDataLength(final BigDecimal dataLength) {
        this.dataLength = dataLength;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserTabColumn)) {
            return false;
        }
        final UserTabColumn other = (UserTabColumn)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$columnId = this.getColumnId();
        final Object other$columnId = other.getColumnId();
        Label_0065: {
            if (this$columnId == null) {
                if (other$columnId == null) {
                    break Label_0065;
                }
            }
            else if (this$columnId.equals(other$columnId)) {
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
        final Object this$columnName = this.getColumnName();
        final Object other$columnName = other.getColumnName();
        Label_0139: {
            if (this$columnName == null) {
                if (other$columnName == null) {
                    break Label_0139;
                }
            }
            else if (this$columnName.equals(other$columnName)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$dataType = this.getDataType();
        final Object other$dataType = other.getDataType();
        Label_0176: {
            if (this$dataType == null) {
                if (other$dataType == null) {
                    break Label_0176;
                }
            }
            else if (this$dataType.equals(other$dataType)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$dataLength = this.getDataLength();
        final Object other$dataLength = other.getDataLength();
        if (this$dataLength == null) {
            if (other$dataLength == null) {
                return true;
            }
        }
        else if (this$dataLength.equals(other$dataLength)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof UserTabColumn;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $columnId = this.getColumnId();
        result = result * 59 + (($columnId == null) ? 43 : $columnId.hashCode());
        final Object $tableName = this.getTableName();
        result = result * 59 + (($tableName == null) ? 43 : $tableName.hashCode());
        final Object $columnName = this.getColumnName();
        result = result * 59 + (($columnName == null) ? 43 : $columnName.hashCode());
        final Object $dataType = this.getDataType();
        result = result * 59 + (($dataType == null) ? 43 : $dataType.hashCode());
        final Object $dataLength = this.getDataLength();
        result = result * 59 + (($dataLength == null) ? 43 : $dataLength.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "UserTabColumn(columnId=" + this.getColumnId() + ", tableName=" + this.getTableName() + ", columnName=" + this.getColumnName() + ", dataType=" + this.getDataType() + ", dataLength=" + this.getDataLength() + ")";
    }
}
