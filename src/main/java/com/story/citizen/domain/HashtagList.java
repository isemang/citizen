package com.story.citizen.domain;

import com.story.citizen.domain.enumType.HashtagType;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class HashtagList {
    //post-hashtag간 다대다관계를 풀어주는 엔티티

    //하나의 포스트는 여러 개의 포스트-해시태그를 가질 수 있음
    //하나의 포스트-해시태그는 하나의 포스트를 가질 수 있음

    //하나의 해시태그는 여러개의 포스트-해시태그를 가질 수 있음
    //하나의 포스트-해시태그는 하나의 해시태그를 가질 수 있음
    @Id
    @GeneratedValue
    @Column(name = "post_hashtag_no")
    private Long pkNo;

    @Enumerated(EnumType.STRING)
    @Column(name = "hashtag_type")
    private HashtagType hashtagType;    //해시태그 위치(comment, post)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hashtag_no")
    private Hashtag hashtag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_no")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_no")
    private Comment comment;
}
