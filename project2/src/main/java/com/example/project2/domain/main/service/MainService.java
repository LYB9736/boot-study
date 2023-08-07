package com.example.project2.domain.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.project2.domain.main.dto.ResMainDTO;
import com.example.project2.model.user.entity.UserEntity;
import com.example.project2.model.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
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
