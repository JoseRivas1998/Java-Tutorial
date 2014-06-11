
public class Time {
	public static void main(String[] args) {
		int x = 3;
		int y = 2;
		double answer = x / y;
		int seconds = 500;
		int minutes = seconds / 60;
		
		int remainingSeconds = seconds % 60;
		
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");
		System.out.println( answer );
	}
}  
