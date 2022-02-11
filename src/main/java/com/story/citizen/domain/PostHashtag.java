package com.story.citizen.domain;

import com.story.citizen.domain.enumType.HashtagType;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class PostHashtag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "", nullable = false)
    private Long postHashtagNo;

    @Column(name = "")
    @Enumerated(EnumType.STRING)
    private HashtagType tagType;

    //postNo로 post 연결
    //hashtagNo로 hashtag 연결
}