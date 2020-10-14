package cn.lyc.lyckafka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping("/hello")
    public String helloKafka(){
        return "hello kafka";
    }
}
