package com.example.Employeemanager.repo;

import com.example.Employeemanager.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    Optional<Employee> findEmployeeById(Long id);

    @Modifying
    @Transactional
    @Query(
            value = "update employee set country = ?, email = ?, job_title = ?, name = ? where id = ?",
            nativeQuery = true
    )
    void updateEmployeeInfo(String country, String email, String jobTitle, String name, Long id);

}
