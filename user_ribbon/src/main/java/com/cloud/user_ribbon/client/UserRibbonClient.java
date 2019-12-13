package com.cloud.user_ribbon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiaolh
 * @date 2019/12/13
 */
@Component
public class UserRibbonClient {

    @Autowired
    private RestTemplate restTemplate;

    public String userTest(){
        return restTemplate.getForObject("http://user-data-service/user/test",String.class);
    }

}
