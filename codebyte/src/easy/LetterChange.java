package easy;

public class LetterChange {

	/**
	 * @param args
	 */

	public static String letterChanges(String str){
		String result = "";
		
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
		
			
			if(c >= 'a' && c <= 'z'){
				c += 1;
				if(c > 'z'){
					c = 'a';
				}
			}
			if(c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o'){
				c = Character.toUpperCase(c);
			}
			result += c;
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterChanges("fun times!"));

	}

}
