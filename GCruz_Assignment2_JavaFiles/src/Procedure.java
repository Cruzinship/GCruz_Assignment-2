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
public class Procedure extends Patient{
	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double charges;
	
	//constructors
	public Procedure(){
	}
	
	public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitionerName = practitionerName;
		this.charges = charges;
	}
	//Getters
	public String getProcedureName() {
		return procedureName;
	}
	
	public String getProcedureData() {
		return procedureDate;
	}
	
	public String practitionerName() {
		return practitionerName;
	}
	
	public double charges() {
		return charges;
	}
	
	//Setters
	public void setProcedureName(String procedureName){
		this.procedureName = procedureName;
	}
	
	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}
	
	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}
	
	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	public String toString() {
		return "\n       Procedure: " + procedureName +
				"\n       ProcedureDate=" + procedureDate +
				"\n       Practitioner=" + practitionerName +
				"\n       Charge=" + charges;
	}
}
