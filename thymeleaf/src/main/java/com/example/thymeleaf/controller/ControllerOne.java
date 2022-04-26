package com.example.thymeleaf.controller;

import com.example.thymeleaf.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Mi
 * @Date 2022/4/11 10:19
 * @Version 1.0
 */
@Controller
public class ControllerOne {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("id0",0);
        return "index";
    }

    @RequestMapping("/success")
    public String success(Model model){
        model.addAttribute("name","李四");
        return "success";
    }


    @RequestMapping("/success1")
    public String success(Model model, @RequestParam Integer id, String username){
        model.addAttribute("name",username);
        model.addAttribute("id",id);
        return "success";
    }

    @RequestMapping("/success2")
    public String count(Model model){
        model.addAttribute("a",20);
        return "count";
    }


    /**
     *          if判断中，0为假，null为假，off为假，no为假
     * @return
     */
    @RequestMapping("/success3")
    public String success3(){
        return "if";
    }


    /**
     *              如果是复杂集合 如：list<Map<key,value>>这种，则进行两次循环
     * @param model
     * @return
     */
    @RequestMapping("/success4")
    public String success4(Model model){
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"a","123"));
        list.add(new Student(2,"a","123"));
        list.add(new Student(3,"a","123"));
        model.addAttribute("list",list);

        //数组
        String[] strings = new String[]{"曹操","刘备","张飞"};
        model.addAttribute("strings",strings);


        //
        Map<String,String> map = new HashMap<>();
        map.put("0","天津");
        map.put("1","重庆");
        map.put("2","上海");
        map.put("3","广州");
        model.addAttribute("citys",map);


        return "each";
    }


    /**
     * 测试模板
     */
    @RequestMapping("/model")
    public String model(){
        return "flag/main";
    }


    /**
     * 测试inline
     */
    @RequestMapping("/inline")
    public String inline(Model model){
        System.out.println("inline");
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"a","234"));
        list.add(new Student(2,"a","234"));
        list.add(new Student(3,"a","234"));
        model.addAttribute("list",list);
        model.addAttribute("name","三国演义");
        return "inline";
    }

}
