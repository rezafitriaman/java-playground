package nl.reza.vehicle.domain.service;

import nl.reza.vehicle.domain.Bus;
import nl.reza.vehicle.domain.Vehicle;
import nl.reza.vehicle.enums.VehicleType;
import nl.reza.vehicle.exception.NotFoundException;
import nl.reza.vehicle.infrastructure.VehicleRepository;
import nl.reza.vehicle.infrastructure.entity.BusEntity;
import nl.reza.vehicle.infrastructure.entity.CarEntity;
import nl.reza.vehicle.infrastructure.entity.VehicleEntity;
import nl.reza.vehicle.mapper.VehicleMapperImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@SpringJUnitConfig({VehicleServiceImpl.class, VehicleMapperImpl.class})
class VehicleServiceImplTest {
    @Autowired
    private VehicleService vehicleService;

    @MockBean
    private VehicleRepository repository;

    @Test
    @DisplayName("Happy flow - getVehicleById")
    void getVehicleById_existingVehicle() {
        when(repository.findById(anyLong())).thenReturn(Optional.of(getDefaultEntity()));

        var vehicle = vehicleService.getVehicleById(1L);

        assertThat(vehicle).isNotNull().isInstanceOf(Vehicle.class);
        assertThat(vehicle.getId()).isEqualTo(1L);
        assertThat(vehicle.getBrand()).isEqualTo("Volkswagen");
        assertThat(vehicle.getModel()).isEqualTo("Golf");
        assertThat(vehicle.getVehicleType()).isEqualTo(VehicleType.CAR);
    }

    private static VehicleEntity getDefaultEntity(){
        var entity = new CarEntity();
        entity.setId(1L);
        entity.setBrand("Volkswagen");
        entity.setModel("Golf");
        entity.setVehicleType(VehicleType.CAR);

        return entity;
    }

    @Test
    @DisplayName("Not happy flow - getVehicleById")
    void getVehicleById_notExistingVehicle() {
        when(repository.findById(anyLong()))
                .thenReturn(Optional.empty());

        var message = assertThrows(NotFoundException.class, () -> vehicleService.getVehicleById(1L)).getMessage();

        assertThat(message).isEqualTo("Vehicle with id 1 not found");
    }
}