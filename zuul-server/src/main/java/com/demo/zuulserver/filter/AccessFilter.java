package com.demo.zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author libing
 * @desc  zuul自定义过滤器,访问验证token
 * @date 2018/6/6 11:47
 */
@Component
public class AccessFilter extends ZuulFilter{
    private static final Logger log = Logger.getLogger(AccessFilter.class);

    // 前置过滤器
    @Override
    public String filterType(){
        return "pre";
    }

    // 优先级为0，数字越大，优先级越低
    @Override
    public int filterOrder(){
        return 0;
    }

    //是否执行该过滤器，此处为true，说明需要过滤
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        Object accessToken = request.getParameter("token");
        if(accessToken == null){
            log.warn("token is empty");
            context.setSendZuulResponse(false);  // 过滤该请求，不对其进行路由
            context.setResponseStatusCode(401);  // 返回错误码
            try{
                context.getResponse().getWriter().write("token is empty");
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                return null;
            }
        }
        log.info("ok");
        return null;
    }
}
