/*
 CMSC203 Assignment 2 Implementation (Documentation) 
Class: CMSC203 CRN: 30339 
Program: Assignment 2 
Instructor: Professor Grinberg 
Summary of Description: This project demonstrates object-oriented programming principles such as encapsulation, constructors, and method invocation, while simulating a basic medical records system. 
Due Date: 2/26/2024  
Integrity Pledge: I pledge that I have completed the programming assignment independently. 
I have not copied the code from a student or any source. 
 */
public class Patient {

		private String firstName;
		private String middleName;
		private String lastName;
		private String streetAddress;
		private String state;
		private String zipCode;
		private String phoneNumber;
		private String emergencyContactName;
		private String emergencyContactPhone;
		
	//Constructors
	public Patient() {
		
	}
	
	public Patient(String firstName,String middleName, String lastName, String streetAddress, String state, String zipCode, String emergencyContactName, String emergencyContactPhone){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.state = state;
		this.zipCode = zipCode;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactPhone = emergencyContactPhone;
	}
	
	//Getters
	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmergencyContactName() {
		return emergencyContactName;
	}
	
	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}
	
	//Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setStreetAddress(String streetAddress){
		this.streetAddress = streetAddress;
	}
	
	public void setStates(String state) {
		this.state = state;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public void setPhoneNumbe(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}
	
	public void setEmegencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}
	
	//Build FullName
	public String buildFullName(String firstName, String middleName, String lastName){
		String fullName = firstName + " " + middleName + " " + lastName;
		
		return fullName;
	}
	//BuildAddress
	public String buildAddress(String streetAddress, String state, String zipCode) {
		String fullAddress = streetAddress + " " + state + " " + zipCode;
		return fullAddress;
	}
	public String buildEmergencyContact(String emergencyContactName, String emergencyContactPhone) {
		String EmergencyContact = emergencyContactName + " " + emergencyContactPhone;
		return EmergencyContact;
	}
	
	public String toString() {
		return "Patient info: " +
			   "\n  Name: " + buildFullName(firstName, middleName, lastName) + 
			   "\n  Address: " + buildAddress(streetAddress, state, zipCode) +
			   "\n  EmergencyContact: " + buildEmergencyContact(emergencyContactName, emergencyContactPhone);
	}
}
