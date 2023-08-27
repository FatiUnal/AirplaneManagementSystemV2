package com.example.airplaneprojectv2.repository;

import com.example.airplaneprojectv2.entity.Disabled;
import com.example.airplaneprojectv2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisabledRepository extends JpaRepository<Disabled,Integer> {
}
