package com.example.airplaneprojectv2.builder;

import com.example.airplaneprojectv2.dto.AdminDto;
import com.example.airplaneprojectv2.entity.Admin;
import com.example.airplaneprojectv2.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminBuilder {
    public Admin getAdminByAdminDto(AdminDto adminDto){

        Admin admin = new Admin(
                adminDto.getFirstName(),
                adminDto.getLastName(),
                adminDto.getEmail(),
                adminDto.getPassword());

        return admin;
    }
}
