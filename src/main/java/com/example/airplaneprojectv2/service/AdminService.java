package com.example.airplaneprojectv2.service;


import com.example.airplaneprojectv2.builder.AdminBuilder;
import com.example.airplaneprojectv2.dto.AdminDto;
import com.example.airplaneprojectv2.entity.Admin;
import com.example.airplaneprojectv2.repository.AdminRepository;
import org.springframework.stereotype.Service;

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
}
