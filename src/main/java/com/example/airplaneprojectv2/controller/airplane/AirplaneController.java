package com.example.airplaneprojectv2.controller.airplane;

import com.example.airplaneprojectv2.dto.AirplaneCreateDto;
import com.example.airplaneprojectv2.entity.Airplane;
import com.example.airplaneprojectv2.service.airplane.IAirplaneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airplane")
public class AirplaneController {
    private IAirplaneService iAirplaneService;

    public AirplaneController(IAirplaneService iAirplaneService) {
        this.iAirplaneService = iAirplaneService;
    }

    @PostMapping
    public ResponseEntity<Airplane> createAirplane(@RequestBody AirplaneCreateDto airplaneCreateDto){
        return new ResponseEntity<>(iAirplaneService.createAirplane(airplaneCreateDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Airplane>> getAirplanes(){
        return new ResponseEntity<>(iAirplaneService.getAirplanes(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Airplane> getById(@PathVariable int id){
        return new ResponseEntity<>(iAirplaneService.getById(id),HttpStatus.OK);
    }
}
