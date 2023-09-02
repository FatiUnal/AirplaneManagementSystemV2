package com.example.airplaneprojectv2.service;

import com.example.airplaneprojectv2.dto.AdultDto;
import com.example.airplaneprojectv2.entity.Adult;

public interface IAdultService {
    Adult getAdminByEmail(String email);

    Adult createAdult(AdultDto adultDto);
}
