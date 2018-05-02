package com.xiaotao.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by 13725 on 2018/5/1.
 */
@SpringBootApplication
@EnableTurbine
public class TurbineApp {

    public static void main(String[] args) {
        SpringApplication.run(TurbineApp.class);
    }
}
