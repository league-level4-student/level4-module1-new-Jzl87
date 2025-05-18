package _06_Hospital;

public class GeneralPractitioner extends Doctor {
	
	public boolean makesHouseCalls () {
		System.out.println("Ring Ring Ring");
		return true;
	}

	@Override
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}
}
