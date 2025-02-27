package com.pmo.service;

import com.pmo.model.Vehicle;
import com.pmo.repository.vehicleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {
    private final vehicleRepository vehicleRepository;

    public VehicleService(vehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        return vehicleRepository.findAll();
    }
}
