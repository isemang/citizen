package com.story.citizen.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "citizen_no", nullable = false)
    private Long citizenNo;

    @Column(nullable = false)
    private String email;

    @Column(name = "name", nullable = false)
    private String realName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private int birth;
}
