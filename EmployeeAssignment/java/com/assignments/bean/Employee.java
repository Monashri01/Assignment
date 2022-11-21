package com.assignments.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {

	@Id
	@NotNull(message="Id is Required")
	@Min(value=1, message="No Zero or Negative value")
	private int id;
	@NotBlank(message="Name should not be Empty")
	private String name;
	@NotBlank(message="Department shoud not be Empty")
	private String dept;
	@NotBlank(message = "Designation should not be Empty")
	private String desg;
	@NotNull(message="Salary shoud not be Zero or Negative")
	@Min(value=0, message ="No Negative values")
	private int salary;

	public Employee() {
	}

	public Employee(int id, String name, String dept, String desg, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.desg = desg;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
   
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", desg=" + desg + ", salary=" + salary
				+ "]";
	}
}
