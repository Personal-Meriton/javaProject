package com.example.demo.service;

import com.example.demo.pojo.entity.Location;
import com.example.demo.pojo.entity.Vehicles;

import com.example.demo.pojo.input.LocationInput;
import com.example.demo.pojo.input.VehiclesInput;
import com.example.demo.repository.VehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DefaultVehiclesService implements VehiclesService {
    private LocationService locationService;
    @Autowired
    private VehiclesRepository vehiclesRepository;



    @Override
    public List<Vehicles> findAll() {
        return vehiclesRepository.findAll();
    }

    @Override
    public Vehicles findVehicleById(Integer id) {
        if (id == null) {
            return null;
        }
        return vehiclesRepository.findVehicleById(id);
    }

    @Override
    public Vehicles save(VehiclesInput vehicleInput) {

        String newBrand=vehicleInput.getBrand();
        String newModel=vehicleInput.getModel();
        Integer newYear=vehicleInput.getYear();
        String newFtype=vehicleInput.getFtype();
        String newMilage=vehicleInput.getMilage();
        Integer newHp=vehicleInput.getHp();
        String newGear=vehicleInput.getGear();
        String newColor=vehicleInput.getColor();
        String newPlate=vehicleInput.getPlate();
        float newPrice=vehicleInput.getPrice();
        Integer newlocation=vehicleInput.getLocationid();
        // Integer newLocation=location.getId();
       // Location newLocation=vehicleInput.getLocation();



        Vehicles vehicle = new Vehicles();
            vehicle.setBrand(newBrand);
            vehicle.setModel(newModel);
            vehicle.setYear(newYear);
            vehicle.setFtype(newFtype);
            vehicle.setMilage(newMilage);
            vehicle.setHp(newHp);
            vehicle.setGear(newGear);
            vehicle.setColor(newColor);
            vehicle.setPlate(newPlate);
            vehicle.setPrice(newPrice);
            vehicle.setLocationid(newlocation);
         //  vehicle.setLocationid(newLocation);

        return vehiclesRepository.save(vehicle);
    }

    @Override
    public Vehicles update(Vehicles vehicle, VehiclesInput vehiclesInput) {
        String updateBrand= vehiclesInput.getBrand();
        String updateModel= vehiclesInput.getModel();
        Integer updateYear= vehiclesInput.getYear();
        String updateFtype= vehiclesInput.getFtype();
        String updateMilage= vehiclesInput.getMilage();
        Integer updateHp= vehiclesInput.getHp();
        String updateGear= vehiclesInput.getGear();
        String updateColor= vehiclesInput.getColor();
        String updatePlate= vehiclesInput.getPlate();
        float updatePrice= vehiclesInput.getPrice();
        Integer updateLocation=vehiclesInput.getLocationid();




        vehicle.setBrand(updateBrand);
        vehicle.setModel(updateModel);
        vehicle.setYear(updateYear);
        vehicle.setFtype(updateFtype);
        vehicle.setMilage(updateMilage);
        vehicle.setHp(updateHp);
        vehicle.setGear(updateGear);
        vehicle.setColor(updateColor);
        vehicle.setPlate(updatePlate);
        vehicle.setPrice(updatePrice);
        vehicle.setLocationid(updateLocation);

        return vehiclesRepository.save(vehicle);
    }

    @Override
    public void delete(Integer id) {
        vehiclesRepository.deleteById(id);
    }

}
