package com.example.site2.domain.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.site2.domain.auth.dto.ReqJoinDTO;
import com.example.site2.domain.auth.dto.ReqLoginDTO;
import com.example.site2.domain.auth.service.AuthServiceApiV1;

import jakarta.servlet.http.HttpSession;

@RestController // JSON을 보내겠다.
@RequestMapping("/api/v1/auth")
public class AuthControllerApiV1 {

    @Autowired
    private AuthServiceApiV1 authServiceApiV1;

    @PostMapping("/join")
    // 상태코드, 데이터를 담아 보낼 수 있다.
    // @ResponseBody는 @RestController 어노테이션이 있기 때문에 생략이 가능하다.
    public ResponseEntity<?> join(@RequestBody ReqJoinDTO dto) {

        ResponseEntity<?> responseEntity = authServiceApiV1.join(dto);

        return responseEntity;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody ReqLoginDTO dto, HttpSession session){
        // 로그인 : session 공간에 내 정보를 넣는다.
        return authServiceApiV1.login(dto, session);
    }

}
