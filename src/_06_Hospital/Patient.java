package _06_Hospital;

public class Patient {
	boolean caredFor = false;
	
	public void setCaredFor(boolean ty) {
		caredFor = ty;
	}

	public boolean feelsCaredFor() {
		return caredFor;
	}

	public double checkPulse () {
		caredFor = true;
		return Math.random() *200;
	}
	
}
