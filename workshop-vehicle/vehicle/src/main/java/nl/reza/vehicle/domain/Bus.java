package nl.reza.vehicle.domain;

import lombok.Getter;
import lombok.Setter;
import nl.reza.vehicle.enums.BusType;
@Getter
@Setter
public class Bus extends Vehicle {
    private BusType busType;
    private int litersLuggageCapacity;
}
