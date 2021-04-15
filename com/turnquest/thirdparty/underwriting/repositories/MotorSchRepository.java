// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.math.BigDecimal;
import com.turnquest.thirdparty.underwriting.entities.AgencyMotorSchInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotorSchRepository extends JpaRepository<AgencyMotorSchInfo, BigDecimal>
{
    @Query("SELECT q FROM  AgencyMotorSchInfo q WHERE  q.riskIpuCode = :riskIpuCode")
    AgencyMotorSchInfo findByRiskIpuCode(@Param("riskIpuCode") final BigDecimal p0);
}
