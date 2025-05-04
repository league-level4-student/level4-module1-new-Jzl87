package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString (String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }
    

    @Override
    public String funkifyText() {
    	String x = "";
    	char[] y = unfunkifiedText.toCharArray();
    	
    	for (int z = y.length-1; z>=0; z--) {
    		x += y[z];
    	}
    	
        return x;

    }
}
