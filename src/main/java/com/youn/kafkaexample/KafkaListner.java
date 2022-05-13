package com.youn.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListner {

    @KafkaListener(topics = "abedosTopic",
            groupId = "first")
    void listner (String data)
    {
        System.out.println("listned notification:"+data+":]");
    }

}
