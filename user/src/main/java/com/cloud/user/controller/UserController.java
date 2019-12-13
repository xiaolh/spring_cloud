package com.cloud.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaolh
 * @date 2019/12/13
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("test")
    public String userTest(){
        return "SUCCESS";
    }

}
