package com.example.boot_web2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boot_web2.bean.UserOne;
import com.example.boot_web2.mapper.UserOneMapper;
import com.example.boot_web2.service.UserOneService;
import org.springframework.stereotype.Service;

/**
 * @Author Mi
 * @Date 2022/4/15 20:10
 * @Version 1.0
 */
@Service
public class UserOneServiceImpl extends ServiceImpl<UserOneMapper, UserOne> implements UserOneService {
}
