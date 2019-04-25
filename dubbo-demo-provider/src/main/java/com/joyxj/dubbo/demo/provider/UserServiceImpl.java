package com.joyxj.dubbo.demo.provider;

import com.joyxj.dubbo.demo.api.UserService;

import java.util.Random;

/**
 * 【功能描述】
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-04-11
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getAge(String name) {

        int age = new Random().nextInt(100) + 1;
        return name + " : " + age;
    }
}
