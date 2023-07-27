package nl.reza.vehicle.domain;

import lombok.Getter;
import lombok.Setter;
import nl.reza.vehicle.enums.BodyStyle;
@Getter
@Setter
public class Car extends Vehicle {
    private BodyStyle bodyStyle;
    private int numberOfDoors;
}
