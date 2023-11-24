package com.bhas.repo;

import com.bhas.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Address,Integer>
{

}
