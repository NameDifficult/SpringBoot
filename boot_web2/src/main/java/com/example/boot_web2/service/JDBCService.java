package com.example.boot_web2.service;

import com.example.boot_web2.bean.City;
import com.example.boot_web2.bean.User;
import com.example.boot_web2.mapper.CityMapper;
import com.example.boot_web2.mapper.UserMapper;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Author Mi
 * @Date 2022/4/13 17:23
 * @Version 1.0
 */
@Service
public class JDBCService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    CityMapper cityMapper;


    //统计该类被调用了多少次
   /* Counter counter;
    public JDBCService(MeterRegistry meterRegistry){
        counter = meterRegistry.counter("JDBCService.count");
    }*/


    public User getUserByID(Integer id){
        User userById = userMapper.getUserById(id);
        return userById;
    }


    public City getCityByID(Integer id){
        return cityMapper.getCityByID(id);
    }

    public int insertCity(City city){
//        counter.increment();
        int i = cityMapper.insertCity(city);
        System.out.println(i);
        return i;
    }
}
