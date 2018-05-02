package com.xiaotao.test.XConsumer1;

import com.xiaotao.test.XConsumer1.config.ExcludeComponentScan;
import com.xiaotao.test.XConsumer1.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = ExcludeComponentScan.class)})
@RibbonClient(name = "XServer1", configuration = RibbonConfig.class)     //自定义RibbonClient
@EnableCircuitBreaker
public class XConsumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(XConsumer1Application.class, args);
    }

    @Bean
    @LoadBalanced   //Ribbon  提供负载均衡的能力
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
