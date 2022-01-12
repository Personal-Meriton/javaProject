package com.example.demo.service;

import com.example.demo.pojo.entity.Location;
import com.example.demo.pojo.input.LocationInput;

import java.util.List;

public interface LocationService {

    List<Location> findAll();
    Location findLocationById(Integer id);
    Location save(LocationInput locationInput);
    Location update(Location location, LocationInput locationInput);
    void delete(Integer id);
}
