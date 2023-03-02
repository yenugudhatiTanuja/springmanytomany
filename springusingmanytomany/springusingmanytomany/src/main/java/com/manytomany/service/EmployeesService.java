package com.manytomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manytomany.entity.Employees;
import com.manytomany.entity.Projects;
import com.manytomany.repository.EmployeesRepository;


@Service
public class EmployeesService 
{
	@Autowired
	private EmployeesRepository EmpRepository;
	
	//List of Employees
	public List<Employees> EmployeesList()
	{
		return this.EmpRepository.findAll();
	}
	
	//Add EmployeeDeatils
	public Employees addEmployee(Employees emp)
	{
		return EmpRepository.save(emp);
	}
	
	//Search
	public Employees searchById(int empId)
	{
		return EmpRepository.findById(empId).get();
	}
}
