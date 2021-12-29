package com.story.citizen.domain;

import com.story.citizen.domain.base.FileBaseEntity;
import com.story.citizen.domain.enumType.FileType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class PostFile extends FileBaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "post_file_no")
    private Long postFileNo;

    @Enumerated(EnumType.STRING)
    @Column(name = "file_type")
    private FileType fileType;

    //postFile-post 관계
    //한 포스트는 여러개의 포스트파일을 가질 수 있고
    //한 포스트파일은 한 포스트에만 귀속될 수 있다
    @ManyToOne
    @JoinColumn(name = "post_no")
    private Post post;

}
