package org.lxd.learn.bootm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring4all.swagger.EnableSwagger2Doc;

@SpringBootApplication
@EnableSwagger2Doc
public class BootMApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMApplication.class, args);
	}
}
