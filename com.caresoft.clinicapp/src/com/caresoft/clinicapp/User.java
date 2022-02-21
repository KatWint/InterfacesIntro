package com.caresoft.clinicapp;

public class User {
    protected Integer id;
    protected int pin;
    
    // TO DO: Getters and setters
    public Integer getId() {
    	return this.id;
    }
    
    public int getPin() {
    	return this.pin;
    }
    
    public void setId(Integer id) {
    	this.id = id;
    }
    
    public void setPin(int pin) {
    	this.pin = pin;
    }
    // Implement a constructor that takes an ID
    public User (Integer id) {
    	this.id=id;
    }
}

