package nl.reza.vehicle.api.dto;

import lombok.Getter;
import lombok.Setter;
import nl.reza.vehicle.enums.BodyStyle;
import nl.reza.vehicle.enums.VehicleType;

@Getter
@Setter
public class CarDTO extends VehicleDTO {
    private int numberOfDoors;
    private BodyStyle bodyStyle;

    public CarDTO(Long id, VehicleType type, String brand, String model, int numberOfDoors, BodyStyle bodyStyle) {
        super(id, type, brand, model);
        this.numberOfDoors = numberOfDoors;
        this.bodyStyle = bodyStyle;
    }
}
