package com.story.citizen.domain;

import com.story.citizen.domain.enumType.FriendtagType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Friendtag {

    @Id
    @GeneratedValue
    @Column(name = "friendtag_no")
    private Long friendtagNo;

    @Enumerated(EnumType.STRING)
    @Column(name = "friendtag_type")
    private FriendtagType friendtagType;

    //만약 friendtag를 사진에다가 했으면 positionX, positionY, postFile 필요
    @Column(name = "position_x")
    private Double positionX;

    @Column(name = "position_y")
    private Double positionY;

    //friendtag-citizen 관계
    //한 friendtag는 한 명의 시티즌에만 가능
    //한 시티즌은 여러 프랜드태그에 있을 수 있음
    @ManyToOne
    @JoinColumn(name = "citizen_no")
    private Citizen citizen;

    //friendtag-post 관계
    //한 프랜드태그는 한 포스트에만 가능
    //한 포스트는 여러 프랜드 태그 가질 수 있음
    @ManyToOne
    @JoinColumn(name = "post_no")
    private Post post;

    //friendtag-postFile 관계 (없음도 가능)
    //한 프랜드태그는 하나 or 0개의 포스트 파일에만 가능
    //한 포스트파일에는 여러개의 프랜드태그 가능
    @ManyToOne
    @JoinColumn(name = "post_file_no")
    private PostFile postFile;

}
