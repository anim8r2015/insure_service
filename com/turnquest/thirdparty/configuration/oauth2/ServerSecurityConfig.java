// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.configuration.oauth2;

import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(2147483640)
@Profile({ "oauth2" })
public class ServerSecurityConfig extends WebSecurityConfigurerAdapter
{
    public void configure(final WebSecurity web) throws Exception {
        web.ignoring().antMatchers(new String[] { "/v2/api-docs", "/configuration/ui", "/swagger-resources/**", "/configuration/**", "/swagger-ui.html", "/**" });
    }
}
