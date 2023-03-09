package AgeCheckerIfConditional;

import java.util.*;


public class LegalAgeCheckerIfConditional {
	
	
	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Are you over 18?, Type your age, please");
		
		
		while (!Input.hasNextInt()) {
			
			System.out.println("Enter a number, please.");
			
			Input.nextLine();
			
		}
		
		int Age = Input.nextInt();
		
	
		int Minus18 = 18 - Age;
		
		if (Age >= 18) {
			
			System.out.println("Okey, you can enter");
			
		}
		else {
			
			System.out.println("You are not allowed to enter, try again in " + (Minus18) + " years!!");
			
		}
		
		
	}

}
