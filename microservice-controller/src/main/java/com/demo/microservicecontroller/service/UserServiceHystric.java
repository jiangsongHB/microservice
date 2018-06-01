package com.demo.microservicecontroller.service;

import org.springframework.stereotype.Component;

/**
 * @author libing
 * @desc  hystric断路器
 * @date 2018/6/1 10:18
 */
@Component
public class UserServiceHystric implements UserService {
    @Override
    public String hello(String name){
        return "sorry " + name;
    }
}
