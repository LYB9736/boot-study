package com.example.site2.domain.main.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ResMainDTO {
    
    private List<MainUserDTO> mainUserDTOList;
}
