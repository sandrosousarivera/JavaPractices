package Default;

import java.util.*;

public class GuessTheRandomNumber {

	public static void main(String[] args) {

		int randomNumber = (int)(Math.random()*100);
		
		Scanner input = new Scanner(System.in);
		
		int userNumber=0;
		
		int tries=0;
		
		System.out.println("I'm gonna guess a number between 0 and 100, can you guess what number it is?");
		
		do {
			
			tries ++;
			
			System.out.println("Enter a number, please.");
			
			userNumber = input.nextInt(); 
			
			if(randomNumber < userNumber) {
				
				System.out.println("The number I thought of is LOWER than that.");
				
			}
			
			else if (randomNumber > userNumber) {
				
				System.out.println("The number I thought of is HIGHER than that.");
				
			}
			
		} while(userNumber != randomNumber);
		
		
		System.out.println("HOORAY! you guessed the number in " + tries + " tries");
		
		
	}

}
