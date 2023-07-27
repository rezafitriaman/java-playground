package nl.reza.vehicle.api.dto;

import lombok.Getter;
import lombok.Setter;
import nl.reza.vehicle.enums.BusType;
import nl.reza.vehicle.enums.VehicleType;

@Getter
@Setter
public class BusDTO extends VehicleDTO{
    private BusType busType;
    private int litersLuggageCapacity;

    public BusDTO(Long id, VehicleType type, String brand, String model, BusType bustype, int litersLuggageCapacity) {
        super(id, type, brand, model);
        this.busType = bustype;
        this.litersLuggageCapacity = litersLuggageCapacity;
    }
}
