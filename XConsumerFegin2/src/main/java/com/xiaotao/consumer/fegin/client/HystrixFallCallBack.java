package com.xiaotao.consumer.fegin.client;

import com.xiaotao.consumer.fegin.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created by 13725 on 2018/4/30.
 */
@Component
public class HystrixFallCallBack implements UserFeginClientWithHystrix {
    @Override
    public User findById2(Long id) {
        User user = new User();
        user.setUsername("Feign Client failed Hystrix");
        return user;
    }
}
