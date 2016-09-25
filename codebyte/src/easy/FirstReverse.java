package easy;

public class FirstReverse {

	/**
	 * @param args
	 * Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order. 
	 */
	
	 public static String firstReverse(String str) { 
		  
		    // code goes here   
		    String resultString = "";
		    for(int i = str.length() -1; i >= 0; i--){
		        resultString += str.charAt(i);
		    }
		    
		       
		    return resultString;
		    
		  } 
	public static void main(String[] args) {
		System.out.println(firstReverse("abc"));

	}

}
