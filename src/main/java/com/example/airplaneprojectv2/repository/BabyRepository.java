package com.example.airplaneprojectv2.repository;

import com.example.airplaneprojectv2.entity.Admin;
import com.example.airplaneprojectv2.entity.Baby;
import com.example.airplaneprojectv2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BabyRepository extends JpaRepository<Baby,Integer> {
    @Query("select a from Baby a where a.email=?1")
    Baby getByEmail(String mail);
}
