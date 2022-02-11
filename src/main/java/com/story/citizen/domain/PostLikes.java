package com.story.citizen.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class PostLikes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "", nullable = false)
    private Long postLikesNo;

    //postNo로 post와 연결됨
    //citizenNo로 citizen과 연결됨
}
