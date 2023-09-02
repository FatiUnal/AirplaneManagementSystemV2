package com.example.airplaneprojectv2.builder;

import com.example.airplaneprojectv2.dto.StudentDto;
import com.example.airplaneprojectv2.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentBuilder {

    public Student getStudentByStudentDto(StudentDto studentDto){
        Student student = new Student(studentDto.getFirstName(),studentDto.getLastName(),studentDto.getEmail(),studentDto.getPassword());
        return student;
    }

}
