package com.pandi.kafka.Controller;


import com.pandi.kafka.Service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produce")
public class ProducerController {


    @Autowired
    ProducerService producerService;

    @GetMapping("/{message}")
    public ResponseEntity sendmessage(@PathVariable String message){

        producerService.produceMessage(message);
        return new ResponseEntity<>(true, HttpStatus.CREATED);
    }

}
