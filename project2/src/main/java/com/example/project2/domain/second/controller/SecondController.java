package com.example.project2.domain.second.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.project2.domain.second.dto.ResSecondDTO;
import com.example.project2.domain.second.service.SecondService;

@Controller
public class SecondController {

    @Autowired
    private SecondService secondService;

    // @GetMapping("/")
    // public ModelAndView mainPage() {
    //     ModelAndView modelAndView = new ModelAndView();
    //     List<ResSecondDTO> resSecondDTOList = secondService.getSecondData();
    //     modelAndView.addObject("resSecondDTOList", resSecondDTOList);
    //     modelAndView.setViewName("main/main");
    //     return modelAndView;
    // }

    @GetMapping("/board")
    public ModelAndView secondPage() {
        ModelAndView modelAndView = new ModelAndView();
        List<ResSecondDTO> resSecondDTOList = secondService.getSecondData();
        modelAndView.addObject("resSecondDTOList", resSecondDTOList);
        modelAndView.setViewName("board/board");
        return modelAndView;
    }

    @GetMapping("/write")
    public ModelAndView writePage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("board/write");
        return modelAndView;
    }
}
