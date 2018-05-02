package com.xiaotao.consumer.fegin.client;

import com.xiaotao.consumer.fegin.config.FeginConfiguration;
import com.xiaotao.consumer.fegin.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 13725 on 2018/4/29.
 */
@FeignClient("xserver1")
//@FeignClient(name = "XServer1",configuration = FeginConfiguration.class)
public interface UserFeginClient {

    @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id);
}
