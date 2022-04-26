package com.example.boot_web2.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author Mi
 * @Date 2022/4/13 23:02
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("user_one")//可以指定表名
public class UserOne {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
