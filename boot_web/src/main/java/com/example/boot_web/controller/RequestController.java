package com.example.boot_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Mi
 * @Date 2022/4/10 18:40
 * @Version 1.0
 */
@Controller
public class RequestController {

    @RequestMapping("/goto")
    public ModelAndView goTo(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","那你");
        modelAndView.addObject("password",213142);
        modelAndView.setViewName("forward:/success");
        System.out.println("收到");
        return modelAndView;
    }


    @RequestMapping("/success")
    @ResponseBody
    public Map success(@RequestAttribute String username, @RequestAttribute String password){
        System.out.println("shoudao");
        Map<String,String> map = new HashMap<>();
        map.put("username",username);
        map.put("password",password);
        return map;
    }

}
