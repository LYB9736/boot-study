package com.example.site2.domain.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {
    
    @GetMapping("/join")
    public ModelAndView joinPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("auth/join");
        return modelAndView;
    }

    @GetMapping("/login")
    public String login(HttpSession session){

        Object attribute = session.getAttribute("idx");

        Long idx = (Long) attribute;

        System.out.println("로그인 페이지 idx : "  + idx);

        return "auth/login";
    }
}
