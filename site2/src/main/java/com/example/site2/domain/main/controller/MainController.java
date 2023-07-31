package com.example.site2.domain.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.site2.domain.main.service.MainService;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;
    
    @GetMapping("/")
    public String mainPage(){
        mainService.getMainData();
        return "main";
    }

    // @GetMapping("/")
    // public ModelAndView mainPage(){
    //     ModelAndView modelAndView = new ModelAndView();
    //     modelAndView.setViewName("main");
    //     return modelAndView;
    // }
    
}
