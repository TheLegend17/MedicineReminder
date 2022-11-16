package com.Medicine.Reminder.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Medicine.Reminder.Entity.UserEntity;
import com.Medicine.Reminder.Repository.UserRepository;



@Service
public class UserService {

	@Autowired
	UserRepository urepo;
	
	//Insert new User
	public UserEntity insertUser(UserEntity user) {
		return urepo.save(user);
	}
	
	//Get User
	public UserEntity findByUsername(String username, String password) throws Exception {
		UserEntity user = urepo.findByUsername(username);
		if(user.getPassword().equals(password))
			return user;
		else
			throw new Exception("User does not exist in database");
	}
}
