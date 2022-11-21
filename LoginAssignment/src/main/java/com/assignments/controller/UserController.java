package com.assignments.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.assignments.User;
import com.assignments.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
   
	@GetMapping("/")
	public String showLoginPage(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@GetMapping("/registration")
	public String showRegisterPage(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("user") User user) {
		String uname = user.getUname();
		String pass = user.getPass();
		User u = service.getUserByName(uname);
		if(uname.equalsIgnoreCase(u.getUname()) && pass.equalsIgnoreCase(u.getPass()))
			  return "success";
		return "error";
	}
	
	@PostMapping("/register")
	public String showRegisterPage(@Valid @ModelAttribute("user") User user, BindingResult br) {
		if(br.hasErrors()) {
		  return "registration";
		} else {
		User u = service.addUser(user);
		if(u!=null)
		  return "login";
		}	
		return "registration";
	}
}
