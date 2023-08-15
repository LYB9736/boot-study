package com.example.project2.domain.second.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project2.domain.second.dto.ResSecondDTO;
import com.example.project2.domain.second.service.SecondService;
import com.example.project2.model.post.entity.PostEntity;

@RestController
@RequestMapping("/api/v1/board")
public class SecondControllerApiV1 {

    private final SecondService secondService; // PostService를 주입받아 사용하는 예시

    public SecondControllerApiV1(SecondService secondService) {
        this.secondService = secondService;
    }

    @PostMapping("/write")
    public ResponseEntity<String> createPost(@RequestBody ResSecondDTO resSecondDTO) {
        // 클라이언트로부터 받은 데이터를 이용하여 글 작성 처리
        // UserEntity userEntity = getUserEntityFromDTO(resSecondDTO.getUserIdx()); // 사용자 정보 가져오기
        PostEntity postEntity = createPostEntityFromDTO(resSecondDTO);  // PostEntity 생성

        secondService.savePost(postEntity); // PostEntity 저장

        // 작성 완료되면 응답
        return new ResponseEntity<>("글 작성이 완료되었습니다.", HttpStatus.CREATED);
    }

    // ResSecondDTO에서 사용자 idx를 이용하여 UserEntity를 가져오는 메서드
    // private UserEntity getUserEntityFromDTO(Integer userIdx) {
    //     // 실제로는 userIdx를 이용하여 사용자 정보를 조회하는 로직을 구현해야 합니다.
    //     // 여기서는 가상의 사용자 정보를 생성하여 반환하는 예시를 보여드립니다.
    //     return UserEntity.builder()
    //         .idx(userIdx)
    //         // 다른 필요한 정보들도 설정
    //         .build();
    // }

    // ResSecondDTO를 이용하여 PostEntity를 생성하는 메서드
    private PostEntity createPostEntityFromDTO(ResSecondDTO resSecondDTO) {
        return PostEntity.builder()
            .title(resSecondDTO.getTitle())
            .content(resSecondDTO.getContent())
            .createDate(LocalDateTime.now())
            // 다른 필요한 정보들도 설정
            .build();
    }
}
