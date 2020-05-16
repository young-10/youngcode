package com.youn.springboot.config;
import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @author young
 * @Description
 * @date 2020-04-18 16:09
 */
@org.springframework.context.annotation.Configuration
public class MybatisConfig {

    @Bean

    public ConfigurationCustomizer configurationCustomizer(){
       return  new ConfigurationCustomizer() {
            @Override
            public void customize(Configuration configuration) {
                //定制驼峰命名法
                configuration.setMapUnderscoreToCamelCase(true);
                configuration.setCacheEnabled(true);
            }
        };
    }
}
