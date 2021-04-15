// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.repositories;

import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.math.BigDecimal;
import com.turnquest.thirdparty.underwriting.entities.InsPolicyInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsPolicyInfoRepository extends JpaRepository<InsPolicyInfo, BigDecimal>
{
    @Query("SELECT p FROM InsPolicyInfo p WHERE ((p.policyCode=?1) OR (?1 IS NULL ))AND p.processStatus='P'")
    List<InsPolicyInfo> findPolicyInfo(final BigDecimal p0);
    
    List<InsPolicyInfo> findBrkPolicyInfoByPolicyCode(final BigDecimal p0);
}
