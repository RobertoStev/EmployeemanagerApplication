package com.example.Employeemanager.controller;

import com.example.Employeemanager.exception.UserNotFoundException;
import com.example.Employeemanager.model.Employee;
import com.example.Employeemanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Controller
public class EmployeeResource {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = {"", "/", "/showEmployee"})
    public String showEmployeeList(Model model) {

        List<Employee> employeeList = employeeService.getAllEmployees();
        model.addAttribute("employees", employeeList);

        return "employee-list";
    }

    @GetMapping("/addEmployee" )
    public String addEmployeeForm(Model model) {

        model.addAttribute("employee", new Employee());
        return "add-employee";
    }

    @PostMapping("/saveEmployee" )
    public String saveNewEmployee(Employee employee) {

        if(Objects.isNull(employee.getId()))
            employeeService.saveEmployee(employee);
        else
            employeeService.updateEmployee(employee);

        return "redirect:/showEmployee";
    }

    @GetMapping("/updateEmployee" )
    public String updateEmployee(@RequestParam("employeeId") Long id, Model model) throws UserNotFoundException {

        Employee employee = employeeService.findEmployeeById(id);

        model.addAttribute("employee", employee);
        return "add-employee";

    }

    @GetMapping("/deleteEmployee" )
    public String deleteSelectedEmployee(@RequestParam("employeeId") Long id){

        employeeService.deleteEmployee(id);
        return "redirect:/showEmployee";

    }
}
