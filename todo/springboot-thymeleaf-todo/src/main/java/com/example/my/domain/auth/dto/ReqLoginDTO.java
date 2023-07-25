package com.example.my.domain.auth.dto;

import com.example.my.model.user.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ReqLoginDTO {

    private User user;

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Getter
    public static class User {
        private String id;
        private String password;
    }

}
