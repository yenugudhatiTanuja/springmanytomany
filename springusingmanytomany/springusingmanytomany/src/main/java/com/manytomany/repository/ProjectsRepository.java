package com.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manytomany.entity.Projects;

public interface ProjectsRepository extends JpaRepository<Projects,Integer>
{
	
}
