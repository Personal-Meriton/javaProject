package com.example.demo.service;

import com.example.demo.pojo.entity.Vehicles;
import com.example.demo.pojo.entity.Location;

import com.example.demo.pojo.input.VehiclesInput;

import java.util.List;

public interface VehiclesService {

    List<Vehicles> findAll();
    Vehicles findVehicleById(Integer id);
    Vehicles save(VehiclesInput vehicleInput);
    Vehicles update(Vehicles vehicle, VehiclesInput vehicleInput);
    void delete(Integer id);
}
