package com.example.demo.controller;


import com.example.demo.pojo.entity.Vehicles;
import com.example.demo.pojo.entity.Location;

import com.example.demo.pojo.input.LocationInput;
import com.example.demo.pojo.input.VehiclesInput;
import com.example.demo.service.VehiclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class VehiclesController {

    @Autowired
    private VehiclesService vehiclesService;

    @GetMapping("/vehicle")
    public List<Vehicles> getVehicle() {
        return vehiclesService.findAll();
    }

    @GetMapping("/vehicle/{id}")
    public Vehicles findVehicle(@PathVariable Integer id) {
        return vehiclesService.findVehicleById(id);
    }

    @PostMapping("/vehicles")
    public Vehicles createVehicle(@RequestBody VehiclesInput vehicleInput) {
        return vehiclesService.save(vehicleInput);
    }

    @PutMapping("/vehicle/{id}")
    public Vehicles updateVehicle(@PathVariable Integer id,
                               @RequestBody VehiclesInput vehicleInput) {

        Vehicles vehicle = vehiclesService.findVehicleById(id);
        if (vehicle == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Note object with " + id + " not found!"
            );
        }

        return vehiclesService.update(vehicle, vehicleInput);
    }

    @DeleteMapping("/vehicle/{id}")
    public boolean deleteVehicle(@PathVariable Integer id) {
        vehiclesService.delete(id);
        return true;
    }

}
