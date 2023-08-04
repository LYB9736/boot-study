package com.example.project.model.user.entity;

import java.util.List;

import com.example.project.model.post.entity.PostEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "`user`")
@Getter
@Builder
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx", nullable = false, unique = true)
    private Integer idx;

    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "password", nullable = false)
    private String password;

    // @Column(name = "create_date" , nullable = false)
    // private LocalDateTime createDate;

    // @Column(name = "update_date")
    // private LocalDateTime updateDate;

    // @Column(name = "delete_date")
    // private LocalDateTime deleteDate;

    @OneToMany(mappedBy =  "userEntity")
    private List<PostEntity> PostEntityList;

}
