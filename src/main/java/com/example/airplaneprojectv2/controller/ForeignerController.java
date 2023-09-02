package com.example.airplaneprojectv2.controller;

import com.example.airplaneprojectv2.dto.ForeignerDto;
import com.example.airplaneprojectv2.entity.Foreigner;
import com.example.airplaneprojectv2.service.IForeignerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foreigner")
public class ForeignerController {
    private IForeignerService iForeignerService;

    public ForeignerController(IForeignerService iForeignerService) {
        this.iForeignerService = iForeignerService;
    }

    @PostMapping
    public ResponseEntity<Foreigner> createForeigner(@RequestBody ForeignerDto foreignerDto){
        return new ResponseEntity<>(iForeignerService.createForeigner(foreignerDto), HttpStatus.CREATED);
    }
}
