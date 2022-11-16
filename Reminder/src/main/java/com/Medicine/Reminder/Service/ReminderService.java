package com.Medicine.Reminder.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Medicine.Reminder.Entity.ReminderEntity;
import com.Medicine.Reminder.Repository.ReminderRepository;

@Service
public class ReminderService {

	@Autowired
	ReminderRepository repo;
	
	//Insert new Reminder
	public ReminderEntity insertReminder(ReminderEntity reminder) {
		return repo.save(reminder);
	}
	
	//Delete Reminder 
	public String deleteReminder(int id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Id "+id+" successfully deleted";
		}
		else 
			return "Id "+id+" does not exist";
	}
	
	//Get all reminders
	public List<ReminderEntity> getAllReminder() {
		return repo.findAll();
	}
}
