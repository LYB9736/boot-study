package com.example.site2.domain.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.site2.model.user.entity.UserEntity;
import com.example.site2.model.user.repository.UserRepository;



@Service
@Transactional(readOnly = true)
public class MainService {

    @Autowired
    private UserRepository userRepository;

    public void getMainData(){
        List<UserEntity> userEntityList = userRepository.findAll();

        Optional<UserEntity> userEntity = userRepository.findByIdx(1L);

        System.out.println(userEntity);
    }
    
}
