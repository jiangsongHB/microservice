package com.demo.microservicecontroller.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author libing
 * @desc  feign client通过注册发现，调用zuul网关，间接调用服务提供者通过microservice-order
 * @date 2018/6/3 0:15
 */
@FeignClient("zuul-server")
public interface OrderService {
    @RequestMapping(value = "/api-order/hello",method = RequestMethod.GET)
    String hello(@RequestParam(value="name")String name);
}
