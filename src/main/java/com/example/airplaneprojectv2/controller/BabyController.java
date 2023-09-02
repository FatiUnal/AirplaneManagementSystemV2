package com.example.airplaneprojectv2.controller;

import com.example.airplaneprojectv2.dto.BabyDto;
import com.example.airplaneprojectv2.entity.Baby;
import com.example.airplaneprojectv2.service.IBabyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/baby")
public class BabyController {

    private IBabyService iBabyService;

    public BabyController(IBabyService iBabyService) {
        this.iBabyService = iBabyService;
    }

    @PostMapping
    public ResponseEntity<Baby> createBaby(@RequestBody BabyDto babyDto){
        return new ResponseEntity<>(iBabyService.createBaby(babyDto), HttpStatus.CREATED);
    }
}
