package nl.reza.vehicle.api;

import lombok.RequiredArgsConstructor;
import nl.reza.vehicle.api.dto.VehicleDTO;
import nl.reza.vehicle.domain.Vehicle;
import nl.reza.vehicle.domain.service.VehicleService;
import nl.reza.vehicle.enums.VehicleType;
import nl.reza.vehicle.mapper.VehicleMapper;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class VehicleController {
    private final VehicleService vehicleService;
    private final VehicleMapper vehicleMapper;

    @PostMapping("/vehicles")
    public VehicleDTO saveVehicle(@RequestBody VehicleDTO dto) {
        return vehicleMapper.map(vehicleService.saveVehicle(vehicleMapper.map(dto)));
    }

    @GetMapping("/vehicles")
    public List<VehicleDTO> getVehicles(@RequestParam(required = false) VehicleType type) {
        return Optional.ofNullable(type)
                .map(vehicleService::getAllVehiclesOfType)
                .orElseGet(vehicleService::getAllVehicles)
                .stream()
                .map(vehicleMapper::map)
                .toList();
    }

    @GetMapping("/vehicles/{id}")
    public VehicleDTO getVehicleById(@PathVariable Long id) {
        return vehicleMapper.map(vehicleService.getVehicleById(id));
    }

    @PutMapping("/vehicles/{id}")
    public VehicleDTO updateVehicleWithId(@PathVariable Long id, VehicleDTO dto) {
        return vehicleMapper.map(vehicleService.updateVehicle(id, map(dto)));
    }

    @DeleteMapping("/vehicles/{id}")
    public void deleteVehicleById(@PathVariable Long id) {
        vehicleService.deleteVehicleById(id);
    }

    private static Vehicle map(VehicleDTO dto) {
        var vehicle = new Vehicle();
        vehicle.setId(dto.id());
        vehicle.setVehicleType(dto.type());
        vehicle.setBrand(dto.brand());
        vehicle.setModel(dto.model());

        return vehicle;
    }

    private static VehicleDTO map(Vehicle vehicle) {
        return new VehicleDTO(vehicle.getId(), vehicle.getVehicleType(), vehicle.getBrand(), vehicle.getModel());
    }

}
