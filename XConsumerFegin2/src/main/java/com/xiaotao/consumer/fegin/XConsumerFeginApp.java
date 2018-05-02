package com.xiaotao.consumer.fegin;

import com.xiaotao.consumer.fegin.config.ExcludeComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Created by 13725 on 2018/4/29.
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = ExcludeComponentScan.class)})
@EnableFeignClients
@EnableCircuitBreaker

@EnableHystrixDashboard    //运行hystrixDashboard 的监听   localhost:port/hystrix   放入到Dashboard中监控 http://localhost:7931/hystrix.stream
public class XConsumerFeginApp {

    public static void main(String[] args) {
        SpringApplication.run(XConsumerFeginApp.class);
    }
}
