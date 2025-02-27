package com.pmo.repository;

import com.pmo.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StateRepository extends JpaRepository<State, Integer> {
    List<State> findAll();
}
