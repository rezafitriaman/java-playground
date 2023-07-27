package nl.reza.vehicle.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.reza.vehicle.enums.BusType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class BusEntity extends VehicleEntity {
    @Enumerated(value = EnumType.STRING)
    private BusType busType;
    private int litersLuggageCapacity;
}
