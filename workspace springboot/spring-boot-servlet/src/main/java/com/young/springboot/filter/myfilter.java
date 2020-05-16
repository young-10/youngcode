package com.young.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author young
 * @Description
 * @date 2020-04-19 18:18
 */
public class myfilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("process");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
