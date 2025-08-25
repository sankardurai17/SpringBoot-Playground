package com.example.CarUser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CarUserConsumer {

    @KafkaListener(topics="cab-location",groupId = "user-group")
    public void listenToUpdates(String location){
        System.out.println(location);
    }
}
