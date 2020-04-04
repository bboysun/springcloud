package com.darryl.consumer_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: Darryl
 * @Description: consumer boot application
 * @Date: created in 2020/4/1 21:08
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class ConsumerBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerBootApplication.class, args);
    }
}
