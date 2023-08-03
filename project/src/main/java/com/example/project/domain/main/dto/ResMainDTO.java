package com.example.project.domain.main.dto;

import com.example.project.model.user.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ResMainDTO {
    private String id;

    public static ResMainDTO fromEntity(UserEntity userEntity){
        return ResMainDTO.builder()
        .id(userEntity.getId())
        .build();
    }
}
