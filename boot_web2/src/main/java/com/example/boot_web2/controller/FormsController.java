package com.example.boot_web2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * @Author Mi
 * @Date 2022/4/12 19:26
 * @Version 1.0
 */
@Controller
public class FormsController {

    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "forms/form_layouts";
    }


    /**
     *  文件上传
     */
    @PostMapping("/upload")
    public String upload(String email, String username,
                         @RequestParam("headerImg") MultipartFile file ,
                         MultipartFile[] photos,
                         HttpSession session) throws IOException {
        //获取名字
        if (!file.isEmpty()){
            String filename = file.getOriginalFilename();
            File file1 = new File("G:\\photo");
            if (!file1.exists()){
                file1.mkdir();
            }
            String path = file1 + "\\" + filename;
            file.transferTo(new File(path));
        }

        if (photos.length > 0){
            for (MultipartFile photo : photos){
                if (!photo.isEmpty()){
                    String filename = photo.getOriginalFilename();
                    File file1 = new File("G:\\photo");
                    if (!file1.exists()){
                        file1.mkdir();
                    }
                    String path = file1 + "\\" + filename;
                    photo.transferTo(new File(path));
                }
            }
        }

        return "redirect:/loginRedirect";
    }

}
