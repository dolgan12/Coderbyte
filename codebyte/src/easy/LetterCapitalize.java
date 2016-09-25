package easy;

public class LetterCapitalize {

	/**
	 * Using the Java language, have the function LetterCapitalize(str) take the str 
	 * parameter being passed and capitalize the first letter of each word. Words will 
	 * be separated by only one space. 
	 * 
	 * Input:"hello world"
	 * Output:"Hello World"
	 *
	 * Input:"i ran there"
	 * Output:"I Ran There"
	 */
	
	public static String letterCapitalize(String str){
		String result = "";
		String[] toArray = str.split(" ");
		
		for(int i = 0; i < toArray.length; i++){
			char[] wordString = toArray[i].toCharArray();
			wordString[0] = Character.toUpperCase(wordString[0]);
			result += new String(wordString) + " ";
		}
		return result.trim();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCapitalize("i ran there"));
	}

}
