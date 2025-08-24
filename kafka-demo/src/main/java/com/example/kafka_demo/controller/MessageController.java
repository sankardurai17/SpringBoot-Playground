package com.example.kafka_demo.controller;

import com.example.kafka_demo.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*Basic controller class get messages from client this is a rest api that recieves messages from client.
* this messages published by a producer to consumer*/

@RestController
@RequestMapping("rest/api")
public class MessageController {

    @Autowired
    private MessageProducer producer;

    @GetMapping("/producerMessage")
    public void getMessageFromClient(@RequestParam String message) {
        producer.sendMessage(message);
    }

    @GetMapping("/producerMessage2")
    public void sendToTopic2(@RequestParam String message) {
        producer.sendMessage2(message);
    }
}
