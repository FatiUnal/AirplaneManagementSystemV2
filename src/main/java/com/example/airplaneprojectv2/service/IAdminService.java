package com.example.airplaneprojectv2.service;

import com.example.airplaneprojectv2.dto.AdminDto;
import com.example.airplaneprojectv2.entity.Admin;

public interface IAdminService {
    Admin createAdmin(AdminDto adminDto);

    Admin getAdminByEmail(String mail);
}
