package com.example.project2.common.dto;

import com.example.project2.model.user.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class LoginUserDTO {

    public User user;

    public static LoginUserDTO of(UserEntity userEntity) {
        return LoginUserDTO.builder()
            .user(User.fromEntity(userEntity))
            .build();
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Getter
    public static class User{
        private Integer idx;
        private String id;
        private String password; 

        public static User fromEntity(UserEntity userEntity) {
            return User.builder()
                    .idx(userEntity.getIdx())
                    .id(userEntity.getId())
                    .password(userEntity.getPassword())
                    .build();
        }
    }
    
}
