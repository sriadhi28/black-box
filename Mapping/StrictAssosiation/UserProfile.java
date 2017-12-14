package com.mapping.strictassosiation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_profile")
public class UserProfile {
	@OneToOne
	@JoinColumn(name = "username")
	private UserCredential credentials;

	public UserCredential getCredentials() {
		return credentials;
	}

	public void setCredentials(UserCredential credentials) {
		this.credentials = credentials;
	}

	@Id
	@GeneratedValue
	@Column(name = "prof_id")
	private int profId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email_id")
	private String email;
	@Column(name = "phone_no")
	private long Phone;

	public UserProfile() {
		super();
	}

	public UserProfile(int profId, String firstName, String lastName, String email, long phone) {
		super();
		this.profId = profId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		Phone = phone;
	}

	public int getProf_id() {
		return profId;
	}

	public void setProfId(int profId) {
		this.profId = profId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return Phone;
	}

	public void setPhone(long phone) {
		Phone = phone;
	}

}
