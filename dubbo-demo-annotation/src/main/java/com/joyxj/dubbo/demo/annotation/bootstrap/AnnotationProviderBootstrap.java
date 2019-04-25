package com.joyxj.dubbo.demo.annotation.bootstrap;

import com.joyxj.dubbo.demo.annotation.config.AnnotationProviderConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  提供者启动类
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-24
 */
public class AnnotationProviderBootstrap {

    public static void main(String[] args) throws Exception {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AnnotationProviderConfig.class);
        context.start();
        System.in.read();

    }
}
