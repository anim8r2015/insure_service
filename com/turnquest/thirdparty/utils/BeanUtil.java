// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContextAware;

@Service
public class BeanUtil implements ApplicationContextAware
{
    private static ApplicationContext context;
    
    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
        BeanUtil.context = applicationContext;
    }
    
    public static <T> T getBean(final Class<T> beanClass) {
        return (T)BeanUtil.context.getBean((Class)beanClass);
    }
}
