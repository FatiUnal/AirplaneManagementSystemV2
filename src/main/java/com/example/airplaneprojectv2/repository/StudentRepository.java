package com.example.airplaneprojectv2.repository;

import com.example.airplaneprojectv2.entity.Admin;
import com.example.airplaneprojectv2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query("select a from Student a where a.email=?1")
    Student getByEmail(String mail);
}
