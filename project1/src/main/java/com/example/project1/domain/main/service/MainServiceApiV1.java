package com.example.project1.domain.main.service;

@Service
@Transactional(readOnly = true)
public class MainServiceApiV1 {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<?> getUserList(){

        List<UserEntity> userEntityList = userRepository.findAll();

        return new ResponseEntity<>(
            ResponseDTO.builder()
            .code(0)
            .message("유저 리스트 조회에 성공했습니다.")
            .data(ResMainApiDTO.of(userEntityList))
            .build(),
            HttpStatus.OK
        );

      

        // List<User> userList = ResMainApiDTO.User.fromEntityList(userEntityList);

        // ResMainApiDTO.builder()
        // .userList(userList)
        // .build();

    }

    
}
