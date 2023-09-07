package com.example.cloudalibabaconsumerorder83.controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class OrderController {

    @Value("${service-url.nacos-user-service}")
    private String ServerURL;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id){
        return restTemplate.getForObject(ServerURL+"/payment/nacos/"+id,String.class);
    }
}
