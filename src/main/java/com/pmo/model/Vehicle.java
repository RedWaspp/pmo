package com.pmo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Entity(name = "VEHICLE_INVENTORY")
@NoArgsConstructor
@AllArgsConstructor

public class Vehicle {
    @Column(name = "VEHICLE_NAME")
    String vehicleName;
    @Column(name = "MAKE")
    String make;
    @Column(name = "MODEL")
    String model;
    @Column(name = "BODY_TYPE")
    String vehicleType;
    @Column(name = "MODEL_YEAR")
    String modelYear;
    @Column(name = "VIN")
    String vin;
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
