package com.pmo.controller;

import com.pmo.demo.LargestEx;
import com.pmo.model.State;
import com.pmo.model.Vehicle;
import com.pmo.service.StateService;
import com.pmo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PMOController {
    final VehicleService vehicleService;
    final StateService StateService;

    public PMOController(VehicleService vehicleService, com.pmo.service.StateService stateService, LargestEx largestEx)
    {

        this.vehicleService = vehicleService;
        StateService = stateService;
    }

    @GetMapping(value = "/app/healthCheck")
    public String getHealth() {
        return "PMO app is up and running in Port 9090";
    }

    @GetMapping(value = "/app/vehicleInfo")
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping(value = "/app/States")
    public List<State> getAllStates() {
        return StateService.getAllStates();
    }
}

