// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.configuration.oauth2;

import org.springframework.context.annotation.Profile;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableResourceServer
@Profile({ "oauth2" })
public class Oauth2Resource
{
}
