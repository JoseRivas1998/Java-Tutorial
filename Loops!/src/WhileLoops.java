import java.util.Scanner;
public class WhileLoops {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean bContinue = true;
		while(bContinue) {
			System.out.println("Enter a Number, 0 to stop");
			int x = scan.nextInt();
			if (x == 0) {
				bContinue = false;
			}
			System.out.println("You entered:" + x);
		}
		System.out.println("Loop is done");
	}
} 
