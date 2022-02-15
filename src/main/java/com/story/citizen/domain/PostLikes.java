package com.story.citizen.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "POST_LIKES")
public class PostLikes {

    @Id
    @GeneratedValue
    @Column(name = "post_likes_no")
    private Long pkNo;

    //post-postlikes관계
    //하나의 포스트는 여러개의 좋아요를 받을 수 있다
    //하나의 좋아요는 한 포스트에만 귀속된다
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_no")
    private Post post;

    //citizen-postLikes관계
    //하나의 포스트좋아요는 한 명의 시티즌에게만 귀속된다
    //한 명의 시티즌은 여러 개의 좋아요를 누를 수 있다
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "citizen_no")
    private Citizen citizen;

}
