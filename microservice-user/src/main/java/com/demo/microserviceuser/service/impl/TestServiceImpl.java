package com.demo.microserviceuser.service.impl;

import com.demo.microserviceuser.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.beans.Transient;

/**
 * @author libing
 * @desc
 * @date 2018/5/20 14:04
 */
@Service("testService")
@RefreshScope
public class TestServiceImpl implements TestService {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

//    @Value("${test}")
//    private String test;

    public String getMsg(){
        String services = "Services: " + discoveryClient.getServices()+" port :"+port;
        System.out.println(services);
        return services;
    }
}
