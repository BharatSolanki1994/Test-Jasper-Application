package com.hibernate.map.entity;

import java.io.Serializable;

public class UserEntity implements Serializable{

	private String userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNo;
	private String street;
	private String city;
	private String state;
	private String country;
	private String totalSalary;
	private String totalEarningSalary;
	private String totalLeave;
	private String header;

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(String totalSalary) {
		this.totalSalary = totalSalary;
	}

	public String getTotalEarningSalary() {
		return totalEarningSalary;
	}

	public void setTotalEarningSalary(String totalEarningSalary) {
		this.totalEarningSalary = totalEarningSalary;
	}

	public String getTotalLeave() {
		return totalLeave;
	}

	public void setTotalLeave(String totalLeave) {
		this.totalLeave = totalLeave;
	}

	public UserEntity(String userId, String firstName, String lastName, String emailId, String mobileNo, String street,
			String city, String state, String country, String totalSalary, String totalEarningSalary,
			String totalLeave) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.totalSalary = totalSalary;
		this.totalEarningSalary = totalEarningSalary;
		this.totalLeave = totalLeave;
	}

	public UserEntity() {
		super();
	}

}
