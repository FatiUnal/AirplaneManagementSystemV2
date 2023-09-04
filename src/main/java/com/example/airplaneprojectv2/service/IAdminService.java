package com.example.airplaneprojectv2.service;

import com.example.airplaneprojectv2.dto.AdminDto;
import com.example.airplaneprojectv2.dto.LoginDto;
import com.example.airplaneprojectv2.entity.Admin;

import java.util.List;

public interface IAdminService {
    Admin createAdmin(AdminDto adminDto);

    Admin getAdminByEmail(String mail);
    Admin getByEmailAndLogin(LoginDto loginDto);

    List<Admin> getList();
}
