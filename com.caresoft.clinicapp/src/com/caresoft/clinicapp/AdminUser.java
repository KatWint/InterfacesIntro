package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
	
	private String role;
	private ArrayList<String> securityIncidents;
	
	public AdminUser(Integer id, String role) {
		 super(id);
		 this.role = role;
		 this.securityIncidents = new ArrayList<String>();
	}
	
	public boolean assignPin(int pin) {
		
		if (pin.length<6) {
			System.out.println("Sorry, the pin needs to be at least 6 digits long");
		}else this.pin = pin; 
			return true;
	}

	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (confirmedAuthID != this.id) {
			this.authIncident();
			return false;
		} else return true;
	}

	public void newIncident(String notes) {
		String report = String.format(
				"Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
				new Date(), this.id, notes
				);
		securityIncidents.add(report);
	}
	public void authIncident() {
		String report = String.format(
				"Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
				new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
				);
		securityIncidents.add(report);
	}

// TO DO: Setters & Getters

	public String getRole() {
		return this.role;
	}
	
	public ArrayList<String> getIncidents(){
		return this.securityIncidents;
	}
	
	public void setRole(String role) {
		this.role=role;
	}
	
	public void setIncidents(String incidents) {
		this.securityIncidents = incidents;
	}
}
