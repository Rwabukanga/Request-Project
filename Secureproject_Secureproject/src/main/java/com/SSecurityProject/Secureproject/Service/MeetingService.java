package com.SSecurityProject.Secureproject.Service;

import java.util.List;
import java.util.Optional;

import com.SSecurityProject.Secureproject.Domain.Meeting;





public interface MeetingService {

	public void createMeeting(Meeting mt);
	public void updateMeeting(Meeting mt);
	public void deleteMeeting(int id);
	public Optional<Meeting> findById(int id);
	public Optional<Meeting> findByUuuid(String uuid);
	public List<Meeting> findAll(Class c); 
}
