package com.joyxj.dubbo.demo.spring.boot.consumer;

import com.joyxj.dubbo.demo.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference(group = "demo-spring-boot",version = "1.0.0")
    public DemoService demoService;

    @RequestMapping(value = "sayHello")
    public String sayHello() {
        return demoService.sayHello("xiaojun");
    }
}
