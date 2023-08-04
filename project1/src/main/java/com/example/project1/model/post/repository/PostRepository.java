package com.example.project.model.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.post.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Integer> {
    
}
