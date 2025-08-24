package com.example.kafka_demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

/*Consumer class acts as a consumer where each topics are grouped by group id and listen separately.
* Consumer listen messages on specific topics whenever it is available it will do the action
*  Within a group, Kafka assigns partitions across running instances for load balancing,
 * preserving per-key ordering within each partition. This listener logs the topic, partition,
 * and offset for every consumed record.*/
@Service
public class Consumer {

    @KafkaListener(topics = {"topicDemoMessage","topicDemoMessage2"},groupId = "demoMessageGroup")
    public void listenToTopics(String receivedMessage,@Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
                               @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
                               @Header(KafkaHeaders.OFFSET) long offset){
        System.out.printf("From %s p=%d off=%d -> %s%n", topic, partition, offset, receivedMessage);
    }
}
