package com.story.citizen.domain;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Builder
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
    private LocalDate birth;

    protected Member() {
    }
}
