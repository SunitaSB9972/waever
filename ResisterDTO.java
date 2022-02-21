package com.weaver.weaverminds.dto;

public class ResisterDTO {
	
	private long mobileNumber;
	private String fullName;
	private String emailAddress;
	private int countryCode;
	private String password;

	public String getFullName() {
		return fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
