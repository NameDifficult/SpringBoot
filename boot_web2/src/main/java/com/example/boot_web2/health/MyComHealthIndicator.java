package com.example.boot_web2.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

/**
 * 自定义健康检查
 * 放入容器中即可生效
 */
//@Component
public class MyComHealthIndicator extends AbstractHealthIndicator {
    /**
     * 真实的检查方法
     * @param builder
     * @throws Exception
     */
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        //模拟
        if (1==1){
            builder.status(Status.UP);//健康
        }else {
            builder.status(Status.OUT_OF_SERVICE);//无服务             或者Status.DOWN ，挂机了
        }
        //添加返回的信息       键值对或者map集合
        builder.withDetail("code",100);
//        builder.withDetails(map);

    }
}
