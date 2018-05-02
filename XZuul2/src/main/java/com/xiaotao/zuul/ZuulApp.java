package com.xiaotao.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

/**
 * Created by 13725 on 2018/5/1.
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApp {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class);
    }

    /**
     * zuul正则表达式的匹配    http://192.168.25.1:7961/v1/xserver1/simple/3      版本/服务名字
     *
     * @return
     */
    @Bean
    public PatternServiceRouteMapper serviceRouteMapper() {
        return new PatternServiceRouteMapper(
                "(?<name>^.+)-(?<version>v.+$)",
                "${version}/${name}");
    }
}
