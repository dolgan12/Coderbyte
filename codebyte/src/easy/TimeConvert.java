package easy;

public class TimeConvert {

	/**
	 * @param args
	 * Using the Java language, have the function TimeConvert(num) 
	 * take the num parameter being passed and return the number of 
	 * hours and minutes the parameter converts to (ie. if num = 63 then 
	 * the output should be 1:3). Separate the number of hours and minutes 
	 * with a colon. 
	 * 
	 * Input:126
	 * Output:"2:6"
	 *
	 * Input:45
	 * Output:"0:45"
	 */
	
	public static String timeConvert(int time){
		String hours, min;
		if(time < 60){
			hours = "0";
			min = Integer.toString(time);
			
		}else{
			hours = Integer.toString(time / 60);
			min = Integer.toString(time % 60);
		}
		return hours + ":" + min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(timeConvert(46));
	}

}
