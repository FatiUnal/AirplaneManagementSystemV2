package com.example.airplaneprojectv2.builder;

import com.example.airplaneprojectv2.dto.AdultDto;
import com.example.airplaneprojectv2.entity.Adult;
import org.springframework.stereotype.Component;

@Component
public class AdultBuilder {

    public Adult getAdultByAdultDto(AdultDto adultDto){
        Adult adult = new Adult(adultDto.getFirstName(), adultDto.getLastName(), adultDto.getEmail(), adultDto.getPassword());
        return adult;
    }
}
