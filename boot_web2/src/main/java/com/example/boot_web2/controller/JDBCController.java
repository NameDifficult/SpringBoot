package com.example.boot_web2.controller;

import com.example.boot_web2.bean.City;
import com.example.boot_web2.bean.User;
import com.example.boot_web2.service.JDBCService;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Author Mi
 * @Date 2022/4/13 15:03
 * @Version 1.0
 */
@Controller
public class JDBCController {

    @Autowired
    JDBCService jdbcService;

    @Autowired
    JdbcTemplate jdbcTemplate;



    @GetMapping("/jdbc")
    @ResponseBody
    public List<Map<String, Object>> jdbc(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from User");
        maps.forEach(map -> System.out.println(map));
        return maps;
    }



    @GetMapping("/jdbc2")
    @ResponseBody
    public User getUserByID(@RequestParam("id") Integer id){
        return jdbcService.getUserByID(id);
    }



    @GetMapping("/jdbc3")
    @ResponseBody
    public City getCityByID(@RequestParam("id") Integer id){
        return jdbcService.getCityByID(id);
    }



    @GetMapping("/jdbc4")
    @ResponseBody
    public int insertCity(){
        City city = new City(null,"深圳","市","中国");
        jdbcService.insertCity(city);
        return city.getId();
    }



}
