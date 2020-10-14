package cn.lyc.lycweb2.controller;

import cn.lyc.lycweb2.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/")
    public String getFromWeb1(){
        return "this is from lyc-provide1: " + feignService.getFromWeb1();
    }
}
