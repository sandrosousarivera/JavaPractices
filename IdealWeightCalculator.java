package Default;

import javax.swing.*;

public class IdealWeightCalculator {

	public static void main(String[] args) {
		
		 String gender= "";
		 
		 do {
			 
			 gender= JOptionPane.showInputDialog("Enter your gender (M/F)");

		 }
		 
		 while(gender.equalsIgnoreCase("M")==false && gender.equalsIgnoreCase("F")==false);
		 
		 int height= Integer.parseInt(JOptionPane.showInputDialog("Enter your height in centimeters."));


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
