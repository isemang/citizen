package com.story.citizen.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Location {

    @Id
    @GeneratedValue
    @Column(name = "location_no")
    private Long locationNo;

    @Column(name = "location_nm")
    private String locationNm;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;
}
