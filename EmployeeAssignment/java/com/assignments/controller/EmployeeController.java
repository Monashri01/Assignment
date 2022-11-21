package com.assignments.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

import javax.validation.Valid;

import com.assignments.bean.Employee;
import com.assignments.service.EmployeeService;


@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
   
	@GetMapping("/")
	public String getAllEmp(Model model) {
		List<Employee> empsList = service.showAllEmp();
		model.addAttribute("employeelist", empsList);
		return "index";
	}
	
	@GetMapping("/{id}")
	public String getEmp(@PathVariable("id") int id,Model model) {
		Employee emp = service.showEmpById(id);
		model.addAttribute("e", emp);
		return "displayEmp";
	}
	

	@GetMapping("/showAddPage")
	public String showAddPage(Model model) {
		model.addAttribute(new Employee());
		return "addEmp";
	}
	

	@PostMapping("/addemp")
	public String addEmp(@Valid @ModelAttribute("employee") Employee emp, BindingResult br) {
		if(br.hasErrors()) {
			return "addEmp";
		} else {
		Employee e = service.addEmp(emp);
		if(e!=null) {
		return "redirect:/";
		} else {
			return "addEmp";
		}
		}
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable("id") int id) {
		service.DeleteEmp(id);
		return "redirect:/";
	}
	
	@GetMapping("/showUpdatePage/{id}")
	public String showupdatePage(@PathVariable("id") int id, Model model) {
		Employee e = service.showEmpById(id);
		model.addAttribute(e);
		return "updateEmp";
	}
	

	@PostMapping("/updateemp")
	public String updateEmp(@ModelAttribute("employee") Employee emp) {
		Employee e = service.updateEmp(emp);
		return "redirect:/";
	}
}
