package cn.lyc.lyckafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"lyc-1"})
    public void listen(ConsumerRecord consumerRecord){

        Optional<Object> kafkaMsg = Optional.ofNullable(consumerRecord.value());
        if(kafkaMsg.isPresent()){
            Object msg = kafkaMsg.get();
            System.out.println("监听到---------- " + msg);
        }
    }
}
