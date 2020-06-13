package com.webstack.webappdemo.dto;

public class StudentDTO {

	private String rollNo;
	private String name;
	private String mobileNo;
	private String email;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentDTO [rollNo=" + rollNo + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}

}
