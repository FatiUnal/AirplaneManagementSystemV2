package com.example.airplaneprojectv2.repository;

import com.example.airplaneprojectv2.entity.Adult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdultRepository extends JpaRepository<Adult,Integer> {
}
