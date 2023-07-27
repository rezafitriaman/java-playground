package nl.reza.vehicle.api.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import nl.reza.vehicle.enums.VehicleType;

import java.util.Objects;
@Data
@AllArgsConstructor
@JsonTypeInfo(
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        use = JsonTypeInfo.Id.NAME,
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = BusDTO.class, name = "BUS"),
        @JsonSubTypes.Type(value = CarDTO.class, name = "CAR")
})
public class VehicleDTO {
    private Long id;
    private VehicleType type;
    private String brand;
    private String model;
}
