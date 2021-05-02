package com.example.prueba_crud.service;

import com.example.prueba_crud.model.employee;
import com.example.prueba_crud.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public List<employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public void saveEmployee(employee employee) {
        this.employeeRepo.save(employee);
    }

    @Override
    public employee getEmployeeById(long id) {
        Optional<employee> optional = employeeRepo.findById(id);
        employee employee = null;
        if(optional.isPresent()){
            employee = optional.get();
        }else{
            throw new RuntimeException(" Employee not found for id :: "+id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepo.deleteById(id);
    }

}
