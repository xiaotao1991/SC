package com.xiaotao.consumer.fegin.config;

import feign.Contract;
import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 13725 on 2018/4/29.
 */
@Configuration
@ExcludeComponentScan
public class FeginConfiguration {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

}
