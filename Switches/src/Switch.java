import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many A's did you recieve in this last semester of school?");
		int x = scan.nextInt();
		switch(x) {
		case 0: System.out.println("Do better next time");
				break;
		case 1: System.out.println("You can do better but at least you got one");
				break;
		case 2: System.out.println("Two A's is better than one, you try for more next time");
				break;
		case 3: System.out.println("Half your classes you got an A, congrats");
				break;
		case 7: System.out.println("Congrats!");
				break;
		case 4: System.out.println("You are close to glory!");
				break;
		case 5: System.out.println("So close but yet so far away!");
				break;
		case 6: System.out.println("Congrats on your 4.0 gpa!");
				break;
		default: System.out.println("You cannot have that many A's");
				break;
		}
	}
}
