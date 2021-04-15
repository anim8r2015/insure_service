// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.repositories;

import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;
import com.turnquest.thirdparty.underwriting.entities.AgencyClientInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<AgencyClientInfo, BigDecimal>
{
    @Query("SELECT c FROM AgencyClientInfo c WHERE c.code = ?1")
    AgencyClientInfo findClientByClntCode(final BigDecimal p0);
}
