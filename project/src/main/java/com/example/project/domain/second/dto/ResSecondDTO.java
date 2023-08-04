package com.example.project.domain.second.dto;

import com.example.project.model.post.entity.PostEntity;

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
public class ResSecondDTO {

    private String title;
    private String content;
    private Integer userIdx;
    // private String name;

    public static ResSecondDTO fromEntity(PostEntity postEntity){

        return ResSecondDTO.builder()
        .title(postEntity.getTitle())
        .content(postEntity.getContent())
        .userIdx(postEntity.getUserEntity().getIdx())
        // .name(postEntity.getName())
        .build();
    }
    
}
