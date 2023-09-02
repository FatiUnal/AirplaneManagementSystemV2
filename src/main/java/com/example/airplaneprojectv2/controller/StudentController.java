package com.example.airplaneprojectv2.controller;

import com.example.airplaneprojectv2.dto.StudentDto;
import com.example.airplaneprojectv2.entity.Student;
import com.example.airplaneprojectv2.service.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    private IStudentService iStudentService;

    public StudentController(IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody StudentDto studentDto){
        return new ResponseEntity<>(iStudentService.createStudent(studentDto), HttpStatus.CREATED);
    }
}
