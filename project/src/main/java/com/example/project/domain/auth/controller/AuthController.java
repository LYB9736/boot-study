// package com.example.project.domain.auth.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;

// import jakarta.servlet.http.HttpSession;

// @Controller
// public class AuthController {
    
//     @GetMapping("/join")
//     public String join(){
//         return "auth/join";
//     }

//     @GetMapping("/login")
//     public String login(){
//         return "auth/login";
//     }

//     @GetMapping("/logout")
//     public String logout(HttpSession session){

//         session.invalidate();

//         return "redirect:/auth/login";
//     }
// }
