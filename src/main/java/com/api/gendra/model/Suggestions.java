package com.api.gendra.model;

import javax.persistence.*;

@Entity
@Table(name = "geoname")
public class Suggestions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "geonameid", unique = true, nullable = false)
    private Long geonameid;
    private String name;
    private double latitude;
    private double longitude;

    public Suggestions(Long geonameid, String name, double latitude, double longitude) {
        this.geonameid = geonameid;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }//constructor

    public Suggestions(){};//constructor vacio


    public Long getGeonameid() {
        return geonameid;
    }

    public void setGeonameid(Long geonameid) {
        this.geonameid = geonameid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}//class suggestions
