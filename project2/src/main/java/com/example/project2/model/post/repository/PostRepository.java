package com.example.project2.model.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project2.model.post.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Integer>  {
    
}
