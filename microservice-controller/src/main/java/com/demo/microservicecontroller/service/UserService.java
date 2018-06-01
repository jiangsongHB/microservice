package com.demo.microservicecontroller.service;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author libing
 * @desc feign client
 * @date 2018/5/28 13:39
 */
@FeignClient(value = "microservice-user",fallback = UserServiceHystric.class)  //服务提供者的名字
public interface UserService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello(@RequestParam(value="name")String name);
}
