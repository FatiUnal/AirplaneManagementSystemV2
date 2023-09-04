package com.example.airplaneprojectv2.repository;

import com.example.airplaneprojectv2.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
    @Query("select a from Admin a where a.email=?1")
    Admin getByEmail(String mail);

    @Query("select a from Admin a where a.email=?1 and a.password=?2")
    Admin getByEmailAndLogin(String email, String password);
}
