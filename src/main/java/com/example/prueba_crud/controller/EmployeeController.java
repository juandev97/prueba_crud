package com.example.prueba_crud.controller;

import com.example.prueba_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class EmployeeController {
    // desplegar lista de empleados
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String vistaHomePage(Model model){
        model.addAttribute("listEmployees", employeeService.getAllEmployees());
        return "index";
    }
}
