package com.example.airplaneprojectv2.service;


import com.example.airplaneprojectv2.dto.LoginDto;
import com.example.airplaneprojectv2.entity.Admin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {
    private IAdminService iAdminService;
    private IAdultService iAdultService;
    private IBabyService iBabyService;
    private IDisabledService iDisabledService;
    private IForeignerService iForeignerService;
    private IStudentService iStudentService;


    public LoginService(IAdminService iAdminService, IAdultService iAdultService, IBabyService iBabyService, IDisabledService iDisabledService, IForeignerService iForeignerService, IStudentService iStudentService) {
        this.iAdminService = iAdminService;
        this.iAdultService = iAdultService;
        this.iBabyService = iBabyService;
        this.iDisabledService = iDisabledService;
        this.iForeignerService = iForeignerService;
        this.iStudentService = iStudentService;
    }

    public <T> T login(LoginDto loginDto) {
        T user = null;
        switch (loginDto.getRole()){
            case "1":
                user = (T)iAdminService.getByEmailAndLogin(loginDto);
                break;
            case "2":
                user = (T)iAdultService.getAdminByEmail(loginDto.getEmail());
                break;
            case "3":
                user = (T)iBabyService.getAdminByEmail(loginDto.getEmail());
                break;
            case "4":
                user = (T)iDisabledService.getAdminByEmail(loginDto.getEmail());
                break;
            case "5":
                user = (T)iForeignerService.getAdminByEmail(loginDto.getEmail());
                break;
            case "6":
                user = (T)iStudentService.getAdminByEmail(loginDto.getEmail());
                break;

        }
        System.out.println("service : "+user);
        return  user;
    }

    public List<Admin> getList() {
        return iAdminService.getList();
    }
}
