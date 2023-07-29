package com.example.Employeemanager.service;

import com.example.Employeemanager.exception.UserNotFoundException;
import com.example.Employeemanager.model.Employee;
import com.example.Employeemanager.repo.EmployeeRepo;
;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    //@Autowired
    //private JdbcTemplate jdbcTemplate;
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    public void saveEmployee(Employee employee){
            employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id) throws UserNotFoundException {
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User with  " + id + " was not found"));
    }

    public void updateEmployee(Employee employee){
        employeeRepo.updateEmployeeInfo(employee.getCountry(), employee.getEmail(), employee.getJobTitle(),
                employee.getName(), employee.getId());

    }
    public void deleteEmployee(Long id){
        employeeRepo.deleteById(id);
    }
}
