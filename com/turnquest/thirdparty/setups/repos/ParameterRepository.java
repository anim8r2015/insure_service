// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.setups.repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.turnquest.thirdparty.setups.entities.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParameterRepository extends JpaRepository<Parameter, Long>
{
    @Query("SELECT p FROM Parameter p  WHERE  p.name = :name  AND p.status = 'ACTIVE' ")
    Parameter getSysParamValueExt(@Param("name") final String p0);
}
