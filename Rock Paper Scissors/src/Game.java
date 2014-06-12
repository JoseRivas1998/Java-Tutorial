import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		//1 is rock, 2 is paper, 3 is scissors
		Scanner scan = new Scanner(System.in); //create an instance of the Scanner class
		int computer; //initialize the computer' answer
		System.out.println("Rock Paper or Scissors? 1 is Rock, 2 is Paper, 3 is Scissors and 0 to stop"); //instructions for player
		boolean bContinue = true; //initialize continue boolean
		int computerScore = 0; //initialize Computer Score
		int playerScore = 0; //initialize Player Score
		int ties = 0; //initialize the number of ties
		while(bContinue) { //loop is bContinue is true
			int answer = scan.nextInt(); //sets a value to answer according to the scanner 
			computer = (int) Math.floor((Math.random() * 3) + 1); //sets the computers answer to a random value between 1-3 and makes it an int
			switch (answer) { //the switch for what the player entered
			case 0: bContinue = false; //if the player entered 0, then the bContinue is false, exiting the loop and the entire program
					break;
			case 1: System.out.println("You entered Rock"); //case for user input: 1 (rock)
					switch(computer) {
					case 1: System.out.println("Me: Rock");
							System.out.println("Its a tie!");
							ties++;
							break;
					case 2: System.out.println("Me: Paper");
							System.out.println("I win!");
							computerScore++;
							break;
					case 3: System.out.println("Me: Scissors");
							System.out.println("You win!");
							playerScore++;
							break;
					}
					break;
			case 2: System.out.println("You entered Paper");
				switch(computer) {
				case 1: System.out.println("Me: Rock");
						System.out.println("You win!");
						playerScore++;
						break;
				case 2: System.out.println("Me: Paper");
						System.out.println("Its a tie");
						ties++;
						break;
				case 3: System.out.println("Me: Scissors");
						System.out.println("I win!");
						computerScore++;
						break;
				}
			break;
			case 3: System.out.println("You entered Scissors");
				switch(computer) {
				case 1: System.out.println("Me: Rock");
						System.out.println("I win!");
						computerScore++;
						break;
				case 2: System.out.println("Me: Paper");
						System.out.println("You win!");
						playerScore++;
						break;
				case 3: System.out.println("Me: Scissors");
						System.out.println("Its a tie!");
						ties++;
						break;
				}
			break;
			default: System.out.println("That is not a valid answer"); //if the user did not put, 0, 1, 2, or 3
					 break;
			}
			System.out.println("Your Score: " + playerScore + " My Score: " + computerScore + " Ties: " + ties); //display scores
		}
		scan.close(); //close Scanner
	}
}
