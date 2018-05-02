package com.xiaotao.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 13725 on 2018/5/1.
 */
@Component
public class PreZuulFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(PreZuulFilter.class);

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public Object run() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        StringBuffer requestURL = request.getRequestURL();
        logger.error("requestURL:" + requestURL);
        return null;
    }
}
