package com.example.cloudalibabaseata2001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.example.cloudalibabaseata2001.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudAlibabaSeata2001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaSeata2001Application.class, args);
    }

}
