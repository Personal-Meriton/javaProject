package com.example.demo.pojo.input;

import com.example.demo.pojo.entity.Location;
import com.example.demo.service.LocationService;

public class VehiclesInput {
//    public LocationService locationService;
    private String brand;
    private String model;
    private Integer year;
    private String ftype;
    private String milage;
    private Integer hp;
    private String gear;
    private String color;
    private String plate;
    private Float price;
    private Integer locationid;
//    private Location location;

    public VehiclesInput() {
    }

    public VehiclesInput(String brand, String model, Integer year, String ftype, String milage, Integer hp, String gear, String color, String plate, Float price ,Integer locationid ) {
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
        //this.location=this.locationService.findLocationById(locationid);
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    //    public Location getLocation() {
//        return location;
//    }
//
//    public void setLocation(Location location) {
//        this.location = location;
//    }
}