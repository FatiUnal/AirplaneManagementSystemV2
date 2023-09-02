package com.example.airplaneprojectv2.service;

import com.example.airplaneprojectv2.builder.StudentBuilder;
import com.example.airplaneprojectv2.dto.StudentDto;
import com.example.airplaneprojectv2.entity.Student;
import com.example.airplaneprojectv2.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService{

    private StudentRepository studentRepository;
    private StudentBuilder studentBuilder;

    public StudentService(StudentRepository studentRepository, StudentBuilder studentBuilder) {
        this.studentRepository = studentRepository;
        this.studentBuilder = studentBuilder;
    }

    @Override
    public Student getAdminByEmail(String email) {
        return studentRepository.getByEmail(email);
    }

    @Override
    public Student createStudent(StudentDto studentDto) {
        Student student = studentBuilder.getStudentByStudentDto(studentDto);
        return studentRepository.save(student);
    }
}
