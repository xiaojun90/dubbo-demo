package com.joyxj.dubbo.demo.provider;

import com.joyxj.dubbo.demo.api.DemoService;
import com.joyxj.dubbo.demo.api.UserService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

/**
 * 启动类
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-11
 */
public class ProviderApplication {

    public static void main(String[] args) throws Exception{
        // 应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig("dubbo-demo-provider");
        // qos是dubbo的运维命令
        applicationConfig.setQosPort(22222);
        // 采用zookeeper作为注册中心
        RegistryConfig registryConfig = new RegistryConfig("zookeeper://localhost:2181");
        // DemoService的配置
        ServiceConfig<DemoServiceImpl> serviceConfig = new ServiceConfig<>();
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setInterface(DemoService.class);
        serviceConfig.setRef(new DemoServiceImpl());
        serviceConfig.export();
        // UserService的配置
        ServiceConfig<UserService> userServiceServiceConfig = new ServiceConfig<>();
        userServiceServiceConfig.setApplication(applicationConfig);
        userServiceServiceConfig.setRegistry(registryConfig);
        userServiceServiceConfig.setInterface(UserService.class);
        userServiceServiceConfig.setRef(new UserServiceImpl());
        userServiceServiceConfig.export();
        System.in.read();
    }
}
