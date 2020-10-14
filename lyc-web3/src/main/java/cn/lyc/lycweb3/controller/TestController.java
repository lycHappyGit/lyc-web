package cn.lyc.lycweb3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class TestController {

    @RequestMapping("/test1")
    public String aa(){
        return "success this is lyc-web3 test1 method";
    }
}
