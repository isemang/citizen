package com.story.citizen.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class ProfileFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "", nullable = false)
    private Long profileFileNo;

    @Column(name = "")
    private String fileNm;

    @Column(name = "")
    private String filePath;

    //citizenNo로 citizen과 연결됨
}
