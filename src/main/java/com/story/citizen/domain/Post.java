package com.story.citizen.domain;

import com.story.citizen.domain.base.BaseEntity;
import com.story.citizen.domain.enumType.YnType;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Post extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "post_no")
    private Long pkNo;

    //citizen-post 관계
    //하나의 시티즌은 여러 포스트를 가질 수 있고
    //한 포스트는 하나의 시티즌에만 귀속됨
    //citizen 입장 :  @OneToMany(mappedBy = "post") 적으면 됨
    //post 입장 :     @ManyToOne, @JoinColumn 적으면 됨

    //인프런 JPA 예제 속 member-team
    //하나의 팀은 여러 멤버를 가질 수 있고
    //하나의 맴버는 한 팀에만 귀속됨
    //member 입장 :   @ManyToOne, @JoinColumn 적으면 됨
    //team 입장 :     @OneToMany(mappedBy = "team")을 적어야 함
    @ManyToOne
    @JoinColumn(name = "citizen_no")
    private Citizen citizen;

    @Enumerated(EnumType.STRING)
    @Column(name = "location_yn")
    private YnType locationYn;

    //post-location 간 관계
    //한 포스트는 하나의 로케이션만 가질 수 있음
    //한 로케이션은 여러군데에서 태그될 수 있음
    @ManyToOne
    @JoinColumn(name = "location_no")
    private Location location;

    @Column(name = "content")
    private String content;

    @Column(name = "like_cnt")
    private Long likeCnt;

}
