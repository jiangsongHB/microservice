package com.demo.microserviceuser.api;

import com.demo.microserviceuser.service.TestService;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author libing
 * @desc
 * @date 2018/5/20 15:04
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @Value("${foo}")
    String foo;

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String hello(){
        return testService.getMsg()+foo;
    }
}
