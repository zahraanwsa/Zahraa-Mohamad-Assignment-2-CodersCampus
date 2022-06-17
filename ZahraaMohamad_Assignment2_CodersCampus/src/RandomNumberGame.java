import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

	public static void main(String[] args) {

		Random myRandomNumber = new Random();
		int randomNumber = myRandomNumber.nextInt(100)+1;
		int amountOfGuesses = 1;
		int playersNumber;

		Scanner playersInput = new Scanner(System.in);
			System.out.println("Pick a number between 1 and 100");
		
		while (amountOfGuesses <= 5 ) {
			playersNumber = playersInput.nextInt();
			
		if(amountOfGuesses == 5) {
			System.out.println("You lose!! The number to guess was: "+ randomNumber );
		} 
		
		else if(playersNumber<1 || playersNumber>100) {
		    System.out.println("Your guess is not between 1 and 100, please try again.");
		}
		
		else if(playersNumber > randomNumber){
			System.out.println("Please pick a lower number"   );
			amountOfGuesses++;
		}
				
		else if(playersNumber < randomNumber){
			System.out.println("Please pick a higher number"   );
			amountOfGuesses++;
		}
				
		else if(playersNumber == randomNumber){
			System.out.println("You win!!");
		    break;
		}
				
		else {
			break;
		}	  	
		}
		}
		}	