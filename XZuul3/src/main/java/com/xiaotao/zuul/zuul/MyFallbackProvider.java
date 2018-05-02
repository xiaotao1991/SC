package com.xiaotao.zuul.zuul;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

/**
 * Created by 13725 on 2018/5/1.
 */
@Component
public class MyFallbackProvider implements FallbackProvider {

    private final Logger logger = LoggerFactory.getLogger(MyFallbackProvider.class);

    @Override
    public String getRoute() {
        return "xserver1";
    }

    @Override
    public ClientHttpResponse fallbackResponse(Throwable cause) {
        logger.error("fuck-ClientHttpResponse-Caseuse");
        logger.debug("zuul-failed",cause);
        return null;
    }

    @Override
    public ClientHttpResponse fallbackResponse() {
        logger.error("fuck-ClientHttpResponse-Caseuse");
        return null;
    }
}