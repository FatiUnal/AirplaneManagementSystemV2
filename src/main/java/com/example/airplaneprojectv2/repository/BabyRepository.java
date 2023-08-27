package com.example.airplaneprojectv2.repository;

import com.example.airplaneprojectv2.entity.Baby;
import com.example.airplaneprojectv2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BabyRepository extends JpaRepository<Baby,Integer> {
}
