package _00_Intro_to_Exceptions;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class NegativeNumberException extends Exception{

	
	public static void scaryPopup() {
		JOptionPane.showMessageDialog(null, "You have been hacked by hackerman. you-re computer ghas virus. Your systems are compriomised. pleb.");
	}
	
	public static void testPositive(int num) throws Exception {
		if (num < 0) {
			throw new Exception();
		}
	}

	
}
