// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.repositories;

import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;
import com.turnquest.thirdparty.underwriting.entities.AgencyRiskInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskRepository extends JpaRepository<AgencyRiskInfo, BigDecimal>
{
    @Query("SELECT q FROM  AgencyRiskInfo q WHERE  q.riskIpuCode = ?1")
    AgencyRiskInfo findByIpuId(final BigDecimal p0);
}
