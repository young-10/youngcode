package com.young.springbootcrud.component;


import org.springframework.boot.autoconfigure.session.RedisSessionProperties;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author young
 * @Description
 * @date 2020-04-18 21:19
 */
//权限检查
//springboot1.x和2.x在handlerInterceptor的底层写法有区别
public class LoginHandlerInceptor implements HandlerInterceptor {
    //目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginuser = request.getSession().getAttribute("Loginuser");
        if (loginuser == null) {
            //未登录，返回登陆页面
            request.setAttribute("msg","没有权限");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        } else {
            //已登录，放行
            return true;
        }

    }

}
