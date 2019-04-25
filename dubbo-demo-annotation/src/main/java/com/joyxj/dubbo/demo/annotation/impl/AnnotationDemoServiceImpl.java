package com.joyxj.dubbo.demo.annotation.impl;

import com.joyxj.dubbo.demo.api.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 基于注解的demo实现类
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-24
 */
@Service
public class AnnotationDemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "annotation: hello, " + name;
    }
}
