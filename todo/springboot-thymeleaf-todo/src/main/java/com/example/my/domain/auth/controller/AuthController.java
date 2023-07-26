package com.example.my.domain.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {

    // @GetMapping("/auth/login")
    // public ModelAndView login() {
    // ModelAndView modelAndView = new ModelAndView();
    // modelAndView.setViewName("auth/login");
    // return modelAndView;
    // }

    @GetMapping("/auth/login")
    public String login() {
        return "auth/login";
    }

    @GetMapping("/auth/join")
    public String join() {
        return "auth/join";
    }

    @GetMapping("/auth/logout")
    public String logout(HttpSession session) {

        session.invalidate(); // session안에 있는 데이터를 모두 날리겠다(로그아웃)

        return "redirct:/auth/login";
    }
}
