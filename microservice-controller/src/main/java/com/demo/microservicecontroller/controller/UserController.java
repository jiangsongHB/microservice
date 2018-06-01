package com.demo.microservicecontroller.controller;

import com.demo.microservicecontroller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libing
 * @desc
 * @date 2018/5/28 13:44
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return userService.hello("libing");
    }

}
