package com.example.airplaneprojectv2.builder.airplane;

import com.example.airplaneprojectv2.dto.FlightCreateDto;
import com.example.airplaneprojectv2.entity.Airplane;
import com.example.airplaneprojectv2.entity.Expedition;
import com.example.airplaneprojectv2.entity.Flight;
import org.springframework.stereotype.Component;

@Component
public class FlightBuilder {

    public Flight createNewFlightByFlightCreateDto(FlightCreateDto flightCreateDto, Expedition expedition, Airplane airplane){
        return new Flight(expedition,airplane,flightCreateDto.getLocalDateTime(),flightCreateDto.getEmptyEconomySeat(), flightCreateDto.getEmptyBusinessSeat(),flightCreateDto.isActive(),flightCreateDto.getEconomyPrice(), flightCreateDto.getBusinessPrice(),flightCreateDto.getBusinessPrice(),flightCreateDto.getEconomyPrice());
    }
}
