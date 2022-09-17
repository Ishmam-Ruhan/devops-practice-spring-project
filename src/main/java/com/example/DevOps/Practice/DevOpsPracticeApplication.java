package com.example.DevOps.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevOpsPracticeApplication {

	@GetMapping("/sayHi")
	public String sayHi(){
		return "Hey! Welcome dev-ops practice! I'm from system. Whats your name?";
	}

	@GetMapping("/name/{name}")
	public String sayName(@PathVariable String name){
		return "Wow.! Nice name "+name+"\n  Let's explore more!";
	}



	public static void main(String[] args) {
		SpringApplication.run(DevOpsPracticeApplication.class, args);
	}

}
