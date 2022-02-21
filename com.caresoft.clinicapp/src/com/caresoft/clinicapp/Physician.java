package com.caresoft.clinicapp;

public class Physician extends User implements HIPAACompliantUser {

	private ArrayList<String> patientNotes;
	
	public Physician(Integer id) {
		super(id);
	}
	
	public boolean assignPin(int pin) {
		
		if (pin<4) {
			System.out.println("Sorry, the pin needs to be at least 4 digits long");
		}else this.pin = pin; 
			return true;
	}
	
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.id = confirmedAuthID) {
			return true;}
		else {return false;}
	}
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    

}
