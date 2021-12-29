package com.story.citizen.domain;

import com.story.citizen.domain.base.FileBaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class ProfileFile extends FileBaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "profile_file_no")
    private Long profileFileNo;

}
