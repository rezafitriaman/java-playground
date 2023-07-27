package nl.reza.vehicle.mapper;

import nl.reza.vehicle.api.dto.BusDTO;
import nl.reza.vehicle.api.dto.CarDTO;
import nl.reza.vehicle.api.dto.VehicleDTO;
import nl.reza.vehicle.domain.Bus;
import nl.reza.vehicle.domain.Car;
import nl.reza.vehicle.domain.Vehicle;
import nl.reza.vehicle.infrastructure.entity.BusEntity;
import nl.reza.vehicle.infrastructure.entity.CarEntity;
import nl.reza.vehicle.infrastructure.entity.VehicleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VehicleMapper {
    @Mapping(target = "type", source = "vehicleType")
    CarDTO map(Car vehicle);

    @Mapping(target = "type", source = "vehicleType")
    BusDTO map(Bus vehicle);

    //@Mapping(target = "vehicleType", source = "type")
    //Vehicle map(VehicleDTO dto);

    @Mapping(target = "vehicleType", source = "type")
    Bus map(BusDTO dto);

    @Mapping(target = "vehicleType", source = "type")
    Car map(CarDTO dto);

    Car map(CarEntity entity);

    Bus map(BusEntity entity);

    BusEntity mapToBusEntity(Bus bus);

    CarEntity mapToCarEntity(Car var);

    default VehicleDTO map(Vehicle vehicle) {
        return switch (vehicle.getVehicleType()) {
            case CAR -> map((Car) vehicle);
            case BUS -> map((Bus) vehicle);
        };
    }

    default Vehicle map(VehicleEntity entity) {
        return switch (entity.getVehicleType()) {
            case CAR -> map((CarEntity) entity);
            case BUS -> map((BusEntity) entity);
        };
    }

    default Vehicle map(VehicleDTO dto){
        return switch (dto.getType()){
            case CAR -> map((CarDTO) dto);
            case BUS -> map((BusDTO) dto);
        };
    }

    default VehicleEntity mapToVehicleEntity(Vehicle vehicle) {
        return switch (vehicle.getVehicleType()){
            case BUS -> mapToBusEntity((Bus) vehicle);
            case CAR -> mapToCarEntity((Car) vehicle);
        };
    }



    //Vehicle map(VehicleEntity entity);

    //VehicleEntity mapToVehicleEntity(Vehicle entity);


}
