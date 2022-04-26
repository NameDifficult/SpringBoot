package com.example.boot_web2;

import com.example.boot_web2.bean.UserOne;
import com.example.boot_web2.mapper.UserOneMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class BootWeb2ApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Autowired
    UserOneMapper userOneMapper;


    //测试redis
    @Autowired
//    StringRedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from User");
        maps.forEach(map -> System.out.println(map));


        System.out.println(dataSource);
    }


    @Test
    void testUserOneMapper(){
        UserOne userOne = userOneMapper.selectById(1L);
        System.out.println(userOne);
    }



//    @Test
//    void testRedis(){
//        ValueOperations<String,String> operations = redisTemplate.opsForValue();
//        operations.set("helloKey","helloValue");
//        String helloKey = operations.get("helloKey");
//        System.out.println(helloKey);
//    }

}
