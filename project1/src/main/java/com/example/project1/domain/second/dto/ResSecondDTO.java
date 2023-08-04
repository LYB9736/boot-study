package com.example.project1.domain.second.dto;

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
