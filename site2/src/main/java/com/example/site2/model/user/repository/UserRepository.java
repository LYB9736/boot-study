package com.example.site2.model.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.site2.model.user.entity.UserEntity;




public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // select * fromn user where idx = ?
    Optional<UserEntity> findByIdx(Long idx);

    Optional<UserEntity> findById(String id);

    List<UserEntity> findByPassword(String password);

    Optional<UserEntity> findByIdxAndId(Long idx, String Id);  
    
    List<UserEntity> findByIdContaining(String id);
}
