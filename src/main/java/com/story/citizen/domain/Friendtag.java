package com.story.citizen.domain;

import com.story.citizen.domain.enumType.FriendtagType;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Friendtag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "", nullable = false)
    private Long friendtagNo;

    @Column(name = "")
    @Enumerated(EnumType.STRING)
    private FriendtagType friendtagType;

    @Column(name = "")
    private Double positionX;

    @Column(name = "")
    private Double positionY;

    //postNo로 post와 연결됨
    //postFileNo로 post-file과 연결됨
    //citizenNo로 citizen과 연결됨
}
