package com.example.boot_web2.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Component
public class RedisUrlCountInterceptor implements HandlerInterceptor {

//    @Autowired
//    StringRedisTemplate redisTemplate;

//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//
////        String requestURI = request.getRequestURI();
////        //每次请求自动+1
////        redisTemplate.opsForValue().increment(requestURI);
////        return true;
//    }
}
