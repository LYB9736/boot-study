package com.example.project2.model.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project2.model.user.entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Integer>{

    Optional<UserEntity> findById(String id);
    Optional<UserEntity> findByIdAndDeleteDateIsNull(String id);
    Optional<UserEntity> findByIdxAndDeleteDateIsNull(Integer idx);
    
}
