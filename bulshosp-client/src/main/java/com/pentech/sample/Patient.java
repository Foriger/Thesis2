package com.pentech.sample;

import java.io.Serializable;
import java.util.ArrayList;

public class Patient implements Serializable{
	private static final long serialVersionUID = 1L;
	private String firstname;
	private String surname;
	private String family;
	private String EGN;
	private String diagnose;
	private ArrayList<Event> patientEvents;
	private int status;
	
	public String statusAsString(){
		String statusAsString;
		switch (status) {
		case 1:
			statusAsString = "Стабилно";
			break;
		case 2:
			statusAsString = "Под наблюдение";
			break;
		case 3:
			statusAsString = "Тежко";
			break;
		case 4:
			statusAsString = "Починал";
			break;
		default:
			statusAsString = "Неизвестно";
			break;
		}
		return statusAsString;
	}
	
	public Patient(String firstname,String family) {
		this.firstname = firstname;
		this.family = family;
		this.diagnose = "Шигелоза, предизвикана от Shigella sonnei "+ this.firstname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}
	
	public String patientFullname(){
		return this.firstname +" "+ this.family;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEGN() {
		return EGN;
	}

	public void setEGN(String eGN) {
		EGN = eGN;
	}

	public ArrayList<Event> getPatientEvents() {
		return patientEvents;
	}

	public void setPatientEvents(ArrayList<Event> patientEvents) {
		this.patientEvents = patientEvents;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
}
