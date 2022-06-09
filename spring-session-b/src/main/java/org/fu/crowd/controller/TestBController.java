package org.fu.crowd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestBController {


    @RequestMapping("/test/spring/session/get")
    public String testSession(HttpSession session){
        String getKing = (String)session.getAttribute("king");
        return getKing;
    }

}
