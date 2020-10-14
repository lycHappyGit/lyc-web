package cn.lyc.lycweb1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("--------被调用-------");
        return "hello this is lyc-web1";
    }
}
