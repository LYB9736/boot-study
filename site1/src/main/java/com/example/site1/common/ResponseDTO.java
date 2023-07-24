package com.example.site1.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class ResponseDTO<T> {
    // ResMainApiDTO - 보내고 싶은 데이터
    // HttpStatus.OK - 보내고 싶은 상태 코드
    private Integer code;
    private String message;
    private T data;
    
}
