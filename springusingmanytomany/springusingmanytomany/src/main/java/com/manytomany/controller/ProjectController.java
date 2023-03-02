package com.manytomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manytomany.entity.Projects;
import com.manytomany.service.ProjectService;


@RestController
public class ProjectController 
{
	@Autowired
	private ProjectService projectService;
	
	//Get all projects
	@GetMapping("/ProjectDetails")
	public List<Projects> getProject()
	{
		return this.projectService.projectList();
	}
	
	//Add project
	@PostMapping("/addProject")
	public Projects addProject(@RequestBody Projects p)
	{
		return this.projectService.addProject(p);
	}
}
