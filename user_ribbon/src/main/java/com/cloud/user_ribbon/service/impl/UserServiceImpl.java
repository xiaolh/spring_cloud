package com.cloud.user_ribbon.service.impl;

import com.cloud.user_ribbon.client.UserRibbonClient;
import com.cloud.user_ribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaolh
 * @date 2019/12/13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRibbonClient userClientRibbon;

    @Override
    public String userTest() {
        return userClientRibbon.userTest();
    }

}
