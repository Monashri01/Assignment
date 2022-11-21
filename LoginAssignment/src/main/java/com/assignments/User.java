package com.assignments;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class User {
	@Id
	@NotBlank(message="Name should not be Empty")
	private String uname;
	@NotBlank(message="Email should not be Empty")
	private String email;
	@NotBlank(message="Password should not be Empty")
	private String pass;

	public User() {
		super();
	}
	
	public User(String uname, String email, String pass) {
		super();
		this.uname = uname;
		this.email = email;
		this.pass = pass;
	}



	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
