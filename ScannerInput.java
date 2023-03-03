package SimpleDialogScanner;

import java.util.*; 

public class SimpleDialog1 {
	
	public static void main (String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Please, enter your name.");
		 
		 String userName = input.nextLine();
		 
		 System.out.println("Enter your age, please");
		 
		 int age = input.nextInt();
		 
		 System.out.println("Hi, " + userName + ", I see that you are " + age + " years old, given that I'm a very intelligent machine, "
		 		+ "I can tell that you will be " + (age +1) + " next year.");
		 
	}

}
