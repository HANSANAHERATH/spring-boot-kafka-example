package com.kafka.example.springbootkafkaexample.controllers;

import com.kafka.example.springbootkafkaexample.publish.PublishMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/publish")
public class PublishController {

    @Autowired
    private PublishMessages publishMessages;

    @GetMapping
    public String publishMessage(@RequestParam("message") String message){
        publishMessages.sendMessage(message);
        return "Message published";
    }
}
