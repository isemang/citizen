package com.story.citizen.domain;

import com.story.citizen.domain.enumType.YnType;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter 
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "", nullable = false)
    private Long postNo;

    @Column(name = "")
    @Enumerated(EnumType.STRING)
    private YnType locationYn;

    @Column(name = "")
    private String content;

    @Column(name = "")
    private Long likeCnt;

    //citizenNo로 citizen과 연결됨
    //locationNo로 location과 연결됨
}
