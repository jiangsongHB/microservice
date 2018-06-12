package com.demo.microserviceorder.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author libing
 * @desc
 * @date 2018/6/3 0:05
 */
@RestController
@RefreshScope
public class OrderTestController {
    @Value("${foo}")
    String foo;

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "order foo:"+foo;
    }
}
