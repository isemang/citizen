package com.story.citizen.domain;

import com.story.citizen.domain.base.FileBaseEntity;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "PROFILE_FILE")
public class ProfileFile extends FileBaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "profile_file_no")
    private Long pkNo;

}
