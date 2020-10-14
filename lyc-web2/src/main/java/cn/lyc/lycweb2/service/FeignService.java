package cn.lyc.lycweb2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "lyc-provider")
public interface FeignService {

    @GetMapping("/hello")
    public String getFromWeb1();
}
