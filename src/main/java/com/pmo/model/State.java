package com.pmo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "STATE_MASTER")
@NoArgsConstructor
@AllArgsConstructor
public class State {
    @Id
    private Long id;
    private String country;
    private String stateName;
    private String stateCode;
    private String region;
    private String division;

}
