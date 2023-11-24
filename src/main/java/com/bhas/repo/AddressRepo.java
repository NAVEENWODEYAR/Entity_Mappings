package com.bhas.repo;

import com.bhas.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer>
{

}
