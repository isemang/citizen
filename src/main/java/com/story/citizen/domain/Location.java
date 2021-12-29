package com.story.citizen.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Location {

    @Id
    @GeneratedValue
    @Column(name = "", nullable = false)
    private Long locationNo;

    @Column(name = "")
    private String locationNm;

    @Column(name = "")
    private Double latitude;

    @Column(name = "")
    private Double longitude;
}