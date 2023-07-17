package com.example.site1.domain.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.site1.domain.main.dto.UsersMainDTO;
import com.example.site1.domain.main.service.MainService;

@Controller
public class MainController {

    @Autowired
    private MainService MainService;

    @GetMapping("/")

    public ModelAndView mainPage(){
        ModelAndView modelAndView = new ModelAndView();

        List<UsersMainDTO> usersMainDTOList = MainService.getMainPageData();

        modelAndView.addObject("usersMainDTOList", usersMainDTOList);

        modelAndView.setViewName("main/main");

        return modelAndView;
    }
    
}
