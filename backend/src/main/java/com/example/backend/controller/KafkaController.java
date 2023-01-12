package com.example.backend.controller;
//package com.kafka.demo.service;

import com.example.backend.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
//https://velog.io/@qlgks1/3%EC%9E%A5.-%EC%B9%B4%ED%94%84%EC%B9%B4%EC%99%80-%EC%8A%A4%ED%94%84%EB%A7%81-%EB%B6%80%ED%8A%B8

//https://docs.spring.io/spring-kafka/reference/html/#preface


@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final KafkaProducer producer;

    @Autowired
    KafkaController(KafkaProducer producer) {
        this.producer = producer;
    }

    @PostMapping
    public String sendMessage(@RequestParam("message") String message) {
        this.producer.sendMessage(message);

        return "success";
    }
}
