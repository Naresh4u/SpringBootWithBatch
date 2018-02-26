package com.springbatch.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="employee")
public class Employee {

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
    private String lastName;
	
	@Column(name = "designation")
    private String designation;
	
	@Id
	@Column(name = "email")
    private String email;
	
	@Column(name = "salary")
    private Integer salary;
    
    public Employee() {
	}

	public Employee(String firstName, String lastName, String email, Integer salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", age=" + salary + "]";
	}
}
