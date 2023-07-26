package nl.reza.vehicle.api.dto;

import nl.reza.vehicle.enums.VehicleType;

public record VehicleDTO(Long id, VehicleType type, String brand, String model ) {

}
