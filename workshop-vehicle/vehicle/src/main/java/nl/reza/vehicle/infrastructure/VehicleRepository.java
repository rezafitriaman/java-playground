package nl.reza.vehicle.infrastructure;

import nl.reza.vehicle.enums.VehicleType;
import nl.reza.vehicle.infrastructure.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {
    List<VehicleEntity> findAllByVehicleType(VehicleType type);
}
