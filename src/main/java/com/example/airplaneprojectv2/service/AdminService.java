package com.example.airplaneprojectv2.service;


import com.example.airplaneprojectv2.builder.AdminBuilder;
import com.example.airplaneprojectv2.dto.AdminDto;
import com.example.airplaneprojectv2.dto.LoginDto;
import com.example.airplaneprojectv2.entity.Admin;
import com.example.airplaneprojectv2.exceptions.UserNotFoundException;
import com.example.airplaneprojectv2.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.net.UnknownServiceException;
import java.util.List;

@Service
public class AdminService implements IAdminService{

    private AdminRepository adminRepository;
    private AdminBuilder adminBuilder;

    public AdminService(AdminRepository adminRepository,AdminBuilder adminBuilder) {
        this.adminRepository = adminRepository;
        this.adminBuilder = adminBuilder;
    }

    @Override
    public Admin createAdmin(AdminDto adminDto) {
        Admin admin = adminBuilder.getAdminByAdminDto(adminDto);
        return adminRepository.save(admin);
    }

    @Override
    public Admin getAdminByEmail(String mail) {
        return adminRepository.getByEmail(mail);
    }

    @Override
    public Admin getByEmailAndLogin(LoginDto loginDto) {
        Admin admin = adminRepository.getByEmailAndLogin(loginDto.getEmail(),loginDto.getPassword());
        if (admin == null){
            throw new UserNotFoundException("AdminNotFound");
        }
        return admin;
    }

    @Override
    public List<Admin> getList() {
        return adminRepository.findAll();
    }
}
