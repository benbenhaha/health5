package com.benben.health.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private BaseIntecepter baseIntecepter;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(baseIntecepter).addPathPatterns("/**").excludePathPatterns("/*","/img/**");
    }
}
