package com.story.citizen.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "COMMENT_LIKES")
public class CommentLikes {

    @Id
    @GeneratedValue
    @Column(name = "comment_likes_no")
    private Long pkNo;

    //comment-commentlikes 관계
    //하나의 코멘트는 여러개의 좋아요를 받을 수 있다
    //하나의 좋아요는 한 코멘트에만 귀속된다
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment")
    private Comment comment;

    //citizen-commentlikes 관계
    //하나의 코멘트좋아요는 한 명의 시티즌에게만 귀속된다
    //한 명의 시티즌은 여러 개의 좋아요를 누를 수 있다
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "citizen")
    private Citizen citizen;

}
