package com.bhas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Emp")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
    private String empName;
    private String empMail;
    private double empSalary;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_addId")
//    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "addId",referencedColumnName = "empId")
    @JoinColumn(name = "fk_addId")
    private List<Address> addresses = new ArrayList<>();
}
