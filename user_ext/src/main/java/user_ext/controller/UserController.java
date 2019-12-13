package user_ext.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user_ext.service.UserService;

/**
 * @author xiaolh
 * @date 2019/12/13
 */
@RestController
@RequestMapping("user_ext")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("test")
    public String userTest(){
        return userService.userTest();
    }

}
