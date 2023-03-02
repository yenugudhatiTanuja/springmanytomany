package com.manytomany.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employees 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int e_id;
	private String e_name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ProjectId",referencedColumnName = "id")
	private Set Projects  = new HashSet<Projects>();

	
	/* @ManyToMany(fetch = FetchType.LAZY,
		      cascade = {
		          CascadeType.PERSIST,
		          CascadeType.MERGE
		      })
		  @JoinTable(name = "tutorial_tags",
		        joinColumns = { @JoinColumn(name = "tutorial_id") },
		        inverseJoinColumns = { @JoinColumn(name = "tag_id") })*/
	//private Set Projects  = new HashSet<Projects>();

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public Set getProjects() {
		return Projects;
	}

	public void setProjects(Set projects) {
		Projects = projects;
	}
	
}
