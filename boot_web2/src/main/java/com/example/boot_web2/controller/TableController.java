package com.example.boot_web2.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.boot_web2.bean.User;
import com.example.boot_web2.bean.UserOne;
import com.example.boot_web2.bean.User_two;
import com.example.boot_web2.service.UserOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Mi
 * @Date 2022/4/12 11:10
 * @Version 1.0
 */
@Controller
public class TableController {

    @Autowired
    UserOneService userOneService;


    @GetMapping("/basic_table")
    public String basic_table(){
        return "dataTable/basic_table";
    }


    @GetMapping("/user/delete/")
    public String deleteUser(@RequestParam("id") Long id, @RequestParam("pn")Integer pn, RedirectAttributes ra){
        userOneService.removeById(id);
        //重定向时带上参数pn
        ra.addAttribute("pn",pn);
        return "redirect:/dynamic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model, @RequestParam(value = "pn",defaultValue = "1")Integer pn){
        List<User_two> users = Arrays.asList(new User_two("zhangsan", "123456"),
                new User_two("lisi", "123456"),
                new User_two("王五", "123456"),
                new User_two("是是是", "123456"));
        model.addAttribute("users",users);

        List<UserOne> list = userOneService.list();
//        model.addAttribute("userOnes",list);
        //分页数据,第几页，每页显示两条
        Page<UserOne> page = new Page<>(pn, 2);
        //分页查询结果
        Page<UserOne> userOnePage = userOneService.page(page, null);
        model.addAttribute("page",userOnePage);
        return "dataTable/dynamic_table";
    }


    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "dataTable/responsive_table";
    }


    @GetMapping("/editable_table")
    public String editable_table(){
        return "dataTable/editable_table";
    }

}
