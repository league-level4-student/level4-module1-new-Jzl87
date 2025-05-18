package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList <Doctor> doctors = new ArrayList  <Doctor>();
	ArrayList<Patient> unassignedPatients = new ArrayList<Patient>();
	
	public ArrayList<Patient> getPatients () {
		return unassignedPatients;
	}
	
	public ArrayList<Doctor> getDoctors () {
		return doctors;
	}
	
	public void addDoctor (Doctor doc) {
		doctors.add(doc);
	}
	
	public void addPatient (Patient pat) {
		unassignedPatients.add(pat);
	}
	
	public void assignPatientsToDoctors() throws Exception {
		for (int x = 0; x<unassignedPatients.size(); x++) {
			for (int y = 0; y<doctors.size(); y++) {
				
			}
		}
	}
}
