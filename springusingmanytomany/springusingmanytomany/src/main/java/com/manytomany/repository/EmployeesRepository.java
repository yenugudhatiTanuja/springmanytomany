package com.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manytomany.entity.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Integer>
{
	
}
