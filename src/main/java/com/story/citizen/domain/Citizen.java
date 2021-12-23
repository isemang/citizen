package com.story.citizen.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Citizen extends Member {

    @OneToOne
    @JoinColumn(name = "citizen_no")
    private Member member;

    @Column(name = "citizen_id", nullable = false)
    private String citizenId;

    @Column(name = "citizen_nm", nullable = false)
    private String citizenName;

    @Column(name = "profile_photo_yn", nullable = false)
    @Enumerated(EnumType.STRING)
    private YesNoType profilePhotoYn;

    @Column(name = "profile_photo_no")
    private Long profilePhotoNo;

    @Column(name = "profile_detail")
    private String profileDetail;
}
