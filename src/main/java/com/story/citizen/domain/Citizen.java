package com.story.citizen.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter @Setter @ToString
public class Citizen extends Member {

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
