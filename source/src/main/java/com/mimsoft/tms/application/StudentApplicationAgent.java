package com.mimsoft.tms.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mimsoft.tms.data.StudentDataAgent;
import com.mimsoft.tms.data.entities.User;

;

/**
 * TODO This whole class should be changed this should be called by business and
 * from this class it should call the data layer.
 */
public class StudentApplicationAgent {

	@Autowired
	StudentDataAgent studentDataAgent;

	private static final Logger logger = LoggerFactory
			.getLogger(StudentApplicationAgent.class);

	public void createStudent() {
		// TODO user should come here as a parameter
		studentDataAgent.createStudent(new User());
	}

}
