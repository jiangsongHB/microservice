package com.demo.microserviceorder.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author libing
 * @desc  zipkin客户端
 * @date 2018/6/12 18:49
 */
@RestController
public class ZipkinOrderController {
    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }

    @RequestMapping("serviceInfo")
    public String serviceInfo(){
        return "order service zipkin client";
    }

    @RequestMapping(value = "/hi")
    public String hi(){
        return restTemplate.getForObject("http://localhost:1112/serviceInfo",String.class);
    }
}
