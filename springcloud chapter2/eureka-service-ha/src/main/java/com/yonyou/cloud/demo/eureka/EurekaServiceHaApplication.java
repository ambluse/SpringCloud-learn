package com.yonyou.cloud.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceHaApplication.class, args);
	}
}
