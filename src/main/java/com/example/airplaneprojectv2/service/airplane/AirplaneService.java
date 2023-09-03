package com.example.airplaneprojectv2.service.airplane;

import com.example.airplaneprojectv2.builder.airplane.AirplaneBuilder;
import com.example.airplaneprojectv2.dto.AirplaneCreateDto;
import com.example.airplaneprojectv2.entity.Airplane;
import com.example.airplaneprojectv2.exceptions.AirplaneNotFound;
import com.example.airplaneprojectv2.repository.AirplaneRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirplaneService implements IAirplaneService{
    private AirplaneRepository airplaneRepository;
    private AirplaneBuilder airplaneBuilder;

    public AirplaneService(AirplaneRepository airplaneRepository, AirplaneBuilder airplaneBuilder) {
        this.airplaneRepository = airplaneRepository;
        this.airplaneBuilder = airplaneBuilder;
    }

    @Override
    public Airplane createAirplane(AirplaneCreateDto airplaneCreateDto) {
        Airplane airplane = airplaneBuilder.getAirplaneByAirplaneCreateDto(airplaneCreateDto);
        return airplaneRepository.save(airplane);
    }

    @Override
    public List<Airplane> getAirplanes() {
        return airplaneRepository.findAll();
    }

    @Override
    public Airplane getById(int id) {
        return airplaneRepository.findById(id).orElseThrow(()->new AirplaneNotFound(id));
    }
}
