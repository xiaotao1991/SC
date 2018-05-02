package com.xiaotao.test.XServcer1.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.xiaotao.test.XServcer1.Service.UserService;
import com.xiaotao.test.XServcer1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 13725 on 2018/4/28.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private EurekaClient eurekaClient;


    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findUserById(id);
    }

    @GetMapping("/eureka-instance")
    public String serviceUrl() {
        InstanceInfo instanceInfo = this.eurekaClient.getNextServerFromEureka("XSERVER1", false);
        return instanceInfo.getHomePageUrl();
    }
}
