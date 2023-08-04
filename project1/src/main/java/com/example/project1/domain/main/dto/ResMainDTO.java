package com.example.project1.domain.main.dto;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
