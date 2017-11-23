package com.yonyou.cloud.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.spring4all.swagger.EnableSwagger2Doc;

@SpringBootApplication
@EnableSwagger2Doc
@EnableDiscoveryClient
public class BootMApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMApplication.class, args);
	}
	
	
}
