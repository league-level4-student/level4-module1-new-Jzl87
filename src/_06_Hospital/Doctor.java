package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	
	ArrayList <Patient> patients;
	
	
	public Doctor () {
		patients = new ArrayList <Patient> ();
	}
	
	public String doMedicine() {
		for (Patient p : patients) {
			p.setCaredFor(true);
		}
		return "medicine done";
	}
	
	public void assignPatient (Patient p) throws Exception {
		if (patients.size() < 3) {
			patients.add(p);
		} else {
			throw new DoctorFullException();
		}
		
	}
	
	public ArrayList<Patient> getPatients(){
		return patients;
	}
	
	public abstract boolean makesHouseCalls();
	
	public abstract boolean performsSurgery();
	
}
