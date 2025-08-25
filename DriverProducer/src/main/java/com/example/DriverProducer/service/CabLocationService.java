package com.example.DriverProducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @Autowired
    private CabLocationProducer  cabLocationProducer;

    public void updateLocation(int range) throws InterruptedException {
        while(range>0) {
            cabLocationProducer.sendLocation(Math.random()+","+Math.random());
            Thread.sleep(1000);
            range--;
        }
    }
}
