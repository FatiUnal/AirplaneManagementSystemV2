package com.example.airplaneprojectv2.controller;

import com.example.airplaneprojectv2.dto.DisabledDto;
import com.example.airplaneprojectv2.entity.Disabled;
import com.example.airplaneprojectv2.service.IDisabledService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disabled")
public class DisabledController {
    private IDisabledService iDisabledService;

    public DisabledController(IDisabledService iDisabledService) {
        this.iDisabledService = iDisabledService;
    }

    @PostMapping
    public ResponseEntity<Disabled> createDisabled(@RequestBody DisabledDto disabledDto){
        return new ResponseEntity<>(iDisabledService.createDisabled(disabledDto), HttpStatus.CREATED);
    }
}
