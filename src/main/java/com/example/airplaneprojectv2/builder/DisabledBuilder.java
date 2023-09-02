package com.example.airplaneprojectv2.builder;

import com.example.airplaneprojectv2.dto.DisabledDto;
import com.example.airplaneprojectv2.entity.Disabled;
import org.springframework.stereotype.Component;

@Component
public class DisabledBuilder {

    public Disabled getDisabledByDisabledDto(DisabledDto disabledDto){
        Disabled disabled = new Disabled(disabledDto.getFirstName(), disabledDto.getLastName(), disabledDto.getEmail(), disabledDto.getPassword());
        return disabled;
    }
}
