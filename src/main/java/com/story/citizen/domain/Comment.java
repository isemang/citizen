package com.story.citizen.domain;

import com.story.citizen.domain.base.BaseEntity;
import com.story.citizen.domain.enumType.YnType;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Comment extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "comment_no")
    private Long pkNo;

    @Enumerated(EnumType.STRING)
    @Column(name = "child_comment_yn")
    private YnType childCommentYn;

    @Column(name = "parent_comment_no")
    private Long parentCommentNo;

    @Column(name = "comment_detail")
    private String commentDetail;

    @Column(name = "like_cnt")
    private Long likeCnt;

    //comment-citizen
    //한 코멘트는 한 시티즌만 작성할 수 있음
    //한 시티즌은 여러 코멘트를 작성할 수 있음
    @ManyToOne
    @JoinColumn(name = "citizen_no")
    private Citizen citizen;

    //comment-post
    //한 코멘트는 한 포스트에만 귀속될 수 있다
    //한 포스트에는 여러 코멘트가 있을 수 있다
    @ManyToOne
    @JoinColumn(name = "post_no")
    private Post post;
}
