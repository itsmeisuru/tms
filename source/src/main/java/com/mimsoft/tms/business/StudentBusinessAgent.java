package com.mimsoft.tms.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mimsoft.tms.application.StudentApplicationAgent;
import com.mimsoft.tms.data.StudentDataAgent;
import com.mimsoft.tms.data.entities.User;

;

/**
 * This should call the data agent.
 */
@Controller
public class StudentBusinessAgent {

	@Autowired
	StudentDataAgent studentDataAgent;

	private static final Logger logger = LoggerFactory
			.getLogger(StudentBusinessAgent.class);

	public void createStudent() {
		// TODO user should come here as a parameter
		StudentApplicationAgent.createStudent(new User());
	}

}
