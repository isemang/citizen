package com.story.citizen.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class CommentLikes {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "", nullable = false)
    private Long commentLikesNo;

    //commentNo로 comment와 연결됨
    //citizenNo로 citizen과 연결됨
}
