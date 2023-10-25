package com.projectems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectems.entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    // Define custom queries or methods if needed
}
