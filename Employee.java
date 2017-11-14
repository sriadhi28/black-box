package org.sample.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Employee {
	@Id
	@Column(name = "EMP_ID")
	private int id;
	@Column(name = "EMP_NAME", length = 150, nullable = false)
	private String name;
	@Column(name = "BASIC_SALARY")
	private double basicSalary;
	@Column(name = "EMAIL_ID", unique = true, nullable = false)
	private String emailId;
	@Column(name = "PHONE_NUMBER", unique = true, nullable = false)
	private long phoneNumber;
	@Column(name = "HRA")
	private float houseRentAllowance;
	@Column(name = "DA")
	private float dearnessAllowance;
	@Column(name = "TA")
	private float travelAllowance;
	@Column(name = "PF")
	private float providalFund;
	@Transient
	private double netSalary;

	public Employee(int id, String name, double basicSalary, String emailId, long phoneNumber, float houseRentAllowance,
			float dearnessAllowance, float travelAllowance, float providalFund, double netSalary) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.houseRentAllowance = houseRentAllowance;
		this.dearnessAllowance = dearnessAllowance;
		this.travelAllowance = travelAllowance;
		this.providalFund = providalFund;
		this.netSalary = netSalary;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public float getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public float getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(float travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public float getProvidalFund() {
		return providalFund;
	}

	public void setProvidalFund(float providalFund) {
		this.providalFund = providalFund;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
