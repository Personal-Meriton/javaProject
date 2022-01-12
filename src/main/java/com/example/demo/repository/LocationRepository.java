package com.example.demo.repository;

import com.example.demo.pojo.entity.Location;
import com.example.demo.pojo.input.LocationInput;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location, Integer> {

    List<Location> findAll();
    Location findLocationById(Integer id);

}
