package com.young.springboot.config;

import com.young.springboot.listener.mylistener;
import com.young.springboot.filter.myfilter;
import com.young.springboot.servlet.myservlet;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author young
 * @Description
 * @date 2020-04-19 17:51
 */
@Configuration
public class MySercerConfig{
    //配置嵌入式的servlet容器
        @Bean
        public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer(){
            //定制嵌入式servlet的容器的相关规则
           return  new EmbeddedServletContainerCustomizer() {
                @Override
                public void customize(ConfigurableEmbeddedServletContainer container) {
                    container.setPort(8086);
                }
            };
        }

//注册servlet
    @Bean
    public ServletRegistrationBean registrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new myservlet(), "/myservlet");
        return servletRegistrationBean;
    }

    @Bean
    //注册filter
    public FilterRegistrationBean registrationBean1(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new myfilter());
        registrationBean.setUrlPatterns(Arrays.asList("/hello","/myservlet"));
        return registrationBean;
    }
//注册listener
    @Bean
    public ServletListenerRegistrationBean registrationBean2(){
        ServletListenerRegistrationBean registrationBean = new ServletListenerRegistrationBean(new mylistener());
        return registrationBean;
    }
}
