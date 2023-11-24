package com.bhas.controller;

import com.bhas.entity.Address;
import com.bhas.entity.Employee;
import com.bhas.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{
    // DI,
    @Autowired
    private EmployeeService employeeService;

    // 1. postRequest for sending the data,
    @PostMapping("/insertEmployees")
    public ResponseEntity<String> insertEmployees(@RequestBody List<Employee> employees)
    {
        employeeService.insertEmployees(employees);
        return  ResponseEntity.ok("Saved");
    }
}
