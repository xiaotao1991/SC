package com.xiaotao.test.XConsumer1.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xiaotao.test.XConsumer1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/consumer/{id}")
    public User findById(@PathVariable Long id) {
        //String url="http://localhost:7900/simple/";
        String url = "http://xserver1:7900/simple/";   //服务名   虚拟IP
        User forObject = restTemplate.getForObject(url + id, User.class);
        return forObject;
    }

    @GetMapping("/test")
    public String test() {
        //String url="http://localhost:7900/simple/";
        String url = "http://xserver1:7900/simple/";   //服务名   虚拟IP
        ServiceInstance xServer1 = loadBalancerClient.choose("xserver1");
        return "service-id:" + xServer1.getServiceId() + "====port" + xServer1.getPort();
    }

    @GetMapping("/consumer2/{id}")
    @HystrixCommand(fallbackMethod = "findById2FallCallback")
    public User findById2(@PathVariable Long id) {
        //String url="http://localhost:7900/simple/";
        String url = "http://xserver1:7900/simple/";   //服务名   虚拟IP
        User forObject = restTemplate.getForObject(url + id, User.class);
        return forObject;
    }

    /**
     * 调用失败的错误回调   注意参数，和返回值要和源方法一致
     * @param id
     * @return
     */
    public User findById2FallCallback(Long id) {
        User user = new User();
        user.setUsername("fallCallback");
        return user;
    }


}
