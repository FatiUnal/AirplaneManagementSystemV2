package com.example.airplaneprojectv2.controller;

import com.example.airplaneprojectv2.dto.AdultDto;
import com.example.airplaneprojectv2.entity.Adult;
import com.example.airplaneprojectv2.service.IAdultService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/adult")
public class AdultController {

    private IAdultService iAdultService;

    public AdultController(IAdultService iAdultService) {
        this.iAdultService = iAdultService;
    }

    @PostMapping
    public ResponseEntity<Adult> createAdult(@RequestBody AdultDto adultDto){
        return new ResponseEntity<>(iAdultService.createAdult(adultDto), HttpStatus.CREATED);
    }
}
