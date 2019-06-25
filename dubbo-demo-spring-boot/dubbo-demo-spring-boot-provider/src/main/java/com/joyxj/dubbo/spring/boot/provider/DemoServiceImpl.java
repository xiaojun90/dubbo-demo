package com.joyxj.dubbo.spring.boot.provider;

import com.joyxj.dubbo.demo.api.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * 【功能描述】
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-06-20
 */
@Service(group = "demo-spring-boot",version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Value("${dubbo.protocol.port}")
    public String port;

    public String sayHello(String name) {
        return "hello spring boot," + name + ",port:" + port;
    }
}
