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
    public <T>ResponseEntity<T> login(HttpServletResponse response,@RequestBody LoginDto loginDto){
        System.out.println(loginDto.getEmail());
        System.out.println(loginDto.getPassword());
        System.out.println(loginDto.getRole());
        T user = loginService.login(loginDto);
        Cookie cookie = new Cookie("email", "mail");
        Cookie cookie2 = new Cookie("role", "rol");
        response.addCookie(cookie);
        response.addCookie(cookie2);

        System.out.println(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
