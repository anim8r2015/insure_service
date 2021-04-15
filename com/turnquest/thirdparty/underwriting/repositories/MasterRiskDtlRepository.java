// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.math.BigDecimal;
import com.turnquest.thirdparty.underwriting.entities.MasterRiskDtls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterRiskDtlRepository extends JpaRepository<MasterRiskDtls, BigDecimal>
{
    @Query("SELECT q FROM  MasterRiskDtls q WHERE  q.tableName = :tableName and ipuId=:ipuId and columnvalues=:columnvalues")
    MasterRiskDtls findByIpuCode(@Param("tableName") final String p0, @Param("ipuId") final BigDecimal p1, @Param("columnvalues") final String p2);
}
