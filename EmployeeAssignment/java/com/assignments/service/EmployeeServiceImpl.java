package com.assignments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.bean.Employee;
import com.assignments.repository.EmployeeRepository;
import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository repo;

	@Override
	public List<Employee> showAllEmp() {
		return repo.findAll();
	}

	@Override
	public Employee addEmp(Employee e) {
		return repo.save(e);
	}

	@Override
	public Employee showEmpById(int id) {
		Optional<Employee> optstu = repo.findById(id);
		Employee e = null;
		if(optstu.isPresent()) {
			e = optstu.get();
		}
		return e;
	}

	@Override
	public Employee updateEmp(Employee e) {
		return repo.save(e);
	}

	@Override
	public void DeleteEmp(int id) {
	   repo.deleteById(id);	
	}
    
}
