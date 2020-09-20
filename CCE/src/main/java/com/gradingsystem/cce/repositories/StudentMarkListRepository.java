package com.gradingsystem.cce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gradingsystem.cce.model.StudentMarkList;

public interface StudentMarkListRepository extends JpaRepository<StudentMarkList, String> {

}
