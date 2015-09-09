package com.mimsoft.tms.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user")
public class User {

	@Id
	@GeneratedValue(
			strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Integer userid;

	@Column(nullable = false, length = 45)
	private String username;

	@Column(nullable = false, length = 45)
	private String password;

	public final Integer getUserid() {
		return userid;
	}

	public final void setUserid(Integer userid) {
		this.userid = userid;
	}

	public final String getUsername() {
		return username;
	}

	public final void setUsername(String username) {
		this.username = username;
	}

	public final String getPassword() {
		return password;
	}

	public final void setPassword(String password) {
		this.password = password;
	}


}
