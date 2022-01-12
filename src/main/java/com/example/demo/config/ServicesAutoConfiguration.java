package com.example.demo.config;

import com.example.demo.service.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesAutoConfiguration {

    @Bean
    public LocationService locationServiceService() {
        return new DefaultLocationService();
    }

    @Bean
    public VehiclesService vehiclesServiceService() {
        return new DefaultVehiclesService();
    }

    @Bean
    public CostumerService costumerServiceService() {
        return new DefaultCostumerService();
    }

}
