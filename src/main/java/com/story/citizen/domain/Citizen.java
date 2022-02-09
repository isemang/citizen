package com.story.citizen.domain;

import com.story.citizen.domain.enumType.YnType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Citizen {

    /***** 멤버 기본 정보 *****/
    @Id
    @GeneratedValue
    @Column(name = "citizen_no")
    private Long citizenNo;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "birth")
    private LocalDateTime birth;

    @Column(name = "name")
    private String realName;

    @Column(name = "join_dt")
    private LocalDateTime joinDate;

    /***** 시티즌 정보 *****/
    @Column(name = "citizen_id")
    private String id;

    @Column(name = "citizen_nm")
    private String citizenName;

    @Column(name = "profile_detail")
    private String profileDetail;

    @Enumerated(EnumType.STRING)
    @Column(name = "profile_photo_yn")
    private YnType profilePhotoYn;

    //profile_file 테이블과 연결되어있음
    @OneToOne
    @JoinColumn(name = "profile_photo_no")
    private ProfileFile profileFile;

    //post와 양방향 매핑: citizen이 어떤 post를 올렸는지 확인해야 함
    @OneToMany(mappedBy = "post")
    List<Post> posts = new ArrayList<>();
}