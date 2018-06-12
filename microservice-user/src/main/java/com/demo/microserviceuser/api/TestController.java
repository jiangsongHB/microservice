package com.demo.microserviceuser.api;

import com.demo.microserviceuser.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @date 2018/5/20 15:04
 */
@RestController
@RefreshScope
public class TestController {
    @Autowired
    private TestService testService;

    @Value("${foo}")
    String foo;

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String hello(){
        return testService.getMsg()+ " foo: " + foo;
    }
}
