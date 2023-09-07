package com.example.cloudalibabanacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaNacosApplication.class, args);
    }

}
