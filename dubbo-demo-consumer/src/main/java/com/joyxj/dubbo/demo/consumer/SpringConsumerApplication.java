package com.joyxj.dubbo.demo.consumer;

import com.joyxj.dubbo.demo.api.DemoService;
import com.joyxj.dubbo.demo.api.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于spring的消费方启动类
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-18
 */
public class SpringConsumerApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application-consumer.xml");
        DemoService demoService = (DemoService) context.getBean("demoService");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(demoService.sayHello("xiaojun"));
        System.out.println(userService.getAge("xiaojun"));
    }
}
