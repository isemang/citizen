package com.story.citizen.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Citizen extends Member {

    private String citizenName;

    private String profilePhotoYn;
    private Long profilePhotoNo;
    private String profileDetail;
}
