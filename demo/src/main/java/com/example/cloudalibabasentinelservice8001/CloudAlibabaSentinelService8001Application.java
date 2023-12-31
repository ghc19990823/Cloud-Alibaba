package com.example.cloudalibabasentinelservice8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaSentinelService8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaSentinelService8001Application.class, args);
    }

}
