package com.mimsoft.tms.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mimsoft.tms.data.StudentDataAgent;
import com.mimsoft.tms.data.entities.User;
;

/**
 * This should call the data agent.
 */
@Controller
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
