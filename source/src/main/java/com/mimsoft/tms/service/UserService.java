package com.mimsoft.tms.service;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mimsoft.tms.business.InstructorBusinessAgent;
import com.mimsoft.tms.business.StudentBusinessAgent;
import com.mimsoft.tms.core.UserFactory;
import com.mimsoft.tms.data.entities.User;
import com.mimsoft.tms.exception.TMSUserCreationException;
import com.mimsoft.tms.util.UserType;

/**
 * Handles requests for the application home page.
 * 
 * TODO This will call the business layer.
 */
@Controller
public class UserService {

	@Autowired
	private StudentBusinessAgent studentBusinessAgent;

	@Autowired
	private InstructorBusinessAgent instructorBusinessAgent;

	private static final Logger logger = LoggerFactory
			.getLogger(UserService.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/create-student", method = RequestMethod.GET)
	public String createUser(Locale locale, Model model) {

		// TODO if user == student
		// TODO this should be student object after student is created.
		try {
			User student = UserFactory.createUser(UserType.STUDENT);
			// TODO student should pass to the following method.
			studentBusinessAgent.createStudent();
		} catch (TMSUserCreationException e) {
			// TODO return meaning full message.
			e.printStackTrace();
		}

		// TODO if user == instructor
		// TODO same as above should proceed.
		instructorBusinessAgent.createInstructor();

		return "home";
	}

}
