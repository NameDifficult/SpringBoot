package com.example.boot_web2.controller;

import com.example.boot_web2.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author Mi
 * @Date 2022/4/12 10:27
 * @Version 1.0
 */
@Controller
public class IndexController {

//    @Autowired
//    StringRedisTemplate redisTemplate;


    /**
     *          去到登录页
     * @return
     */
    @GetMapping("/")
    public String loginPage(){
        return "login";
    }


    /**
     *                  登录成功后，重定向到主页
     * @return
     */
    @PostMapping("/login")
    public String login(User user, HttpSession session, Model model){
        if (!StringUtils.isEmpty(user.getUserName())&& StringUtils.hasLength(user.getPassword())){
            session.setAttribute("loginUser",user);
            return "redirect:/loginRedirect";
        }else {
            model.addAttribute("msg","账号或密码错误");
            return "login";
        }
    }
    @GetMapping("/loginRedirect")
    public String loginRedirect(Model model){
//        ValueOperations<String, String> operations = redisTemplate.opsForValue();
//        String s = operations.get("/basic_table");
//        model.addAttribute("s",s);
        return "index";
    }


    @GetMapping("/logout")
    public String logout(HttpSession session,Model model){
        session.setAttribute("loginUser",null);
        return "login";
    }



}
