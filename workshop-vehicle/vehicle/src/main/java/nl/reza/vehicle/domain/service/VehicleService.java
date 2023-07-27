package nl.reza.vehicle.domain.service;

import nl.reza.vehicle.domain.Vehicle;
import nl.reza.vehicle.enums.VehicleType;

import java.util.List;

public interface VehicleService {

    Vehicle getVehicleById(Long id);
    List<Vehicle> getAllVehicles();
    List<Vehicle> getAllVehiclesOfType(VehicleType type);
    Vehicle saveVehicle(Vehicle vehicle);
    Vehicle updateVehicle(Long id, Vehicle vehicle);
    void deleteVehicleById(Long id);
}
