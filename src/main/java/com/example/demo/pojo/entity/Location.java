package com.example.demo.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

//    @OneToMany(mappedBy = "locationid")
//    @JsonBackReference
//    private List<Vehicles> vehicles;


    public Location() {
    }

    public Location(Integer id, String name, String city , String address ) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
//        this.vehicles=vehicles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
//
//    public List<Vehicles> getVehicles() {
//        return vehicles;
//    }
//
//    public void setVehicles(List<Vehicles> vehicles) {
//        this.vehicles = vehicles;
//    }
}
