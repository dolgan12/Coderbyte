package easy;

public class SimpleAdding {

	/**
	 * @param args
	 * Using the Java language, have the function SimpleAdding(num) add up all the numbers from 1 to num. 
	 * For the test cases, the parameter num will be any number from 1 to 1000. 
	 */
	
	public static int simpleAdding2(int num){
		if(num == 1){
			return 1;
		}
		return num + simpleAdding2(num -1);
	}
	
	public static int simpleAdding(int num){
		int result = 0;
		
		for(int i = 1; i <= num; i++){
			result += i;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(simpleAdding2(140));
	}

}
