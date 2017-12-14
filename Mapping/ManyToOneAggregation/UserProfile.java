package com.manytoone;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_profile")
public class UserProfile {
	@ManyToOne
	@JoinColumn(name="username")
	private UserCredential credential;

	public UserCredential getCredential() {
		return credential;
	}

	public void setCredential(UserCredential credential) {
		this.credential = credential;
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
	private long phone;

	public UserProfile() {
		super();
	}

	public UserProfile(int profId, String firstName, String lastName, String email, long phone) {
		super();
		this.profId = profId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
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
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
