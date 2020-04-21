package com.darryl.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: Darryl
 * @Description: gateway boot application
 * @Date: 2020/04/21
 */
@SpringBootApplication
@EnableZuulProxy
public class GatewayBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayBootApplication.class, args);
	}
}
