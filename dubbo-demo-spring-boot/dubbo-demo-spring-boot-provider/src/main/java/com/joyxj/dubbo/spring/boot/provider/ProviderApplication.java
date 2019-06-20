package com.joyxj.dubbo.spring.boot.provider;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * 【功能描述】
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-06-20
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.joyxj.dubbo.spring.boot.provider")
@EnableDubboConfig
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

    @PostConstruct
    public void init() throws Exception {
        CuratorFramework zkClient = CuratorFrameworkFactory.builder().
                connectString("192.168.18.128:2181").
                retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();
        zkClient.start();

        if (zkClient.checkExists().forPath("/dubbo/config/dubbo/dubbo.properties") == null) {
            zkClient.create().creatingParentsIfNeeded().forPath("/dubbo/config/dubbo/dubbo.properties");
        }
        zkClient.setData().forPath("/dubbo/config/dubbo/dubbo.properties", ("dubbo.registry.address=zookeeper://192.168.18.128:2181\n" +
                "dubbo.metadata-report.address=zookeeper://192.168.18.128:2181").getBytes());
    }
}
