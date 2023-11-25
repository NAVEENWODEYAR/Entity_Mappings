package com.bhas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name="Add")
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addId;
    private String addType;
    private int homeNo;
    private String locality;
    private String city;
    private String state;

}
