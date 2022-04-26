package com.example.boot_web2.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Mi
 * @Date 2022/4/15 20:56
 * @Version 1.0
 */
@Configuration
public class MybatisConfig {

    @Bean
    public MybatisPlusInterceptor plusInterceptor(){
        MybatisPlusInterceptor plusInterceptor = new MybatisPlusInterceptor();
        //分页拦截器
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
        //请求页大于最大页后跳回首页
        paginationInnerInterceptor.setOverflow(true);
        //每页最大限制
        paginationInnerInterceptor.setMaxLimit(500L);
        plusInterceptor.addInnerInterceptor(paginationInnerInterceptor);
        return plusInterceptor;
    }
}
