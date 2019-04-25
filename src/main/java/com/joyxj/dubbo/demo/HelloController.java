package com.joyxj.dubbo.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【功能描述】
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-10
 */
@RestController
public class HelloController {

    @RequestMapping("hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "hello world," + name;
    }
}
