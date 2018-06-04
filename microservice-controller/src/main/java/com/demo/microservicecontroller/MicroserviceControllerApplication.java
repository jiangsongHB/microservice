package com.demo.microservicecontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients  //开启foeign
@EnableHystrix       //开启断路器
@EnableHystrixDashboard  //开启HystrixDashboard监控器
@EnableZuulProxy  //开启网关zuul
public class MicroserviceControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceControllerApplication.class, args);
	}
}
