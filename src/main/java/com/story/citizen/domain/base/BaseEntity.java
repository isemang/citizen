package com.story.citizen.domain.base;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
public abstract class BaseEntity {

    @Column(name = "reg_dt")
    private LocalDateTime regDt;

    @Column(name = "upd_dt")
    private LocalDateTime updDt;
}
