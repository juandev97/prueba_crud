package com.example.prueba_crud.service;

import com.example.prueba_crud.model.employee;

import java.util.List;

public interface EmployeeService {

    List<employee> getAllEmployees();
    void saveEmployee(employee employee);
    employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
