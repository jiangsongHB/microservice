package com.demo.microserviceorder.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libing
 * @desc
 * @date 2018/6/3 0:05
 */
@RestController
public class OrderTestController {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "order api";
    }
}
