package com.example.site1.model.post.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.site1.model.post.entity.PostEntity;



@Repository
public interface PostRepository extends JpaRepository<PostEntity, Integer>{
    
    // idx로 Optional<PostEntity>
    Optional<PostEntity> findByIdx(Integer idx);
    // title로 List<PostEntity>
    List<PostEntity> findByTitle(String title);
    // content로 List<PostEntity>
    List<PostEntity> findByContent(String content);
    // user_idx로 List<PostEntity

    // // title이 포함된 List<PostEntity> 찾기
    // List<PostEntity> findByTitleContaining(String title);
    // // content가 포함된 List<PostEntity> 찾기
    // List<PostEntity> findByContentContaining(String content);

    // // title또는 content가 포함된 List<PostEntity> 찾기
    // List<PostEntity> findByTitleContainingOrContentContaining(String title, String Content);

    // // title과 content가 정확히 일치하는 List<PostEntity> 찾기
    // List<PostEntity> findByContentAndTitle(String title, String Content);

    // // user_idx가 일치하고 content를 포함하고 있는 List<PostEntity> 찾기
    // List<PostEntity> findByUserEntity_idxAndContentContaining(Integer userIdx, String content);
}
