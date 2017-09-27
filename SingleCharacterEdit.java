public class SingleCharacterEdit {

    public static String singleCharacterEditWillTurnAIntoB(String a, String b) {
       
    	// Stores the length of the two strings.
    	int aLength = a.length();
    	int bLength = b.length();
    	
    	//Replace part
    	if(aLength == bLength) {
    		for (int i = 0; i < aLength; i++) {
    			// Checks whether each character in string 'a' is the same with character in string 'b'.
    			if(a.charAt(i) != b.charAt(i)){
    				// Replaces the different character of string 'a'.
    				return "replace," + i + "," + b.charAt(i);
    			}
    		}
    	}
    	
    	//Remove Part
    	/* Checks if the difference between the lengths of the two strings is only a single character.
    	 * String 'a' should be greater than string 'b' to remove a character. 
    	 */
    	if(aLength - bLength == 1) {
    		for (int i = 0; i < bLength; i++) {
    			// Checks whether each character in string 'b' is the same with every character in string 'a'.
    			if (b.charAt(i) != a.charAt(i)) {
    				// Removes the extra character from string 'a'.
    				return "remove," + i;
    			}
    		}
    		// If string 'a' is still not equal to string 'b' then removes the last character of string 'a'.
    		if (!a.equals(b)) {
				return "remove," + (a.length()-1);
			}
    	}
    	
    	// Insert Part
    	/* Checks if the difference between the lengths of the two strings is only a single character. 
    	 * String 'b' should be greater than string 'a' to remove a character.
    	 */
    	if (aLength - bLength == -1) {
    		for (int i=0; i< aLength; i++){
    			// Checks whether each character in string 'a' is the same with every character in string 'b'.
	    			if (a.charAt(i) != b.charAt(i)) {
	    				// Inserts the extra character to string 'a'.
	    				return "insert," + i + "," + b.charAt(i);
	    			}
    		}
    		// If string 'a' is still not equal to string 'b' then adds an extra character at the end of string 'a'.
    		if (!a.equals(b)) {
				return "insert," + (a.length()) + "," + b.charAt(a.length());
			}
    	}
    
        return null; // this is only here to make it compile
    }

}
