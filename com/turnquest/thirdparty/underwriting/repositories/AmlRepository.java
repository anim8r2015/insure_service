// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.repositories;

import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;
import com.turnquest.thirdparty.underwriting.entities.AgencyAmlInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmlRepository extends JpaRepository<AgencyAmlInfo, BigDecimal>
{
    @Query("SELECT c FROM AgencyAmlInfo c WHERE c.riskId = ?1")
    AgencyAmlInfo findAmlByRiskId(final String p0);
}
