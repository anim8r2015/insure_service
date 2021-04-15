// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty;

import org.springframework.web.client.RestTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import java.util.concurrent.Executor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableAsync
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ThirdPartyApplication
{
    @Bean
    public Executor asyncExecutor() {
        final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(Runtime.getRuntime().availableProcessors());
        executor.setMaxPoolSize(Runtime.getRuntime().availableProcessors());
        executor.setQueueCapacity(1000);
        executor.setThreadNamePrefix("thirdparty-");
        executor.initialize();
        return (Executor)executor;
    }
    
    public static void main(final String[] args) {
        SpringApplication.run((Object)ThirdPartyApplication.class, args);
    }
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
