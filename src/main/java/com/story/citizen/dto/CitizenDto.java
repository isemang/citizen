package com.story.citizen.dto;

import com.story.citizen.domain.enumType.YnType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CitizenDto {

    private Long citizenNo;
    private String email;
    private String realName;
    private String password;
    private LocalDate birth;
    private LocalDateTime joinDate;

    private String id; //(citizenId)
    private String citizenName;
    private String profileDetail;
    private YnType profilePhotoYn;
}