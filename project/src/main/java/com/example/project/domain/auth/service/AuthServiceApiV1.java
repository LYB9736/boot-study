// package com.example.project.domain.auth.service;

// import java.util.Optional;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional;

// import com.example.project.common.dto.LoginUserDTO;
// import com.example.project.common.dto.ResponseDTO;
// import com.example.project.common.exception.BadRequestException;
// import com.example.project.domain.auth.dto.ReqJoinDTO;
// import com.example.project.domain.auth.dto.ReqLoginDTO;
// import com.example.project.model.user.entity.UserEntity;
// import com.example.project.model.user.repository.UserRepository;

// import jakarta.servlet.http.HttpSession;
// import lombok.RequiredArgsConstructor;

// @Service
// @RequiredArgsConstructor
// @Transactional(readOnly = true)
// public class AuthServiceApiV1 {

//     private final UserRepository userRepository;

//     public ResponseEntity<?> login(ReqLoginDTO dto, HttpSession session) {
//         // 유효성 체크
//         Optional<UserEntity> userEntityOptional = userRepository.findByIdAndDeleteDateIsNull(dto.getUser().getId());

//         if (userEntityOptional.isEmpty()){
//             throw new BadRequestException("존재하지 않는 사용자입니다.");
//         }

//         UserEntity userEntity = userEntityOptional.get();

//         if(!userEntity.getPassword().equals(dto.getUser().getPassword())){
//             throw new BadRequestException("비밀번호가 일치하지 않습니다.");
//         }

//         session.setAttribute("dto", LoginUserDTO.of(userEntity));
        
//         return new ResponseEntity<>(
//             ResponseDTO.builder()
//             .code(0)
//             .message("로그인에 성공했습니다.")
//             .build(),
//             HttpStatus.OK);
//     }

//     @Transactional
//     public ResponseEntity<?> join(ReqJoinDTO dto){
//         Optional<UserEntity> userEntityOptional = userRepository.findById(dto.getUser().getId());

//         if(userEntityOptional.isPresent()){
//             throw new BadRequestException("이미 존재하는 아이디입니다.");
//         }

//         UserEntity userEntity = UserEntity.builder()
//             .id(dto.getUser().getId())
//             .password(dto.getUser().getPassword())
//             // .createDate(LocalDateTime.now())
//             .build();
        
//         userRepository.save(userEntity);

//         return new ResponseEntity<>(
//             ResponseDTO.builder()
//                 .code(0)
//                 .message("회원가입에 성공하였습니다.")
//                 .build(),
//         HttpStatus.OK);
//     }

// }
