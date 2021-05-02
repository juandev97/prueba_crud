package com.example.prueba_crud.controller;

import com.example.prueba_crud.model.employee;
import com.example.prueba_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.PresentationDirection;

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

    @GetMapping("/agregarEmpleado")
    public String agregarEmpleado(Model model){
        employee employee = new employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/Actualizar/{id}")
    public String Actualizar(@PathVariable (value = "id") long id, Model model){
        //get employee from service
        employee employee  = employeeService.getEmployeeById(id);

        model.addAttribute("employee", employee);
        return "update_employee";
    }

    @GetMapping("/Borrar/{id}")
    public String Borrar(@PathVariable (value = "id") long id){
        this.employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }
}
