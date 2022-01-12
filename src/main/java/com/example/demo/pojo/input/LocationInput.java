package com.example.demo.pojo.input;



import java.util.List;

public class LocationInput {

    private String name;
    private String city;
    private String address;


    public LocationInput() {
    }

    public LocationInput(String name, String city,String address ) {
        this.name = name;
        this.city = city;
        this.address=address;

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


}

