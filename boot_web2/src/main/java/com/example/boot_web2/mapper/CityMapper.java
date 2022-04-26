package com.example.boot_web2.mapper;

import com.example.boot_web2.bean.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @Author Mi
 * @Date 2022/4/13 22:01
 * @Version 1.0
 */
@Mapper
public interface CityMapper {

    @Select("select * from city where id=#{id}")
    public City getCityByID(Integer id);

    @Insert("insert into city values(#{id},#{name},#{state},#{country})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public int insertCity(City city);
}
