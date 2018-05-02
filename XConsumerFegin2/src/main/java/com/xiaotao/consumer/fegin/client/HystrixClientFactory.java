package com.xiaotao.consumer.fegin.client;

import com.xiaotao.consumer.fegin.entity.User;
import feign.hystrix.FallbackFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by 13725 on 2018/5/1.
 */
@Component
public class HystrixClientFactory implements FallbackFactory<UserFeginClientWithHystrixFactory> {

    private final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFactory.class);

    @Override
    public UserFeginClientWithHystrixFactory create(Throwable throwable) {

        LOGGER.info("fuck","somebitch");
        LOGGER.debug("fuck2");
        LOGGER.error("memeda",throwable);
        LOGGER.error("jj","haha");

        return userFeginClient -> {
            User user = new User();
            user.setUsername("UserFeginClientWithHystrixFactory");
            return user;
        };
    }
}
