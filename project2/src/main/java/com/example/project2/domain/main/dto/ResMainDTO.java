package com.example.project2.domain.main.dto;

import com.example.project2.model.user.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class ResMainDTO {

    private String id;
    private String password;

    public static ResMainDTO fromEntity(UserEntity userEntity){
        return ResMainDTO.builder()
        .id(userEntity.getId())
        .password(userEntity.getPassword())
        .build();
    }
}