package com.example.airplaneprojectv2.service;

import com.example.airplaneprojectv2.dto.StudentDto;
import com.example.airplaneprojectv2.entity.Student;

public interface IStudentService {
    Student getAdminByEmail(String email);

    Student createStudent(StudentDto studentDto);
}
