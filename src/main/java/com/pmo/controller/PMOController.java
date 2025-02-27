package com.pmo.controller;

import com.pmo.appHealth.DatabaseConnectionChecker;
import com.pmo.demo.LargestEx;
import com.pmo.service.StateService;
import com.pmo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PMOController {
    // /app/healthCheck
    @Autowired
    VehicleService vehicleService;

    @Autowired
    StateService StateService;
    @Autowired
    LargestEx largestEx;

    @Autowired
    DatabaseConnectionChecker dbConnectionChecker;

    @GetMapping(value = "/app/healthCheck")
    public String getHealth() {
        return "PMO app is up and running in Port 9090 and DB Connection Status :  "+dbConnectionChecker.isDatabaseConnected();
    }

    @GetMapping(value = "/app/largestEx")
    public Integer largestEx() {
        return largestEx.largest() ;
    }


    @GetMapping(value = "/app/vehicleInfo")
    public List getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping(value = "/app/States")
    public List getAllStates() {
        return StateService.getAllStates();
    }
//  Idempotent
//    @PostMapping // Create RequestBody (Payload)
//    @PutMapping  // Update by ID (same Payload)  // URI must for ID // 200 Response but no body
//    @GetMapping // Find ALl or Find by ID (Pay load not required)
//    @DeleteMapping // Delete ID (Pay load not required
}

