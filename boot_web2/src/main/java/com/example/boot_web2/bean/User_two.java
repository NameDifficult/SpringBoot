package com.example.boot_web2.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author Mi
 * @Date 2022/4/13 17:28
 * @Version 1.0
 */
public class User_two {
    private String userName;
    private String password;

    public User_two(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User_two() {
    }

    @Override
    public String toString() {
        return "User_two{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
