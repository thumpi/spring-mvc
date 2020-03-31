package com.spring.mvc.demo;

public class Student {
	private String firstName;
	private String lastName;
	private String[] softwareCheckbox;
	
	public String[] getSoftwareCheckbox() {
		return softwareCheckbox;
	}
	public void setSoftwareCheckbox(String[] softwareCheckbox) {
		this.softwareCheckbox = softwareCheckbox;
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
	

}
