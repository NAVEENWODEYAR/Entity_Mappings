package com.bhas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MapeamentosApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(MapeamentosApplication.class, args);
		System.out.println("Entity mappings in dataJPA,");
	}

}
