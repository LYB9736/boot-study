package com.example.project1.domain.second.controller;

import org.springframework.stereotype.Controller;

@Controller
public class SecondController {
    
    @Autowired
    private SecondService secondService;

    @GetMapping("/")
    public ModelAndView mainPage(){
        ModelAndView modelAndView = new ModelAndView();
        List<ResSecondDTO> resSecondDTOList = secondService.getSecondData();
        modelAndView.addObject("resSecondDTOList", resSecondDTOList);
        modelAndView.setViewName("main/main");
        return modelAndView;
    }
    @GetMapping("/board")
    public ModelAndView secondPage(){
        ModelAndView modelAndView = new ModelAndView();
        List<ResSecondDTO> resSecondDTOList = secondService.getSecondData();
        modelAndView.addObject("resSecondDTOList", resSecondDTOList);
        modelAndView.setViewName("board/board");
        return modelAndView;
    }
    
}