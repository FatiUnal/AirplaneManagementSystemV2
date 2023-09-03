package com.example.airplaneprojectv2.service.airplane;

import com.example.airplaneprojectv2.builder.airplane.FlightBuilder;
import com.example.airplaneprojectv2.dto.FlightAdminResponseDto;
import com.example.airplaneprojectv2.dto.FlightCreateDto;
import com.example.airplaneprojectv2.entity.Airplane;
import com.example.airplaneprojectv2.entity.Expedition;
import com.example.airplaneprojectv2.entity.Flight;
import com.example.airplaneprojectv2.repository.FlightRepository;
import org.springframework.stereotype.Service;

@Service
public class FlightService implements IFlightService{
    private IExpeditionService iExpeditionService;
    private IAirplaneService iAirplaneService;
    private FlightRepository flightRepository;
    private FlightBuilder flightBuilder;

    public FlightService(IExpeditionService iExpeditionService, IAirplaneService iAirplaneService, FlightRepository flightRepository, FlightBuilder flightBuilder) {
        this.iExpeditionService = iExpeditionService;
        this.iAirplaneService = iAirplaneService;
        this.flightRepository = flightRepository;
        this.flightBuilder = flightBuilder;
    }

    @Override
    public FlightAdminResponseDto createFlight(FlightCreateDto flightCreateDto) {
        Expedition expedition = iExpeditionService.getById(flightCreateDto.getExpedition_id());
        Airplane airplane = iAirplaneService.getById(flightCreateDto.getAirplane_id());
        Flight flight = flightBuilder.createNewFlightByFlightCreateDto(flightCreateDto,expedition,airplane);
        Flight saveFlight = flightRepository.save(flight);
        FlightAdminResponseDto flightAdminResponseDto = flightBuilder.getAdminNewFlight(saveFlight);

        return flightAdminResponseDto;
    }
}
