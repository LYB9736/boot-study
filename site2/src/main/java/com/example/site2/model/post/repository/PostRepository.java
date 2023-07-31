package com.example.site2.model.post.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.site2.model.post.entity.PostEntity;


public interface PostRepository extends JpaRepository <PostEntity, Long>{
    
    // select * from post where idx = ?
    Optional<PostEntity> findByIdx(Long Idx);

    // select * from post where title = ?
    List<PostEntity> findByTitle(String title);

    // select * from post where content = ?
    List<PostEntity> findByContent(String content);

    // select * from post where user_idx = ?
    List<PostEntity> findByUserIdx(Long userIdx);

    // select *
    // from
    // where title = ?
    // or content = ?
    List<PostEntity> findByTitleOrContent(String title, String content);

    // select *
    // from post
    // where title like '%?%'
    // or content like '%?%';
    List<PostEntity> findByTitleContainingOrContentContaining(String title, String content);
}
