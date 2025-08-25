package com.example.DriverProducer.controller;

import com.example.DriverProducer.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/driver")
public class DriverController {

    @Autowired
    private CabLocationService cabLocationService;


    @PutMapping("/updateLocation")
    public ResponseEntity updateCarLocation() throws InterruptedException {
        System.out.println("Inside controller");
        cabLocationService.updateLocation(100);
        return new ResponseEntity<>(Map.of("message","Location updated successfully"), HttpStatus.OK);
    }

}
