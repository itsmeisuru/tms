/**
 * 
 */
package com.mimsoft.tms.exception;

/**
 * @author isuru
 * 
 */
public class TMSUserCreationException extends Exception {

	/**
	 * uid.
	 */
	private static final long serialVersionUID = 1L;

	public TMSUserCreationException() {
		super();
	}

	public TMSUserCreationException(String message) {
		super(message);
	}

	public TMSUserCreationException(Throwable e) {
		super(e);
	}

	public TMSUserCreationException(String message, Throwable e) {
		super(message, e);
	}

}
