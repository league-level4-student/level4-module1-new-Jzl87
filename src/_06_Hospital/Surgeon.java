package _06_Hospital;

public class Surgeon extends Doctor{

	public boolean performsSurgery() {
		System.out.println("SCALPEL!");
		return true;
	}

	@Override
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}
}
