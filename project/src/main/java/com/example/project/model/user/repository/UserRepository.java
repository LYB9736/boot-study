package com.example.project.model.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    // Optional<UserEntity> findById(String id);

    // Optional<UserEntity> findByIdAndDeleteDateIsNull(String Id);

    // Optional<UserEntity> findByIdxAndDeleteDateIsNull(Integer idx);
}
