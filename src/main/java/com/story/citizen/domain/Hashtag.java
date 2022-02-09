package com.story.citizen.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Hashtag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "", nullable = false)
    private Long hashtagNo;

    @Column(name = "")
    private String hashtagNm;

    @Column(name = "")
    private Long hashtagCnt;
}
