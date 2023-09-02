package com.example.airplaneprojectv2.service;

import com.example.airplaneprojectv2.builder.AdultBuilder;
import com.example.airplaneprojectv2.dto.AdultDto;
import com.example.airplaneprojectv2.entity.Adult;
import com.example.airplaneprojectv2.repository.AdultRepository;
import org.springframework.stereotype.Service;

@Service
public class AdultService implements IAdultService{
    private AdultRepository adultRepository;
    private AdultBuilder adultBuilder;

    public AdultService(AdultRepository adultRepository, AdultBuilder adultBuilder) {
        this.adultRepository = adultRepository;
        this.adultBuilder = adultBuilder;
    }

    @Override
    public Adult getAdminByEmail(String email) {
        return adultRepository.getByEmail(email);
    }

    @Override
    public Adult createAdult(AdultDto adultDto) {
        Adult adult = adultBuilder.getAdultByAdultDto(adultDto);
        return adultRepository.save(adult);
    }
}
