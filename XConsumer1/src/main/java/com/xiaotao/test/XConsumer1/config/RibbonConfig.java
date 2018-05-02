package com.xiaotao.test.XConsumer1.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 13725 on 2018/4/29.
 */
@Configuration
@ExcludeComponentScan
public class RibbonConfig {

    @Autowired
    IClientConfig config;

    @Bean
    public IRule ribbnonRule(IClientConfig config) {
        return new RandomRule();
    }
}
