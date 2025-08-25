package com.example.DriverProducer.service;

import com.example.DriverProducer.util.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationProducer {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean sendLocation(String location){
        kafkaTemplate.send(AppConstant.CAB_LOCATION, location);
        return true;
    }

}
