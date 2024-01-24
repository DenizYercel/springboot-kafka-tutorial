package com.denizyercel.springboot.kafka;


import com.denizyercel.springboot.payload.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = "${spring.kafka.topic-json.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void consume(User user){
        System.out.println("user bilgileri alındı.");
    }
}
