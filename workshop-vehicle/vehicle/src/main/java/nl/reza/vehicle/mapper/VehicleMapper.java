package nl.reza.vehicle.mapper;

import nl.reza.vehicle.api.dto.VehicleDTO;
import nl.reza.vehicle.domain.Vehicle;
import nl.reza.vehicle.infrastructure.entity.VehicleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VehicleMapper {
    @Mapping(target = "type", source = "vehicleType")
    VehicleDTO map(Vehicle vehicle);

    @Mapping(target = "vehicleType", source = "type")
    Vehicle map(VehicleDTO dto);

    Vehicle map(VehicleEntity entity);

    VehicleEntity mapToVehicleEntity(Vehicle entity);
}
