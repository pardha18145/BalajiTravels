package com.spanprojects.msscbrewery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spanprojects.msscbrewery.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    // You can add custom queries or methods here if needed
}