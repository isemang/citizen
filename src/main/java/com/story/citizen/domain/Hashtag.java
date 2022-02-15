package com.story.citizen.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "HASHTAG")
public class Hashtag {

    @Id
    @GeneratedValue
    @Column(name = "hashtag_no")
    private Long pkNo;

    @Column(name = "hashtag_nm")
    private String hashtagNm;

    @Column(name = "hashtag_cnt")
    private Long hashtagCnt;

    //postHashtag와 양방향 매핑
    @OneToMany(mappedBy = "hashtag")
    List<HashtagList> hashtagList = new ArrayList<>();
}
