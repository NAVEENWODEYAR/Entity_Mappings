package com.bhas.service;

import com.bhas.entity.Employee;
import com.bhas.entity.Address;
import com.bhas.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService
{
    // DI,
    @Autowired
    private EmployeeRepo employeeRepo;

    // CRUD
    //1. INSERT INTO TABLE-NAME VALUES();
    public ResponseEntity<String> insertEmployee(Employee employee)
    {
        employeeRepo.save(employee);
        return ResponseEntity.ok("Details saved,");
    }
}
