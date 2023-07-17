package com.example.site1.model.users.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.site1.model.users.entity.UsersEntity;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {

    UsersEntity findByUserIdx(Integer userIdx);


    List<UsersEntity> findByUserId(String userId);


    UsersEntity findByUserIdxAndUserId(Integer userIdx, String userId);

    
    
}
