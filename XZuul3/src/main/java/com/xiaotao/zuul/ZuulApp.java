package com.xiaotao.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by 13725 on 2018/5/1.
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApp {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class);
    }
}
