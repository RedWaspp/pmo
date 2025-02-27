package com.pmo.repository;

import com.pmo.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface vehicleRepository extends JpaRepository<Vehicle, Long> {
    List findAll();
}
