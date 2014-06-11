import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How old are you?");
		
		int age = input.nextInt();
		
		if(age > 0) {
			if((age < 13)) {
				System.out.println("Wow! You are very young for a programmer!");
			} else if(((age > 13) || (age == 13)) && (age < 20)) { // 13 <= age < 20 
				System.out.println("You are a teenaged programmer, how impressive!");
			} else if((age >= 20) && (age < 30)) {
				System.out.println("You are in your 20's, kinda weird that you are listening to a 15  teach you Java");
			} else if((age >= 30) && (age < 50)) {
				System.out.println("You are middle aged!");
			} else {
				System.out.println("You are a wise one");
			}
		} else { 
			System.out.println("That is not a valid age");
		}
	}
}
