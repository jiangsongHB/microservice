package com.demo.microserviceuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 使用注解@EnableEurekaClient开启注册功能，激活Eureka的DiscoveryClient实现
 * @author : libing
 * @date   : 2018/5/19
 */
@EnableEurekaClient
@SpringBootApplication
//@EnableFeignClients  //开启foeign
//@EnableHystrix       //开启断路器
//@EnableHystrixDashboard  //开启HystrixDashboard监控器
public class MicroserviceUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceUserApplication.class, args);
	}
}
