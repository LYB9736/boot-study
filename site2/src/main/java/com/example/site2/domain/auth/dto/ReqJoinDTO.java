package com.example.site2.domain.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ReqJoinDTO {
    private User user;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class User{
        private String id;
        private String password;
    }
}
// JoinUserDTO를 ReqJoinDTO로 감싸지 않아도 상관이 없지만, 형식을 맞춰주기 위해서 감싸주는 것.