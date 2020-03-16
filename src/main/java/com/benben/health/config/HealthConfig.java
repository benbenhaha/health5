package com.benben.health.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName HealthConfig
 * @Description TODO
 * @Author zeny
 * @Date 2020/3/12 0012 23:35
 */
@Configuration
@MapperScan(basePackages = "com.benben.health.mapper")
public class HealthConfig {
}
