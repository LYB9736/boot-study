package com.example.project.model.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
