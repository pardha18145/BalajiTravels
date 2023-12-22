package com.spanprojects.msscbrewery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleID;

    private String vehicleType;
    private String model;
    private String registrationNumber;
    private int capacity;
    private String availabilityStatus;

    // Constructors, getters, and setters

    public Vehicle() {
        // Default constructor
    }

    public Vehicle(String vehicleType, String model, String registrationNumber, int capacity, String availabilityStatus) {
        this.vehicleType = vehicleType;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.capacity = capacity;
        this.availabilityStatus = availabilityStatus;
    }

    // Getters and setters for each field

    public Long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(Long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}
