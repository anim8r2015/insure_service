// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.repositories;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;
import com.turnquest.thirdparty.underwriting.entities.AgencyDocumentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<AgencyDocumentInfo, BigDecimal>
{
    @Query("SELECT c FROM AgencyDocumentInfo c WHERE c.polBatchNo = ?1")
    AgencyDocumentInfo findDocumentsByBatchNo(final BigDecimal p0);
    
    @Query("SELECT q FROM  AgencyDocumentInfo q WHERE  q.polBatchNo = :polBatchNo and documentName=:documentName")
    AgencyDocumentInfo findByDocName(@Param("documentName") final String p0, @Param("polBatchNo") final BigDecimal p1);
}
