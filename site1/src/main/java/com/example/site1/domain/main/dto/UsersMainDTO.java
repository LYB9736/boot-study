package com.example.site1.domain.main.dto;

import com.example.site1.model.users.entity.UsersEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UsersMainDTO {
    
    private Integer usersIdx;
    private String usersId;

    public static UsersMainDTO fromEntity(UsersEntity usersEntity) {
        return new UsersMainDTO(usersEntity.getUserIdx(), usersEntity.getUserId());
    }


}
