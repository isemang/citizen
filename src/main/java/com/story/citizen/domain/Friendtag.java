package com.story.citizen.domain;

import com.story.citizen.domain.enumType.FriendtagType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
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
