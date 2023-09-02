package com.example.airplaneprojectv2.service;

import com.example.airplaneprojectv2.dto.ForeignerDto;
import com.example.airplaneprojectv2.entity.Foreigner;

public interface IForeignerService {
    Foreigner getAdminByEmail(String email);

    Foreigner createForeigner(ForeignerDto foreignerDto);
}
