package com.pmo.controller;

import com.pmo.demo.LargestEx;
import com.pmo.model.State;
import com.pmo.model.Vehicle;
import com.pmo.service.StateService;
import com.pmo.service.VehicleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PMOController {
    //Never  use @Autowired instead use Constructor Injection
    final VehicleService vehicleService;
    final StateService StateService;

    //Constructor Injection
    public PMOController(VehicleService vehicleService, com.pmo.service.StateService stateService) {
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

