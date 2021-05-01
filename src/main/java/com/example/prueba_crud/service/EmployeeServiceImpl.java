package com.example.prueba_crud.service;

import com.example.prueba_crud.model.employee;
import com.example.prueba_crud.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public List<employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
}
