package com.example.airplaneprojectv2.service;


import com.example.airplaneprojectv2.dto.LoginDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    private IAdminService iAdminService;

    public LoginService(IAdminService iAdminService) {
        this.iAdminService = iAdminService;
    }


    public <T> T login(LoginDto loginDto) {
        T user = null;
        switch (loginDto.getRole()){
            case "1":
                user = (T)iAdminService.getAdminByEmail(loginDto.getEmail());
                break;
        }
        System.out.println("service : "+user);
        return  user;
    }
}
