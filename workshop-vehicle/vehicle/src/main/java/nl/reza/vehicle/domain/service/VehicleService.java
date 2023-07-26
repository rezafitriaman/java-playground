package nl.reza.vehicle.domain.service;

import nl.reza.vehicle.domain.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle getVehicleById(Long id);
    List<Vehicle> getAllVehicles();
    Vehicle saveVehicle(Vehicle vehicle);
    Vehicle updateVehicle(Long id, Vehicle vehicle);
    void deleteVehicleById(Long id);
}
