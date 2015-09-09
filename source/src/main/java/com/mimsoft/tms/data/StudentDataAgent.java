package com.mimsoft.tms.data;

import org.springframework.beans.factory.annotation.Autowired;

import com.mimsoft.tms.data.entities.User;
import com.mimsoft.tms.data.repositories.UserRepository;

/**
 * This should call the db directly.
 */
public class StudentDataAgent {

	@Autowired
	UserRepository userRepository;

	public void createStudent(User user) {
		// do the logic
		User insertedUser = userRepository.save(user);
	}
}
