package com.Medicine.Reminder.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Medicine.Reminder.Entity.ReminderEntity;
import com.Medicine.Reminder.Service.ReminderService;

@RestController
@RequestMapping("/reminder")
public class ReminderController {
	
	@Autowired
	ReminderService rservice;
	
	@PostMapping("/postReminder")
	public ReminderEntity insertReminder(@RequestBody ReminderEntity reminder) {
		return rservice.insertReminder(reminder);
	}
	
	@DeleteMapping("/deleteReminder")
	public String deleteReminder(@RequestParam int id) {
		return rservice.deleteReminder(id);
	}
	
	@GetMapping("/getAllReminder")
	public List<ReminderEntity> getAllReminder() {
		return rservice.getAllReminder();
	}
}
