package com.example.project1.domain.second.service;

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

