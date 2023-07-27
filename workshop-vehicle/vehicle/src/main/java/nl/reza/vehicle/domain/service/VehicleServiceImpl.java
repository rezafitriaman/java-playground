package nl.reza.vehicle.domain.service;

import lombok.RequiredArgsConstructor;
import nl.reza.vehicle.domain.Vehicle;
import nl.reza.vehicle.enums.VehicleType;
import nl.reza.vehicle.exception.NotFoundException;
import nl.reza.vehicle.infrastructure.VehicleRepository;
import nl.reza.vehicle.mapper.VehicleMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository repository;
    private final VehicleMapper vehicleMapper;

    @Override
    @Transactional(readOnly = true)
    public Vehicle getVehicleById(Long id) {
        return repository.findById(id)
                .map(vehicleMapper::map)
                .orElseThrow(() -> new NotFoundException("Vehicle with id 1 not found"));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Vehicle> getAllVehicles() {
        return repository
                .findAll()
                .stream()
                .map(vehicleMapper::map)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Vehicle> getAllVehiclesOfType(VehicleType type) {
        return repository
                .findAllByVehicleType(type)
                .stream()
                .map(vehicleMapper::map)
                .toList();
    }

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleMapper.map(repository.save(vehicleMapper.mapToVehicleEntity(vehicle)));
    }

    @Override
    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
        getVehicleById(id);
        return saveVehicle(vehicle);
    }

    @Override
    public void deleteVehicleById(Long id) {
        getVehicleById(id);
        repository.deleteById(id);
    }
}
