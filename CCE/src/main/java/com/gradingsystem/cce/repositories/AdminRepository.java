package com.gradingsystem.cce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gradingsystem.cce.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {

}
