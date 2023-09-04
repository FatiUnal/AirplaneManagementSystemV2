package com.example.airplaneprojectv2.controller.airplane;

import com.example.airplaneprojectv2.dto.FlightAdminResponseDto;
import com.example.airplaneprojectv2.dto.FlightCreateDto;
import com.example.airplaneprojectv2.entity.Flight;
import com.example.airplaneprojectv2.service.airplane.IFlightService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/flight")
public class FlightController {
    private IFlightService iFlightService;

    public FlightController(IFlightService iFlightService) {
        this.iFlightService = iFlightService;
    }

    @PostMapping
    public ResponseEntity<FlightAdminResponseDto> createFlight(@RequestBody FlightCreateDto flightCreateDto){
        return new ResponseEntity<>(iFlightService.createFlight(flightCreateDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<FlightAdminResponseDto>> getFlight(){
        return new ResponseEntity<>(iFlightService.getFlights(),HttpStatus.OK);
    }
}
