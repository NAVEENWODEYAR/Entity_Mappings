package com.bhas.service;

import com.bhas.entity.Employee;
import com.bhas.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
