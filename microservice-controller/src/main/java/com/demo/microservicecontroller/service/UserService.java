package com.demo.microservicecontroller.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author libing
 * @desc feign
 * @date 2018/5/28 13:39
 */
@FeignClient("microservice-user")  //服务提供者的名字
public interface UserService {
    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    String hello();
}
