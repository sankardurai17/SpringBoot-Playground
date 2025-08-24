package com.example.kafka_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


/*Message producer is a kafka producer which sends messages to specific topics.*/
@Service
public class MessageProducer {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    public void sendMessage(String message) {
        kafkaTemplate.send("topicDemoMessage", message);
    }

    public void sendMessage2(String message) {
        kafkaTemplate.send("topicDemoMessage2", message);
    }
}
