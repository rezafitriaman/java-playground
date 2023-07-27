package nl.reza.vehicle.infrastructure;

import nl.reza.vehicle.enums.BodyStyle;
import nl.reza.vehicle.enums.BusType;
import nl.reza.vehicle.enums.VehicleType;
import nl.reza.vehicle.infrastructure.entity.BusEntity;
import nl.reza.vehicle.infrastructure.entity.CarEntity;
import nl.reza.vehicle.infrastructure.entity.VehicleEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static  org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@DataJpaTest
class VehicleRepositoryTest {

    @Autowired
    private VehicleRepository repository;

    @BeforeEach
    void setUp(){
        repository.save(getVehicleOfType(VehicleType.CAR));
        repository.save(getVehicleOfType(VehicleType.CAR));
        repository.save(getVehicleOfType(VehicleType.BUS));
    }

    @Test
    void findAllByVehicleType() {
        var allVehicles = repository.findAll();

        assertThat(allVehicles).hasSize(3);

        var cars = repository.findAllByVehicleType(VehicleType.CAR);
        assertThat(cars).hasSize(2);

        var busses = repository.findAllByVehicleType(VehicleType.BUS);
        assertThat(busses).hasSize(1);
    }

    private static VehicleEntity getVehicleOfType(VehicleType type) {
        return switch (type) {
            case CAR -> getCar();
            case BUS -> getBus();
/**/        };
    }

    private static CarEntity getCar() {
        var car =new CarEntity();
        car.setVehicleType(VehicleType.CAR);
        car.setBrand("brand");
        car.setModel("model");
        car.setNumberOfDoors(4);
        car.setBodyStyle(BodyStyle.CONVERTIBLE);
        return car;
    }

    private static BusEntity getBus() {
        var bus =new BusEntity();
        bus.setVehicleType(VehicleType.BUS);
        bus.setBrand("brand");
        bus.setModel("model");
        bus.setBusType(BusType.COACH);
        bus.setLitersLuggageCapacity(4);

        return bus;
    }
}