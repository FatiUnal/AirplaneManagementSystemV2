package com.example.airplaneprojectv2.repository;

import com.example.airplaneprojectv2.entity.Admin;
import com.example.airplaneprojectv2.entity.Foreigner;
import com.example.airplaneprojectv2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ForeignerRepository extends JpaRepository<Foreigner,Integer> {
    @Query("select a from Foreigner a where a.email=?1")
    Foreigner getByEmail(String mail);
}
