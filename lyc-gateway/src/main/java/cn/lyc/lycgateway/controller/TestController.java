package cn.lyc.lycgateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/aa")
    public String aa(){

        return "aa";
    }
}
