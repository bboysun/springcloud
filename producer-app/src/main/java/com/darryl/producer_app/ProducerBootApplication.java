package com.darryl.producer_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Darryl
 * @Description: 服务提供者的boot application
 * @Date: created in 2020/4/1 20:39
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProducerBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerBootApplication.class, args);
    }
}
