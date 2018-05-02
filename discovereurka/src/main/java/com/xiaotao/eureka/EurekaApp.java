package com.xiaotao.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 13725 on 2018/4/29.
 */
@SpringBootApplication
@EnableEurekaServer  //服务的服务端  localhost:port  可以观察服务
public class EurekaApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApp.class, args);
    }
}
