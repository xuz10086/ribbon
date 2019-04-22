package com.example.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer")
    public String helloConsumer() {
        return restTemplate.getForEntity("http://Hello-Service/testDiscoveryClient",
                String.class).getBody();
    }
}
