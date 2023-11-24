package com.bhas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Emp")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int empId;
    private String empName;
    private String empMail;
    private double empSalary;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "addId")
    private Address address;
}
