package cn.lyc.lycweb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LycWeb1Application {

    public static void main(String[] args) {
        SpringApplication.run(LycWeb1Application.class, args);
    }

}
