package com.example.demo.pojo.entity;

import com.example.demo.pojo.input.LocationInput;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "vehicles")
public class Vehicles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private Integer year;

    @Column(name = "ftype")
    private String ftype;

    @Column(name = "milage")
    private String milage;

    @Column(name = "hp")
    private Integer hp;

    @Column(name = "gear")
    private String gear;

    @Column(name = "color")
    private String color;

    @Column(name = "plate")
    private String plate;

    @Column(name = "price")
    private float price;

    @Column(name="locationid")
    private Integer locationid;

//    @ManyToOne
//    @JoinColumn(name = "locationid")
//    @JsonManagedReference
//    private Location locationid;

    public Vehicles()
    {

    }

    public Vehicles(Integer id, String brand, String model, Integer year, String ftype, String milage, Integer hp, String gear, String color, String plate, float price,Integer locationid)  {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.ftype = ftype;
        this.milage = milage;
        this.hp = hp;
        this.gear = gear;
        this.color = color;
        this.plate = plate;
        this.price = price;
        this.locationid=locationid;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    public String getMilage() {
        return milage;
    }

    public void setMilage(String milage) {
        this.milage = milage;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    //    public Location getLocationid() {
//        return locationid;
//    }
//
//    public void setLocationid(Location locationid) {
//        this.locationid = locationid;
//    }
}
