package com.example.airplaneprojectv2.repository;

import com.example.airplaneprojectv2.entity.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneRepository extends JpaRepository<Airplane,Integer> {
}
