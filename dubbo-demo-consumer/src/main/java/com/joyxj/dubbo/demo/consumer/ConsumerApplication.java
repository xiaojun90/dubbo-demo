package com.joyxj.dubbo.demo.consumer;

import com.joyxj.dubbo.demo.api.DemoService;
import com.joyxj.dubbo.demo.api.UserService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

/**
 * 消费者
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-11
 */
public class ConsumerApplication {

    public static void main(String[] args) {
        // 应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig("dubbo-demo-consumer");
        // qos是dubbo的运维命令，默认是22222，为了防止与生产者冲突，设置成33333
        applicationConfig.setQosPort(33333);
        // 注册中心配置
        RegistryConfig registryConfig = new RegistryConfig("zookeeper://localhost:2181");
        // DemoService的配置
        ReferenceConfig<DemoService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(DemoService.class);
        DemoService demoService = referenceConfig.get();
        String msg = demoService.sayHello("xiaojun");
        System.out.println(msg);
        // UserService的配置
        ReferenceConfig<UserService> userServiceReferenceConfig = new ReferenceConfig<>();
        userServiceReferenceConfig.setApplication(applicationConfig);
        userServiceReferenceConfig.setRegistry(registryConfig);
        userServiceReferenceConfig.setInterface(UserService.class);
        UserService userService = userServiceReferenceConfig.get();
        System.out.println(userService.getAge("xiaojun"));
    }
}
