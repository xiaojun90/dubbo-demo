package com.joyxj.dubbo.demo.api;

/**
 * 用户信息接口
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-11
 */
public interface UserService {
    /**
     * 获得年龄
     * @param name
     * @return
     */
    String getAge(String name);
}
