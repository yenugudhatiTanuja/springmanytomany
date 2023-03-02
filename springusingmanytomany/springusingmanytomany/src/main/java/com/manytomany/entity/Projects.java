package com.manytomany.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Projects 
{
	@Id
	@GeneratedValue(generator = "Id_generator")
	@GenericGenerator(name = "Id_generator",strategy ="org.hibernate.id.enhanced.SequenceStyleGenerator",
						parameters = {@Parameter(name="sequence_name", value="user_sequence"),
								      @Parameter(name ="initial_value",value="100"),
									  @Parameter(name="increment_size",value = "1")})
	private int id;
	private String title;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "EmpId",referencedColumnName = "e_id")
	private Set Employees = new HashSet<>();

	 /*@ManyToMany(fetch = FetchType.LAZY,
     cascade = {
         CascadeType.PERSIST,
         CascadeType.MERGE
     })
 @JoinTable(name = "Employee_Projects",
       joinColumns = { @JoinColumn(name = "Employee_id") },
       inverseJoinColumns = { @JoinColumn(name = "Project_id") })*/
	//private Set Employees = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set getEmployees() {
		return Employees;
	}

	public void setEmployees(Set employees) {
		Employees = employees;
	}

}
