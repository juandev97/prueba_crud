package com.example.prueba_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prueba_crud.model.employee;

@Repository
public interface EmployeeRepo extends JpaRepository<employee, Long> {
}

