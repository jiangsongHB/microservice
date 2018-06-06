package com.demo.microservicecontroller.controller;

import com.demo.microservicecontroller.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libing
 * @desc
 * @date 2018/6/3 0:17
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "order/test",method = RequestMethod.GET)
    public String test(){
        return orderService.hello("libing");
    }
}
