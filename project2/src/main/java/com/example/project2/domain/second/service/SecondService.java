package com.example.project2.domain.second.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.project2.domain.second.dto.ResSecondDTO;
import com.example.project2.model.post.entity.PostEntity;
import com.example.project2.model.post.repository.PostRepository;

@Service
public class SecondService {

    private final PostRepository postRepository;

    public SecondService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<ResSecondDTO> getSecondData() {
        return postRepository.findAll()
            .stream()
            .map(this::convertToResSecondDTO)
            .collect(Collectors.toList());
    }

    public void savePost(PostEntity postEntity) {
        postRepository.save(postEntity);
    }

    private ResSecondDTO convertToResSecondDTO(PostEntity postEntity) {
        return ResSecondDTO.builder()
            .title(postEntity.getTitle())
            .content(postEntity.getContent())
            .userIdx(postEntity.getUserEntity().getIdx())
            .createDate(postEntity.getCreateDate())
            .updateDate(postEntity.getUpdateDate())
            .build();
    }
}