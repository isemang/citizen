package com.story.citizen.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "LOCATION")
public class Location {

    @Id
    @GeneratedValue
    @Column(name = "location_no")
    private Long pkNo;

    @Column(name = "location_nm")
    private String locationNm;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;
}
