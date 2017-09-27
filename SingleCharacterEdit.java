public class SingleCharacterEdit {

    public static String singleCharacterEditWillTurnAIntoB(String a, String b) {
        // TODO: your code goes here, replacing the next line with your actual code
    	int aLength = a.length();
    	int bLength = b.length();
    	
    	//Replace part
    	if(aLength == bLength) {
    		for (int i = 0; i < aLength; i++) {
    			if(a.charAt(i) != b.charAt(i)){
    				return "replace," + i + "," + b.charAt(i);
    			}
    		}
    	}
    	
    	//Insert Part
    	if(aLength - bLength == -1) {
    		for (int i = 0; i < aLength; i++) {
    			if (a.charAt(i) != b.charAt(i)) {
    				return "insert," + i + "," + b.charAt(i);
    			}
    		}
    		
    		
    		
    		
    	}
    	
    	
    	//Remove Part
    	if(aLength - bLength == 1) {
    		
    		
    		
    		
    		
    		
    	}
    	
    	
        return null; // this is only here to make it compile
    }

}
