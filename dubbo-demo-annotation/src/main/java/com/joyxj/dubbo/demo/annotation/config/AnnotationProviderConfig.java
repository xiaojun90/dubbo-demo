package com.joyxj.dubbo.demo.annotation.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *  提供者配置类
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-24
 */

@Configuration
@EnableDubbo(scanBasePackages = "com.joyxj.dubbo.demo.annotation.impl")
@PropertySource("classpath:/dubbo-provider.properties")
public class AnnotationProviderConfig {
}
