package easy;

public class LongestWord {

	/**
	 * @param args
	 * 
	 * Have the function LongestWord(sen) take the sen parameter being passed 
	 * and return the largest word in the string. If there are two or more words 
	 * that are the same length, return the first word from the string with that 
	 * length. Ignore punctuation and assume sen will not be empty. 
	 */
	
	public static String longestWord(String sen) { 
		  
	    // code goes here   
	    String[] stringArray = sen.split("\\W+");
	    int longest = 0;
	    for(int i = 0; i < stringArray.length; i++) {
	        if(stringArray[i].length() > stringArray[longest].length()){
	            longest = i;
	        }
	    }
	    return stringArray[longest];
	  } 
	public static void main(String[] args) {
		System.out.println(longestWord("what is the longest word?"));

	}

}
