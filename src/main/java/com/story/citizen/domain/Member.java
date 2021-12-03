package com.story.citizen.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class Member {

    @Column(name = "citizen_no")
    @NotEmpty
    private Long citizenNo;

    private String email;
    private String realName;
    private String password;
    private Long birth;
}
