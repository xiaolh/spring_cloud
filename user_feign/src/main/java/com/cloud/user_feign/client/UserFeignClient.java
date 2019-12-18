package com.cloud.user_feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xiaolh
 * @date 2019/12/13
 */
@FeignClient(value = "user-data-service")
public interface UserFeignClient {

    @GetMapping("user/test")
    String userTest();

}
