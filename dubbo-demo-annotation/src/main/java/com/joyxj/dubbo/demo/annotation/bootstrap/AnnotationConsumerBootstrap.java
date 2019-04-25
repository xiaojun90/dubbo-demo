package com.joyxj.dubbo.demo.annotation.bootstrap;

import com.joyxj.dubbo.demo.annotation.action.AnnotationDemoAction;
import com.joyxj.dubbo.demo.annotation.config.AnnotationConsumerConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 【功能描述】
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-24
 */
public class AnnotationConsumerBootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AnnotationConsumerConfig.class);
        context.start();
        AnnotationDemoAction demoAction
                = (AnnotationDemoAction)context.getBean("annotationDemoAction");
        System.out.println(demoAction.sayHello("xiaojun"));
    }
}
