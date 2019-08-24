package com.lhf.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: SimpleFilter
 * @Description:  路由过滤器
 * @Author: liuhefei
 * @Date: 2019/4/1
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public class SimpleFilter extends ZuulFilter {
    /**
     * 前置过滤器
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤执行顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否执行过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 包含过滤器功能
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        //获得当前上下文，存放请求和状态信息
        RequestContext ctx = RequestContext.getCurrentContext();
        //获取相关信息
        HttpServletRequest request = ctx.getRequest();
        String method = request.getMethod();
        String url = request.getRequestURI().toString();
        //String headerName = request.getHeaderNames().toString();
        //String ctxPath = request.getContextPath();

        System.out.printf("%s request to %s\r\n", method, url);
        //System.out.printf("headerNames: %s ,  contextPath: %s\r\n", headerName, ctxPath);
        return null;
    }
}
