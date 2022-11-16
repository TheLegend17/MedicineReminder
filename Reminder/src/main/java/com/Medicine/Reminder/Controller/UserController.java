package com.Medicine.Reminder.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Medicine.Reminder.Entity.UserEntity;
import com.Medicine.Reminder.Service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService uservice;
	
	@GetMapping("/print")
	public String printHelloStudent() {
		return "Hello, Robert";
	}
	
	@PostMapping("/postUser")
	public UserEntity insertUser(@RequestBody UserEntity user) {
		return uservice.insertUser(user);
	}
	
	@GetMapping("/getUser")
	public UserEntity getByUsername(@RequestParam String username, @RequestParam String password) throws Exception {
		return uservice.findByUsername(username, password);
	}
}
