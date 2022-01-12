package com.example.demo.service;

import com.example.demo.pojo.entity.Location;
import com.example.demo.pojo.input.LocationInput;
import com.example.demo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DefaultLocationService implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    @Override
    public Location findLocationById(Integer id) {
        if (id == null) {
            return null;
        }
        return locationRepository.findLocationById(id);
    }

    @Override
    public Location save(LocationInput locationInput) {
        String newName = locationInput.getName();
        String newCity = locationInput.getCity();
        String newAddress = locationInput.getAddress();


        Location location = new Location();
            location.setName(newName);
            location.setCity(newCity);
            location.setAddress(newAddress);

        return locationRepository.save(location);
    }

    @Override
    public Location update(Location location, LocationInput locationInput) {
        String updatedName = locationInput.getName();
        String updatedCity = locationInput.getCity();
        String updatedAddress= locationInput.getAddress();

       location.setName(updatedName);
       location.setCity(updatedCity);
       location.setAddress(updatedAddress);

        return locationRepository.save(location);
    }

    @Override
    public void delete(Integer id) {
        locationRepository.deleteById(id);
    }

}
