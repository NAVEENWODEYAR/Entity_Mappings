package com.bhas.service;

import com.bhas.entity.Employee;
import com.bhas.entity.Address;
import com.bhas.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService
{
    // DI,
    @Autowired
    private EmployeeRepo employeeRepo;

    // CRUD
    //1. INSERT INTO TABLE-NAME VALUES();
    public Employee insertEmployee(Employee employee)
    {
        return employeeRepo.save(employee);
    }

    //1. a List<Employees>
    public List<Employee> insertEmployees(List<Employee> employees)
    {
        return employeeRepo.saveAll(employees);
    }

    //2. SELECT * FROM TABLE-NAME;
    public List<Employee> getEmployees()
    {
        return employeeRepo.findAll();
    }
}
