package cn.lyc.lycweb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class LycWeb2Application {

    public static void main(String[] args) {
        SpringApplication.run(LycWeb2Application.class, args);
    }

}
