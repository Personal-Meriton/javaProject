package com.example.demo.controller;

import com.example.demo.pojo.entity.Location;
import com.example.demo.pojo.input.LocationInput;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/location")
    public List<Location> getLocations() {
        return locationService.findAll();
    }

    @GetMapping("/location/{id}")
    public Location findLocation(@PathVariable Integer id) {
        return locationService.findLocationById(id);
    }

    @PostMapping("/location")
    public Location createLocation(@RequestBody LocationInput locationInput) {
        return locationService.save(locationInput);
    }

    @PutMapping("/location/{id}")
    public Location updateLocation(@PathVariable Integer id,
                           @RequestBody LocationInput locationInput) {

        Location location = locationService.findLocationById(id);
        if (location == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Note object with " + id + " not found!"
            );
        }

        return locationService.update(location, locationInput);
    }

    @DeleteMapping("/location/{id}")
    public boolean deleteLocation(@PathVariable Integer id) {
        locationService.delete(id);
        return true;
    }

}
