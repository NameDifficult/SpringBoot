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


    /*
     * 1. @RequestAttribute注解的参数在项目里是自己解析出来的，并不是前端传递的。具体一点，
     *      在项目里的拦截器里会对Token信息进行解析，解析出来的参数重新放在请求里（用httpServletRequest.setAttribute(name, value)），
     *      后边接口接收参数时就用这个注解。
     * 2. @RequestParam注解则表示这个参数是通过前端传递过来的，如果请求里没有这个参数，
     *      则会报错400 Bad Request。这个注解用来解析请求路径里的参数（get请求）或者post请求中form表单格式的请求参数；
     */
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
