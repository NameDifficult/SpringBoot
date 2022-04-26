package com.example.boot_web2.config;

import com.example.boot_web2.interceptor.LoginInterceptor;
import com.example.boot_web2.interceptor.RedisUrlCountInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *      Filter、Interceptor 几乎相同的功能
 *      1. Filter是servlet原生定义的。脱离spring也能使用
 *      2. Interceptor是spring定义的接口。可以使用spring的自动注入
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

//    @Autowired
//    RedisUrlCountInterceptor redisUrlCountInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //登录拦截
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");

//        //请求统计拦截
//        registry.addInterceptor(redisUrlCountInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");
    }
}
