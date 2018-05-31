package com.demo.microservicecontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients  //开启foeign
public class MicroserviceControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceControllerApplication.class, args);
	}
}
