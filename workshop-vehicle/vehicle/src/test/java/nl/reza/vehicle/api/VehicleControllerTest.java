package nl.reza.vehicle.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import nl.reza.vehicle.api.dto.VehicleDTO;
import nl.reza.vehicle.domain.Vehicle;
import nl.reza.vehicle.domain.service.VehicleService;
import nl.reza.vehicle.enums.VehicleType;
import nl.reza.vehicle.mapper.VehicleMapperImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static nl.reza.vehicle.enums.VehicleType.CAR;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(VehicleController.class)
@Import(VehicleMapperImpl.class)
class VehicleControllerTest {

    @Autowired
    private VehicleController controller;

    @MockBean
    private VehicleService service;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    void getExistingVehicle() throws Exception{
        var vehicle = getDefaultVehicle();

        when(service.getVehicleById(1L)).thenReturn(vehicle);

        var jsonString = mockMvc.perform(get("/vehicles/1"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        var dto = mapper.readValue(jsonString, VehicleDTO.class);

        assertThat(dto.type()).isEqualTo(CAR);
        assertThat(dto.brand()).isEqualTo("Volkswagen");
        assertThat(dto.model()).isEqualTo("Golf");
        assertThat(dto.id()).isEqualTo(1L);
    }

    private static Vehicle getDefaultVehicle() {
        return getDefaultVehicle(1L);
    }

    private static Vehicle getDefaultVehicle(Long id) {
        var vehicle = new Vehicle();
        vehicle.setVehicleType(CAR);
        vehicle.setId(id);
        vehicle.setBrand("Volkswagen");
        vehicle.setModel("Golf");

        return vehicle;
    }

    @Test
    void postNewVehicle() throws Exception{
        when(service.saveVehicle(any(Vehicle.class))).thenReturn(getDefaultVehicle());

        var jsonString = mockMvc.perform(post("/vehicles")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(mapper.writeValueAsString(getDefaultDTO())))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        var dto = mapper.readValue(jsonString, VehicleDTO.class);

        assertThat(dto.type()).isEqualTo(CAR);
        assertThat(dto.brand()).isEqualTo("Volkswagen");
        assertThat(dto.model()).isEqualTo("Golf");
        assertThat(dto.id()).isEqualTo(1L);

    }

    @Test
    void deleteExistingVehicle() throws Exception {
        doNothing().when(service).deleteVehicleById(anyLong());

        mockMvc.perform(delete("/vehicles/1"))
                .andExpect(status().isOk());
    }

    private static VehicleDTO getDefaultDTO(){
        return new VehicleDTO(null, CAR, "Volkswagen", "Golf");
    }

    // TODO
    // post
    // get
    @Test
    void getAllVehicles() throws Exception {
        when(service.getAllVehicles())
                .thenReturn(List.of(getDefaultVehicle(1L), getDefaultVehicle(2L)));

        var jsonString = mockMvc.perform(get("/vehicles"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        var typeRef = new TypeReference<List<VehicleDTO>>(){};

        var dtoList = mapper.readValue(jsonString, typeRef);

        assertThat(dtoList).isNotNull().hasSize(2);

        assertThat(dtoList.get(0).id()).isNotNull().isEqualTo(1L);
        assertThat(dtoList.get(1).id()).isNotNull().isEqualTo(2L);
    }

    @Test
    void getAllVehiclesByType() throws Exception {
        when(service.getAllVehiclesOfType(CAR))
                .thenReturn(List.of(getDefaultVehicle(1L), getDefaultVehicle(2L)));

        var jsonString = mockMvc.perform(get("/vehicles?type=CAR"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        var typeRef = new TypeReference<List<VehicleDTO>>(){};

        var dtoList = mapper.readValue(jsonString, typeRef);

        assertThat(dtoList).isNotNull().hasSize(2);

        assertThat(dtoList.get(0).id()).isEqualTo(1L);
    }
}