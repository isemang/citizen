package com.story.citizen.domain.base;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
public abstract class FileBaseEntity {

    @Column(name = "file_nm")
    private String fileNm;

    @Column(name = "file_path")
    private String filePath;

    @Column(name = "reg_dt")
    private LocalDateTime regDt;
}
