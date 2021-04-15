// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.math.BigDecimal;
import com.turnquest.thirdparty.underwriting.entities.AgencyInsuredLimitsInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuredLimitsRepository extends JpaRepository<AgencyInsuredLimitsInfo, BigDecimal>
{
    @Query("SELECT q FROM  AgencyInsuredLimitsInfo q WHERE  q.riskIpuCode = :riskIpuCode and shortDescription=:shortDescription")
    AgencyInsuredLimitsInfo findByShortDescription(@Param("shortDescription") final String p0, @Param("riskIpuCode") final BigDecimal p1);
}
