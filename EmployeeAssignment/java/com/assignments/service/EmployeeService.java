package com.assignments.service;

import java.util.List;

import com.assignments.bean.Employee;

public interface EmployeeService {
	public List<Employee> showAllEmp();
    public Employee addEmp(Employee e);
    public Employee showEmpById(int id);
    public Employee updateEmp(Employee e);
    public void DeleteEmp(int id);
}
