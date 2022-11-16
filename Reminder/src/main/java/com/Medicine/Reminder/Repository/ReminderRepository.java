package com.Medicine.Reminder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Medicine.Reminder.Entity.ReminderEntity;

@Repository
public interface ReminderRepository extends JpaRepository<ReminderEntity, Integer>{

}
