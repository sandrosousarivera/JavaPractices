package Default;

import javax.swing.*;

public class IdealWeightCalculator {

	public static void main(String[] args) {
		
		 String gender= "";
		 
		 do {
			 
			 gender= JOptionPane.showInputDialog("Enter your gender (M/F)");

		 }
		 
		 while(gender.equalsIgnoreCase("M")==false && gender.equalsIgnoreCase("F")==false);
		 
		 
			String input = JOptionPane.showInputDialog("Enter your height in centimeters:");
			
			while (!input.matches("\\d+")) {
				
				input = JOptionPane.showInputDialog("Please enter a valid number:");
			}
		 
		 
		 int height = Integer.parseInt(input);


		 int idealWeight= 0;
		 
		 if (gender.equalsIgnoreCase("M")) {
			 
			 idealWeight = height - 90;
			 
		 }
		 
		 else if(gender.equalsIgnoreCase("F")) {
			 
			 idealWeight = height -  100;
			 
		 }
		 
		 System.out.println("Your ideal weight is " + idealWeight + " units of love.");
		 
	}

}
