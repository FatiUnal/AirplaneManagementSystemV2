package com.example.airplaneprojectv2.builder;

import com.example.airplaneprojectv2.dto.ForeignerDto;
import com.example.airplaneprojectv2.entity.Foreigner;
import org.springframework.stereotype.Component;

@Component
public class ForeignerBuilder {

    public Foreigner getForeignerByForeignerDto(ForeignerDto foreignerDto){
        Foreigner foreigner=new Foreigner(foreignerDto.getFirstName(), foreignerDto.getLastName(),foreignerDto.getEmail(), foreignerDto.getPassword());
        return foreigner;
    }
}
