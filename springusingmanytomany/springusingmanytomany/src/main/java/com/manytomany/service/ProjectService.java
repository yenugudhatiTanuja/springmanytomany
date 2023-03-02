package com.manytomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manytomany.entity.Projects;
import com.manytomany.repository.ProjectsRepository;

@Service
public class ProjectService 
{
	@Autowired
	private ProjectsRepository projectRepository;
	
	//List of all projects
	public List<Projects> projectList()
	{
		return this.projectRepository.findAll();
	}
	
	//Add Projects
	public Projects addProject(Projects p)
	{
		return projectRepository.save(p);
	}
	
	//Search
	public Projects searchById(int projectId)
	{
		return projectRepository.findById(projectId).get();
	}
}
