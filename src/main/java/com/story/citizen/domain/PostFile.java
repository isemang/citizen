package com.story.citizen.domain;

import com.story.citizen.domain.enumType.FileType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class PostFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postFileNo;

    @Column(name = "")
    private String fileNm;

    @Column(name = "")
    @Enumerated(EnumType.STRING)
    private FileType fileType;

    //postNo로 Post와 연결됨
}
