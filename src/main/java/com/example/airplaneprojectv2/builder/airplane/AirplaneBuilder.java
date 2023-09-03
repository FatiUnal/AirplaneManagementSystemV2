package com.example.airplaneprojectv2.builder.airplane;

import com.example.airplaneprojectv2.dto.AirplaneCreateDto;
import com.example.airplaneprojectv2.entity.Airplane;
import org.springframework.stereotype.Component;

@Component
public class AirplaneBuilder {
    public Airplane getAirplaneByAirplaneCreateDto(AirplaneCreateDto airplaneCreateDto) {
        Airplane airplane = new Airplane(airplaneCreateDto.getBrand(), airplaneCreateDto.getModel(), airplaneCreateDto.getBusiness(),
                                        airplaneCreateDto.getEconomy());
        return airplane;
    }
}
