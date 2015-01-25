package com.pentech.sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "PatientBean")
@SessionScoped
public class PatientBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private ArrayList<Patient> patients;
	private Patient selectedPatient;

	public ArrayList<Patient> getPatientsList() {
		if (patients == null) {
			patients = new ArrayList<Patient>();
			for (int i = 0; i < 30; i++) {
				ArrayList<Event> sampleEvents = new ArrayList<Event>();
				sampleEvents.add(new Event(EventType.MEDICINE, "Лекарство-АБЦД - "+i, new Date(), "Проста блежка.."));
				sampleEvents.add(new Event(EventType.MANIPULATION, "Kръв", new Date(), "Проста блежка..1"));
				sampleEvents.add(new Event(EventType.RESEARCH, "Kръв - Файл - "+i, new Date(), "Проста блежка..2"));
				
				Patient patient = new Patient("Test- " + i, "Test-" + i);
				patient.setPatientEvents(sampleEvents);
				if(i % 3 == 0){
					patient.setStatus(1);
				}
				if(i % 2 == 0){
					patient.setStatus(2);
				}
				if(i %2 == 0){
					patient.setStatus(3);
				}
				if(i%5 == 0){
					patient.setStatus(4);
				}
				patients.add(patient);
			}
		}
		return patients;
	}

	
	public Patient getSelectedPatient() {
		return selectedPatient;
	}

	public void setSelectedPatient(Patient selectedPatient) {
		this.selectedPatient = selectedPatient;
	}
	
	private static int randInt(int min, int max) {
	    Random rand = new Random(); 
	    return rand.nextInt((max - min) + 1) + min;
	}
	
}
