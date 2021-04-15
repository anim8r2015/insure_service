// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.policy;

import java.math.BigDecimal;

public class Documents
{
    private String documentName;
    private String document;
    private String fileType;
    private String documentType;
    private BigDecimal polBatchNo;
    private BigDecimal docCode;
    
    public BigDecimal getDocCode() {
        return this.docCode;
    }
    
    public void setDocCode(final BigDecimal docCode) {
        this.docCode = docCode;
    }
    
    public String getDocumentName() {
        return this.documentName;
    }
    
    public void setDocumentName(final String documentName) {
        this.documentName = documentName;
    }
    
    public String getFileType() {
        return this.fileType;
    }
    
    public void setFileType(final String fileType) {
        this.fileType = fileType;
    }
    
    public String getDocumentType() {
        return this.documentType;
    }
    
    public void setDocumentType(final String documentType) {
        this.documentType = documentType;
    }
    
    public BigDecimal getPolBatchNo() {
        return this.polBatchNo;
    }
    
    public void setPolBatchNo(BigDecimal polBatchNo) {
        polBatchNo = polBatchNo;
    }
    
    public String getDocument() {
        return this.document;
    }
    
    public void setDocument(final String document) {
        this.document = document;
    }
}
