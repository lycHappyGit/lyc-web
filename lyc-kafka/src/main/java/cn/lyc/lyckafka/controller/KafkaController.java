package cn.lyc.lyckafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/send")
    @Transactional(rollbackFor = RuntimeException.class)
    public String send(String msg){

        kafkaTemplate.send("lyc-1", msg);
        if(msg.equals("error")){
            throw new RuntimeException("input is error");
        }
        kafkaTemplate.send("lyc-1", msg+" anthor");
        return "success " + msg;
    }
}
