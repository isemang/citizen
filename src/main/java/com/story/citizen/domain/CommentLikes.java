package com.story.citizen.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class CommentLikes {

    @Id @GeneratedValue
    @Column(name = "", nullable = false)
    private Long commentLikesNo;

    //commentNo로 comment와 연결됨
    //citizenNo로 citizen과 연결됨
}
