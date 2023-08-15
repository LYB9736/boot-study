package com.example.project2.domain.auth.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project2.common.dto.LoginUserDTO;
import com.example.project2.domain.auth.dto.ReqJoinDTO;
import com.example.project2.domain.auth.dto.ReqLoginDTO;
import com.example.project2.domain.auth.service.AuthServiceApiV1;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthControllerApiV1 {

    private final AuthServiceApiV1 authServiceApiV1;

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody ReqLoginDTO dto, HttpSession session) {
        
        return authServiceApiV1.login(dto, session);
    }

    @PostMapping("/join")
    public ResponseEntity<?> join(@Valid @RequestBody ReqJoinDTO dto) {
        return authServiceApiV1.join(dto);
    }

    // @GetMapping("/check-login-status") // 변경된 부분: GET 요청으로 변경
    // public ResponseEntity<?> checkLoginStatus(HttpSession session) {
    //     boolean isLoggedIn = authServiceApiV1.isLoggedIn(session);

    //     if (isLoggedIn) {
    //         return ResponseEntity.ok().body("{\"isLoggedIn\": true}");
    //     } else {
    //         return ResponseEntity.ok().body("{\"isLoggedIn\": false}");
    //     }
    // }

    @GetMapping("/check-login-status")
    public ResponseEntity<?> checkLoginStatus(HttpSession session) {
        LoginUserDTO loginUserDTO = (LoginUserDTO) session.getAttribute("loginUserDTO");
        
        if (loginUserDTO != null) {
            String userId = loginUserDTO.getUser().getId();
            return ResponseEntity.ok().body(Map.of("isLoggedIn", true, "userId", userId));
        } else {
            return ResponseEntity.ok().body(Map.of("isLoggedIn", false));
        }
    }
}
