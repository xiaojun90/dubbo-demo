package com.joyxj.dubbo.demo.provider;

import com.joyxj.dubbo.demo.api.DemoService;

/**
 * 【功能描述】
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-11
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
