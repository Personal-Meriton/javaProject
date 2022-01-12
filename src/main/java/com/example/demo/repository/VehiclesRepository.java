package com.example.demo.repository;

import com.example.demo.pojo.entity.Vehicles;
import com.example.demo.pojo.input.VehiclesInput;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehiclesRepository extends CrudRepository<Vehicles, Integer> {

    List<Vehicles> findAll();
    Vehicles findVehicleById(Integer id);

}
