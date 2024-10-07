package com.multiDatabase.jpa.config;

import com.multiDatabase.jpa.interceptor.LoggingInterceptors;
import com.multiDatabase.jpa.interceptor.RequestInterceptor;
import com.multiDatabase.jpa.interceptor.SecurityInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private LoggingInterceptors loggingInterceptors;

    @Autowired
    private RequestInterceptor requestInterceptor;

    @Autowired
    private SecurityInterceptor securityInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //These will be executed in order of their registration.
        registry.addInterceptor(loggingInterceptors);
        registry.addInterceptor(requestInterceptor);
        registry.addInterceptor(securityInterceptor).addPathPatterns("/secure/**");
    }
}
