package com.example.airplaneprojectv2.service;

import com.example.airplaneprojectv2.dto.DisabledDto;
import com.example.airplaneprojectv2.entity.Disabled;

public interface IDisabledService {
    Disabled getAdminByEmail(String email);

    Disabled createDisabled(DisabledDto disabledDto);
}
