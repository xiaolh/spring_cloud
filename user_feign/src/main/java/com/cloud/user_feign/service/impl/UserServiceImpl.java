package com.cloud.user_feign.service.impl;

import com.cloud.user_feign.client.UserFeignClient;
import com.cloud.user_feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaolh
 * @date 2019/12/13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserFeignClient userClientRibbon;

    @Override
    public String userTest() {
        return userClientRibbon.userTest();
    }

}
