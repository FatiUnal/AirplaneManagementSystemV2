package com.example.airplaneprojectv2.service.airplane;

import com.example.airplaneprojectv2.dto.FlightAdminResponseDto;
import com.example.airplaneprojectv2.dto.FlightCreateDto;
import com.example.airplaneprojectv2.entity.Flight;

import java.util.List;

public interface IFlightService {
    FlightAdminResponseDto createFlight(FlightCreateDto flightCreateDto);

    List<FlightAdminResponseDto> getFlights();
}
