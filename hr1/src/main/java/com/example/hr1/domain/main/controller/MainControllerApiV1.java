package com.example.hr1.domain.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hr1.domain.main.dto.ReqInsertMainDTO;
import com.example.hr1.domain.main.dto.ResMainDTO;
import com.example.hr1.domain.main.service.MainService;

@RestController
public class MainControllerApiV1 {

    @Autowired
        private MainService mainService;

    @GetMapping("/api/v1/main")
    public List<ResMainDTO> getMainData(){
        return mainService.getMainPageData();
    }

    @PostMapping("/api/v1/main")
    public String PostMainData(ReqInsertMainDTO reqInsertMainDTO){
        mainService.postMainData(reqInsertMainDTO);

        return "OK";

    }    
}
