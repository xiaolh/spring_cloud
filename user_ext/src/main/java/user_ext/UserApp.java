package user_ext;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

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

    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }

}
