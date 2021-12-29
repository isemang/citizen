package com.story.citizen.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Hashtag {

    @Id
    @GeneratedValue
    @Column(name = "hashtag_no")
    private Long hashtagNo;

    @Column(name = "hashtag_nm")
    private String hashtagNm;

    @Column(name = "hashtag_cnt")
    private Long hashtagCnt;

    //postHashtag와 양방향 매핑
    @OneToMany(mappedBy = "HashtagList")
    List<HashtagList> hashtagList = new ArrayList<>();
}
