package com.example.project2.domain.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/")
    public String mainPage(){
        return "main/main";
    }

    // @GetMapping("/join")
    // public String joinPage(){
    //     return "auth/join";
    // }

    // @GetMapping("/login")
    // public String loginPage(){
    //     return "auth/login";
    // }
}
