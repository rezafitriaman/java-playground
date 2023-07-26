package nl.reza.vehicle.infrastructure.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.reza.vehicle.enums.VehicleType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class VehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private VehicleType vehicleType;

    private String brand;

    private String model;
}
