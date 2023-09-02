package com.example.airplaneprojectv2.builder;

import com.example.airplaneprojectv2.dto.BabyDto;
import com.example.airplaneprojectv2.entity.Baby;
import org.springframework.stereotype.Component;

@Component
public class BabyBuilder {

    public Baby getBabyByBabayDto(BabyDto babyDto){
        Baby baby = new Baby(babyDto.getFirstName(), babyDto.getLastName(), babyDto.getEmail(), babyDto.getPassword());
        return baby;
    }

}
