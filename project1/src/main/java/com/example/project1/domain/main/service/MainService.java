package com.example.project1.domain.main.service;

@Service
public class MainService {
    
    @Autowired
    private UserRepository userRepository;

    public List<ResMainDTO> getMainData(){
        List<UserEntity> userEntityList = userRepository.findAll();

        List<ResMainDTO> resMainDTOList = userEntityList
        .stream()
        .map((userEntity) -> ResMainDTO.fromEntity(userEntity))
        .toList();

        return resMainDTOList;
    }
}
