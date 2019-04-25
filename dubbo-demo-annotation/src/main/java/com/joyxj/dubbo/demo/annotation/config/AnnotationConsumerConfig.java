package com.joyxj.dubbo.demo.annotation.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 消费者配置
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-24
 */
@Configuration
@PropertySource("classpath:/dubbo-consumer.properties")
@ComponentScan(value = {"com.joyxj.dubbo.demo.annotation.action"})
@EnableDubbo(scanBasePackages = {"com.joyxj.dubbo.demo.annotation.action"})
public class AnnotationConsumerConfig {
}
