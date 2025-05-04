package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString (String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		String x = "";
    	char[] y = unfunkifiedText.toCharArray();
    	
    	for (int z =0; z < y.length; z++) {
    		if (z%2 ==1) {
    			x+= (y[z] + "").toUpperCase();
    		} else {
    			x+= (y[z] + "").toLowerCase();
    		
    		}
    	}
    	
        return x;
	}

}
