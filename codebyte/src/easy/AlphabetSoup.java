package easy;

import java.util.Arrays;

public class AlphabetSoup {

	/**
	 * @param args
	 * Using the Java language, have the function AlphabetSoup(str) 
	 * take the str string parameter being passed and return the string 
	 * with the letters in alphabetical order (ie. hello becomes ehllo). 
	 * Assume numbers and punctuation symbols will not be included in the string. 
	 * 
	 * Input:"coderbyte"
	 * Output:"bcdeeorty"
	 *
	 * Input:"hooplah"
	 * Output:"ahhloop"
	 */
	
	public static String alphabetSoup(String str){
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		String result = new String(charArray);
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(alphabetSoup("coderbyte"));
	}

}
