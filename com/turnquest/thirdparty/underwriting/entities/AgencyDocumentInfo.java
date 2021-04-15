// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.entities;

import java.util.Arrays;
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
@Table(name = "api_web_documents_rec")
public class AgencyDocumentInfo implements Serializable
{
    @Id
    @Column(name = "powd_code", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GIN_POWD_CODE_SEQ")
    @SequenceGenerator(name = "GIN_POWD_CODE_SEQ", schema = "TQ_GIS", allocationSize = 1, sequenceName = "TQ_GIS.GIN_POWD_CODE_SEQ")
    private BigDecimal docCode;
    @Column(name = "powd_batch_no", length = 26, nullable = true)
    private BigDecimal polBatchNo;
    @Column(name = "powd_name", length = 100, nullable = true)
    private String documentType;
    @Column(name = "powd_document", nullable = true)
    private byte[] document;
    @Column(name = "powd_file_type", length = 200, nullable = true)
    private String fileType;
    @Column(name = "powd_document_type", length = 100, nullable = true)
    private String documentName;
    
    public BigDecimal getDocCode() {
        return this.docCode;
    }
    
    public BigDecimal getPolBatchNo() {
        return this.polBatchNo;
    }
    
    public String getDocumentType() {
        return this.documentType;
    }
    
    public byte[] getDocument() {
        return this.document;
    }
    
    public String getFileType() {
        return this.fileType;
    }
    
    public String getDocumentName() {
        return this.documentName;
    }
    
    public void setDocCode(final BigDecimal docCode) {
        this.docCode = docCode;
    }
    
    public void setPolBatchNo(final BigDecimal polBatchNo) {
        this.polBatchNo = polBatchNo;
    }
    
    public void setDocumentType(final String documentType) {
        this.documentType = documentType;
    }
    
    public void setDocument(final byte[] document) {
        this.document = document;
    }
    
    public void setFileType(final String fileType) {
        this.fileType = fileType;
    }
    
    public void setDocumentName(final String documentName) {
        this.documentName = documentName;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgencyDocumentInfo)) {
            return false;
        }
        final AgencyDocumentInfo other = (AgencyDocumentInfo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$docCode = this.getDocCode();
        final Object other$docCode = other.getDocCode();
        Label_0065: {
            if (this$docCode == null) {
                if (other$docCode == null) {
                    break Label_0065;
                }
            }
            else if (this$docCode.equals(other$docCode)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$polBatchNo = this.getPolBatchNo();
        final Object other$polBatchNo = other.getPolBatchNo();
        Label_0102: {
            if (this$polBatchNo == null) {
                if (other$polBatchNo == null) {
                    break Label_0102;
                }
            }
            else if (this$polBatchNo.equals(other$polBatchNo)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$documentType = this.getDocumentType();
        final Object other$documentType = other.getDocumentType();
        Label_0139: {
            if (this$documentType == null) {
                if (other$documentType == null) {
                    break Label_0139;
                }
            }
            else if (this$documentType.equals(other$documentType)) {
                break Label_0139;
            }
            return false;
        }
        if (!Arrays.equals(this.getDocument(), other.getDocument())) {
            return false;
        }
        final Object this$fileType = this.getFileType();
        final Object other$fileType = other.getFileType();
        Label_0192: {
            if (this$fileType == null) {
                if (other$fileType == null) {
                    break Label_0192;
                }
            }
            else if (this$fileType.equals(other$fileType)) {
                break Label_0192;
            }
            return false;
        }
        final Object this$documentName = this.getDocumentName();
        final Object other$documentName = other.getDocumentName();
        if (this$documentName == null) {
            if (other$documentName == null) {
                return true;
            }
        }
        else if (this$documentName.equals(other$documentName)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof AgencyDocumentInfo;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $docCode = this.getDocCode();
        result = result * 59 + (($docCode == null) ? 43 : $docCode.hashCode());
        final Object $polBatchNo = this.getPolBatchNo();
        result = result * 59 + (($polBatchNo == null) ? 43 : $polBatchNo.hashCode());
        final Object $documentType = this.getDocumentType();
        result = result * 59 + (($documentType == null) ? 43 : $documentType.hashCode());
        result = result * 59 + Arrays.hashCode(this.getDocument());
        final Object $fileType = this.getFileType();
        result = result * 59 + (($fileType == null) ? 43 : $fileType.hashCode());
        final Object $documentName = this.getDocumentName();
        result = result * 59 + (($documentName == null) ? 43 : $documentName.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "AgencyDocumentInfo(docCode=" + this.getDocCode() + ", polBatchNo=" + this.getPolBatchNo() + ", documentType=" + this.getDocumentType() + ", document=" + Arrays.toString(this.getDocument()) + ", fileType=" + this.getFileType() + ", documentName=" + this.getDocumentName() + ")";
    }
}
