package com.example.site1.domain.main.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ResMainDTO {

    private List<User> userList;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class User {
        // main.html을 보면 user.id만 반복되기 때문에 id만 입력한다.
        private String id;
    }

}
