package com.story.citizen.domain;

import com.story.citizen.domain.enumType.YnType;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter 
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "", nullable = false)
    private Long commentNo;

    @Column(name = "")
    @Enumerated(EnumType.STRING)
    private YnType childCommentYn;

    //이거 comment랑 결합되어있는 느낌? 인 것 같은데
    @Column(name = "")
    private Long ParentCommentNo;

    @Column(name = "")
    private String content;

    @Column(name = "")
    private Long likeCnt;

    //postNo로 post랑 연결됨
    //citizenNo로 citizen과 연결됨
}
