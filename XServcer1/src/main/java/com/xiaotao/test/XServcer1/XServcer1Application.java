package com.xiaotao.test.XServcer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class XServcer1Application {

	public static void main(String[] args) {
		SpringApplication.run(XServcer1Application.class, args);
	}
}
