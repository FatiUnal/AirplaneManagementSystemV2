package com.example.airplaneprojectv2.service;

import com.example.airplaneprojectv2.dto.BabyDto;
import com.example.airplaneprojectv2.entity.Baby;

public interface IBabyService {

    Baby getAdminByEmail(String email);

    Baby createBaby(BabyDto babyDto);
}
