package com.cloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xiaolh
 * @date 2019/12/13
 */
@SpringBootApplication
@EnableEurekaClient
public class UserApp {

    public static void main(String[] args) {
        SpringApplication.run(UserApp.class,args);
    }

}
