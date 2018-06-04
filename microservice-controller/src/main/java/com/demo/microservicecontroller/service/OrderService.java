package com.demo.microservicecontroller.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author libing
 * @desc
 * @date 2018/6/3 0:15
 */
@FeignClient("microservice-order")
public interface OrderService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello(@RequestParam(value="name")String name);
}
