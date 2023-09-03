package com.example.airplaneprojectv2.controller.login;

import com.example.airplaneprojectv2.dto.LoginDto;
import com.example.airplaneprojectv2.entity.*;
import com.example.airplaneprojectv2.exceptions.UserNotFoundException;
import com.example.airplaneprojectv2.service.LoginService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/login")
public class LoginController {

    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public <T>ResponseEntity<T> login(@RequestBody LoginDto loginDto){
        System.out.println("email: "+loginDto.getEmail());
        System.out.println("pass: "+loginDto.getPassword());
        System.out.println("role: "+loginDto.getRole());
        T user = loginService.login(loginDto);
        System.out.println(user);
        System.out.println("----------------------------");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Admin>> getList(){
        List<Admin> newlist = loginService.getList();
        return new ResponseEntity<>(newlist,HttpStatus.OK);
    }


}
