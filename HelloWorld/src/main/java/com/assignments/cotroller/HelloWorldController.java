package com.assignments.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignments.resource.HelloWorld;

@RestController
public class HelloWorldController {
   
	@GetMapping("/helloworld")
	public HelloWorld showHelloWorld() {
		return new HelloWorld("HELLO WORLD");
	}
}
