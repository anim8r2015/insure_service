// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.setups.repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.turnquest.thirdparty.setups.entities.GisParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GisParameterRepository extends JpaRepository<GisParameter, Long>
{
    @Query("SELECT p FROM GisParameter p  WHERE  p.name = :name  AND p.status = 'ACTIVE' ")
    GisParameter getGisSysParamValueExt(@Param("name") final String p0);
}
