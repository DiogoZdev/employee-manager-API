package com.diocode.employeemanager.repository;

import com.diocode.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    /**
     * Method to delete employee by ID
     * @param id Employee's ID to be deleted
     */
    void deleteEmployeeById(Long id);

    /**
     * Method to find employee by ID
     * @param id Employee's ID to be found
     * @return Employee found
     */
    Optional<Employee> getEmployeeById(Long id);

}
