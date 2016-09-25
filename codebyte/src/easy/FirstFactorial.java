package easy;

public class FirstFactorial {

	/**
	 * @param args
	 * Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it (e.g. if num = 4,
	 * return (4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 18. 
	 */
	public static int firstFactorial(int num){
		if(num == 1)
			return 1;
		return num * firstFactorial(num -1);
	}
	public static void main(String[] args) {
		System.out.println(firstFactorial(4));

	}

}
