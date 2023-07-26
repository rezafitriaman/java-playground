package nl.reza.vehicle.domain;

import lombok.Data;
import nl.reza.vehicle.enums.VehicleType;

@Data
public class Vehicle {
    private Long id;
    private VehicleType vehicleType;
    private String brand;
    private String model;
}
