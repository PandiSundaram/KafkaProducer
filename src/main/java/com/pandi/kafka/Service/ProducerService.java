package com.pandi.kafka.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;


@Service
public class ProducerService {


    @Autowired
    KafkaTemplate<String,Object> kafkaTemplate;

    public void produceMessage(String message){
        System.out.println(message);
       CompletableFuture<SendResult<String,Object>> r = kafkaTemplate.send("Payments",message);
       r.whenComplete((response,error) ->{

           System.out.println(response.toString());
           System.out.println( response.getRecordMetadata().offset());
           System.out.println( response.getRecordMetadata().partition());
       });


    }


}
