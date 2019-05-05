package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableScheduling
@ServletComponentScan("com.boot.common.filter")
public class EedaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EedaServiceApplication.class, args);
	}
	
}
