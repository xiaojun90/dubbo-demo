package com.joyxj.dubbo.demo.annotation.action;

import com.joyxj.dubbo.demo.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * 【功能描述】
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-24
 */
@Component("annotationDemoAction")
public class AnnotationDemoAction {


    @Reference
    private DemoService demoService;

    public String sayHello(String name) {

        return demoService.sayHello(name);
    }
}
