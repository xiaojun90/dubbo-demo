package com.joyxj.dubbo.demo.api;

/**
 * 测试接口类
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-11
 */
public interface DemoService {

    /**
     * 测试方法
     * @param name 名称
     * @return String
     */
    String sayHello(String name);
}
