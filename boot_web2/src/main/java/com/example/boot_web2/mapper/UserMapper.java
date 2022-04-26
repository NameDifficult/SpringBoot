package com.example.boot_web2.mapper;

import com.example.boot_web2.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Mi
 * @Date 2022/4/13 17:11
 * @Version 1.0
 */
@Mapper
public interface UserMapper {


    public User getUserById(@Param("id") Integer id);
}
