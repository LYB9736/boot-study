package com.example.site1.domain.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.site1.domain.main.dto.UsersMainDTO;
import com.example.site1.model.users.entity.UsersEntity;
import com.example.site1.model.users.repository.UsersRepository;

@Service
public class MainService {

    @Autowired
    private UsersRepository usersRepository;

    public List<UsersMainDTO> getMainPageData(){

        List<UsersEntity> usersEntityList = usersRepository.findAll();

        List<UsersMainDTO> usersMainDTOList = usersEntityList.stream()
        .map((usersEntity) -> UsersMainDTO.fromEntity(usersEntity))
        .toList();

        return usersMainDTOList;
    }
    
}
