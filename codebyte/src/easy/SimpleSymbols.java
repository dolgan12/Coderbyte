package easy;

public class SimpleSymbols {

	/**
	 * @param args
	 * sing the Java language, have the function SimpleSymbols(str) 
	 * take the str parameter being passed and determine if it is an 
	 * acceptable sequence by either returning the string true or false. 
	 * The str parameter will be composed of + and = symbols with several 
	 * letters between them (ie. ++d+===+c++==a) and for the string to be 
	 * true each letter must be surrounded by a + symbol. So the string to 
	 * the left would be false. The string will not be empty and will have 
	 * at least one letter. 
	 * 
	 * 
	 * Input:"+d+=3=+s+"
	 * Output:"true"
	 *
	 * Input:"f++d+"
	 * Output:"false"
	 */
	
	public static String simpleSymbols(String str)
	{
		boolean result = true;
		
		char[] charArray = str.toCharArray();
		for(int i = 0; i < charArray.length; i++){
			if(Character.isLetter(charArray[i])){
				if(i == 0 || i == charArray.length - 1){
					result = false;
					break;
				}else if(charArray[i - 1] != '+' || charArray[i + 1] != '+'){
					result = false;
					break;
				}
			}
		}
		
		if(result)
			return "true";
		else
			return "false";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(simpleSymbols("f++d+"));

	}

}
