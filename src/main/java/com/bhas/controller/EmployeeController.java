package com.bhas.controller;

import com.bhas.dto.ResponseDTO;
import com.bhas.entity.Address;
import com.bhas.entity.Employee;
import com.bhas.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{
    // DI,
    @Autowired
    private EmployeeService employeeService;

    // test endPoint,
    @GetMapping("/test")
    @ResponseStatus(code = HttpStatus.BANDWIDTH_LIMIT_EXCEEDED)
    public String greetMsg()
    {
        return "Welcome to "+EmployeeController.class+" application";
    }

    // 1. postRequest for sending the data,
    @PostMapping("/insertEmployees")
    public ResponseEntity<String> insertEmployees(@RequestBody List<Employee> employees)
    {
        employeeService.insertEmployees(employees);
        return  ResponseEntity.ok("Saved");
    }

    // 2. getRequest;
    @GetMapping("/getEmployees")
    public ResponseEntity<ResponseDTO> getEmployees()
    {
        return new ResponseEntity<>(new ResponseDTO("List<Employess>",employeeService.getEmployees()),HttpStatus.FOUND);
    }
}
