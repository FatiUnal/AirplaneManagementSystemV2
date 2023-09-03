package com.example.airplaneprojectv2.service.airplane;

import com.example.airplaneprojectv2.dto.AirplaneCreateDto;
import com.example.airplaneprojectv2.entity.Airplane;

import java.util.List;

public interface IAirplaneService {
    Airplane createAirplane(AirplaneCreateDto airplaneCreateDto);

    List<Airplane> getAirplanes();

    Airplane getById(int id);
}
