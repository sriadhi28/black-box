package org.sample.emp;

//@Table(name = "EMPLOYEE_DETAILS")
//@Entity
public class Employee {
	//@Id
	//@Column(name = "EMP_ID")
	//@GeneratedValue()
	private int id;
	//@Column(name = "EMP_NAME", length = 150, nullable = false)
	private String name;
	//@Column(name = "BASIC_SALARY")
	private double basicSalary;
	//@Column(name = "EMAIL_ID", unique = true, nullable = false)
	private String emailId;
	//@Column(name = "PHONE_NUMBER", unique = true, nullable = false)
	private long phoneNumber;
	//@Column(name = "HRA")
	private float houseRentAllowance;
	//@Column(name = "DA")
	private float dearnessAllowance;
	//@Column(name = "TA")
	private float travelAllowance;
	//@Column(name = "PF")
	private float providentFund;
	//@Transient
	private double netSalary;

	public Employee(String name, double basicSalary, String emailId, long phoneNumber, float houseRentAllowance,
			float dearnessAllowance, float travelAllowance, float providentFund) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.houseRentAllowance = houseRentAllowance;
		this.dearnessAllowance = dearnessAllowance;
		this.travelAllowance = travelAllowance;
		this.providentFund = providentFund;
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

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
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
