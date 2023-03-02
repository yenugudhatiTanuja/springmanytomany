package com.manytomany.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manytomany.entity.Employees;
import com.manytomany.entity.Projects;
import com.manytomany.service.EmployeesService;
import com.manytomany.service.ProjectService;


@RestController
public class EmployeesController 
{
	@Autowired
	private EmployeesService EmpService;
	
	@Autowired
	private ProjectService projectService;
	
	//Get All employee
	@GetMapping("/Employee")
	public List<Employees> getEmployee()
	{
		return this.EmpService.EmployeesList();
	}
	
	//Add Employee
	@PostMapping("/addEmployee/{projectId}")
	public Employees addEmployee(@RequestBody Employees emp,@PathVariable int projectId)
	{
		Projects p = this.projectService.searchById(projectId);
		emp.setProjects((Set) p);
		return this.EmpService.addEmployee(emp);
	}
}
