package com.xuning.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UpcOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpcOrderApplication.class, args);
    }

}
