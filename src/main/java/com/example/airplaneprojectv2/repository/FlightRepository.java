package com.example.airplaneprojectv2.repository;

import com.example.airplaneprojectv2.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Integer> {
}
