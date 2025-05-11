package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	
	ArrayList <Patient> patients;
	
	public Doctor () {
		patients = new ArrayList <Patient> ();
	}
	
	public String doMedicine() {
		return "medicine done";
	}
	
	public void addPatient (Patient p) {
		patients.add(p);
	}
	
	public ArrayList<Patient> getList(){
		return patients;
	}
}
