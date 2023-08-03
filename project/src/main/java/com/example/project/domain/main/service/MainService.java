package com.example.project.domain.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.domain.main.dto.ResMainDTO;
import com.example.project.model.user.entity.UserEntity;
import com.example.project.model.user.repository.UserRepository;

@Service
public class MainService {
    
    @Autowired
    private UserRepository userRepository;

    public List<ResMainDTO> getMainData(){
        List<UserEntity> userEntityList = userRepository.findAll();

        List<ResMainDTO> resMainDTOList = userEntityList
        .stream()
        .map((userEntity) -> ResMainDTO.fromEntity(userEntity))
        .toList();

        return resMainDTOList;
    }
}
