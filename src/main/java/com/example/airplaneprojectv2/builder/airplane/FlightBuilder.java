package com.example.airplaneprojectv2.builder.airplane;

import com.example.airplaneprojectv2.config.Times;
import com.example.airplaneprojectv2.dto.FlightAdminResponseDto;
import com.example.airplaneprojectv2.dto.FlightCreateDto;
import com.example.airplaneprojectv2.entity.Airplane;
import com.example.airplaneprojectv2.entity.Expedition;
import com.example.airplaneprojectv2.entity.Flight;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class FlightBuilder {

    public Flight createNewFlightByFlightCreateDto(FlightCreateDto flightCreateDto, Expedition expedition, Airplane airplane){
        LocalDateTime localDateTime = Times.getLocalDateTime(flightCreateDto.getLocalDateTime());
        return new Flight(expedition,airplane,localDateTime,airplane.getEconomy(), airplane.getBusiness(),flightCreateDto.isActive(),flightCreateDto.getEconomyPrice(), flightCreateDto.getBusinessPrice(),flightCreateDto.getBusinessPrice(),flightCreateDto.getEconomyPrice());
    }

    public FlightAdminResponseDto getAdminNewFlight(Flight flight){
        return new FlightAdminResponseDto(flight.getFlightId(), flight.getExpedition().getExpeditionId(),flight.getExpedition().getDepartureAirport(),flight.getExpedition().getLandingAirport(),flight.getExpedition().getExpeditionTime(),
                flight.getAirplane().getAirplaneId(),flight.getAirplane().getBrand(),flight.getAirplane().getModel(),flight.getAirplane().getBusiness(),flight.getAirplane().getEconomy(),
                flight.getLocalDateTime(),flight.isActive(),flight.getEconomyPrice(), flight.getBusinessPrice());
    }
}
