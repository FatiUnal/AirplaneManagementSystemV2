package com.example.airplaneprojectv2.controller;

import com.example.airplaneprojectv2.dto.AdminDto;
import com.example.airplaneprojectv2.entity.Admin;
import com.example.airplaneprojectv2.service.AdminService;

import com.example.airplaneprojectv2.service.IAdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin")
public class AdminController {
    private IAdminService iAdminService;

    public AdminController(IAdminService iAdminService) {
        this.iAdminService = iAdminService;
    }

    @PostMapping
    public ResponseEntity<Admin> createAdmin(@RequestBody AdminDto adminDto){
        Admin admin = iAdminService.createAdmin(adminDto);
        return new ResponseEntity<>(admin,HttpStatus.CREATED);
    }

    @GetMapping("/{mail}")
    public ResponseEntity<Admin> getAdmin(@PathVariable String mail){
        Admin admin = iAdminService.getAdminByEmail(mail);
        return new ResponseEntity<>(admin,HttpStatus.OK);
    }

}
