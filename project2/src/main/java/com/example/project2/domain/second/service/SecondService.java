package com.example.project2.domain.second.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project2.domain.second.dto.ResSecondDTO;
import com.example.project2.model.post.repository.PostRepository;

@Service
public class SecondService {
    
    @Autowired
    private PostRepository postRepository;

    public List<ResSecondDTO> getSecondData(){

        return postRepository.findAll()
            .stream()
            .map((PostEntity) -> ResSecondDTO.fromEntity(PostEntity))
            .toList();
    }
}
