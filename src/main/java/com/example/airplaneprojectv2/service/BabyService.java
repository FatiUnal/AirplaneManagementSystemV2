package com.example.airplaneprojectv2.service;


import com.example.airplaneprojectv2.builder.BabyBuilder;
import com.example.airplaneprojectv2.dto.BabyDto;
import com.example.airplaneprojectv2.entity.Baby;
import com.example.airplaneprojectv2.repository.BabyRepository;
import org.springframework.stereotype.Service;

@Service
public class BabyService implements IBabyService {
    private BabyRepository babyRepository;
    private BabyBuilder babyBuilder;

    public BabyService(BabyRepository babyRepository, BabyBuilder babyBuilder) {
        this.babyRepository = babyRepository;
        this.babyBuilder = babyBuilder;
    }

    @Override
    public Baby getAdminByEmail(String email) {
        return babyRepository.getByEmail(email);
    }

    @Override
    public Baby createBaby(BabyDto babyDto) {
        Baby baby = babyBuilder.getBabyByBabayDto(babyDto);
        return babyRepository.save(baby);
    }
}
