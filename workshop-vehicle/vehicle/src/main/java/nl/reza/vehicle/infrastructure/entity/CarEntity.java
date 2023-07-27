package nl.reza.vehicle.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.reza.vehicle.enums.BodyStyle;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class CarEntity extends VehicleEntity {
    @Enumerated(value = EnumType.STRING)
    private BodyStyle bodyStyle;
    private int numberOfDoors;
}
