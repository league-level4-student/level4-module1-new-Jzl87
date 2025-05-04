package _03_Text_Funkifier;

public class SpaceOut implements TextFunkifier{

    private String unfunkifiedText;

    public SpaceOut (String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		String x = "";
    	char[] y = unfunkifiedText.toCharArray();
    	
    	for (int z =0; z < y.length; z++) {
    		
    			x+= y[z];
    			x+= "  ";
    		
    	}
    	
        return x;
	}


}
