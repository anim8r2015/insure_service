// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;
import com.turnquest.thirdparty.underwriting.entities.AgencyPolicyInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<AgencyPolicyInfo, BigDecimal>
{
    @Query("SELECT p FROM AgencyPolicyInfo p WHERE ((p.policyCode=?1))")
    AgencyPolicyInfo findPolicyInfo(final BigDecimal p0);
    
    List<AgencyPolicyInfo> findBrkPolicyInfoByPolicyCode(final BigDecimal p0);
}
