package com.darryl.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: Darryl
 * @Description: Eureka server boot application
 * @Date: created in 2020/4/1 20:17
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBootApplication.class, args);
    }
}
