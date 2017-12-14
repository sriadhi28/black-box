package com.mapping.strictassosiation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_credentials")
public class UserCredential {
	@OneToOne(mappedBy = "credentials")
	private UserProfile user;

	public UserProfile getUser() {
		return user;
	}

	public void setUser(UserProfile user) {
		this.user = user;
	}

	@Id
	@Column(name = "username")
	private String username;
	@Column(name = "pasword")
	private String password;
	@Column(name = "status")
	private int status;

	public UserCredential() {
		super();
	}

	public UserCredential(String username, String password, int status) {
		super();
		this.username = username;
		this.password = password;
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
