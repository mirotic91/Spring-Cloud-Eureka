package com.mirotic.clientproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientProductApplication.class, args);
    }

}
