package com.xiaotao.consumer.fegin.controller;


import com.xiaotao.consumer.fegin.client.UserFeginClient;
import com.xiaotao.consumer.fegin.client.UserFeginClientWithHystrix;
import com.xiaotao.consumer.fegin.client.UserFeginClientWithHystrixFactory;
import com.xiaotao.consumer.fegin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 13725 on 2018/4/28.
 */
@RestController
public class ConsumerController {

    @Autowired
    private UserFeginClient userFeginClient;

    @Autowired
    private UserFeginClientWithHystrix userFeginClientWithHystrix;

    @Autowired
    private UserFeginClientWithHystrixFactory userFeginClientWithHystrixFactory;

    @GetMapping("/consumer/{id}")
    public User findById(@PathVariable Long id) {
        return userFeginClient.findById(id);
    }

    @GetMapping("/consumer2/{id}")
    public User findById2(@PathVariable Long id) {
        return userFeginClientWithHystrix.findById2(id);
    }

    @GetMapping("/consumer3/{id}")
    public User findById3(@PathVariable Long id) {
        return userFeginClientWithHystrixFactory.findById3(id);
    }
}
