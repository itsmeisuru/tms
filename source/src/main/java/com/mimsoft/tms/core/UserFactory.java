/**
 * 
 */
package com.mimsoft.tms.core;

import com.mimsoft.tms.data.entities.User;
import com.mimsoft.tms.exception.TMSUserCreationException;
import com.mimsoft.tms.util.UserType;

/**
 * @author isuru
 * 
 */
public class UserFactory {

	/**
	 * User object to be return;
	 */
	User user;

	public static User createUser(UserType userType)
			throws TMSUserCreationException {
		if (userType.equals(UserType.INSTRUCTOR)) {
			// TODO instead of user it should be instructor.
			return new User();

		}
		if (userType.equals(UserType.STUDENT)) {
			// TODO instead of user it should be student.
			return new User();
		}

		// TODO verify this exception throwing
		throw new TMSUserCreationException("Currently user: " + userType
				+ " is not supported by the system");
	}

}
