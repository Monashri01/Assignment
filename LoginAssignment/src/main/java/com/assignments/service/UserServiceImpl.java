package com.assignments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.User;
import com.assignments.repository.UserRepository;
import java.util.*;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repo;

	@Override
	public User addUser(User u) {
		return repo.insert(u);
	}

	@Override
	public User getUserByName(String name) {
		Optional<User> user = repo.findById(name);
		User u = null;
		if(user.isPresent()) {
			u = user.get();
		}
		return u;
	}
  
}
