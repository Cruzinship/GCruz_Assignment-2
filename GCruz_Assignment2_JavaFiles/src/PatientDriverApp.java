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
public class PatientDriverApp extends Procedure{
	

	public static void main(String args[]){
		Patient patientInfo = new Patient("Johnny", "Johnny", "Yes", "294 New York York New","NY","12345","Papa", "523-235-3742");
		Procedure procedure1 = new Procedure("Eating Surgar", "02/21/2024", "Dr. No Papa",5.28);
		Procedure procedure2 = new Procedure("Telling lies", "02/21/2024", "Dr. No papa",51.42);
		Procedure procedure3 = new Procedure("Open Your mouth", "02/21/2024", "Dr. Haha", 500000.19);
		
		displayPatient(patientInfo);
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		calculateTotalCharge(procedure1, procedure2, procedure3);
		
		System.out.println("\nStudent Name: Gianpaulo Cruz\nMC#: M21181439\nDue Date: 02/26/2024");
	}
	
	public static void displayPatient(Patient patientInfo) {
		System.out.println(patientInfo.toString());
	}
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure.toString());
	}
	public static void calculateTotalCharge(Procedure procedure1, Procedure procedure2 ,Procedure procedure3) {
		double TotalCharge = procedure1.charges() + procedure2.charges() + procedure3.charges();
		System.out.println("\nTotal Charges: $" + TotalCharge);
	}
}
