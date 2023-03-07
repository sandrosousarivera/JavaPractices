package SimpleCalculatorJOptionPane;

import javax.swing.*;

public class SquareRootCalculator {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Enter a number");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.print("The square root of " + num1 + " is ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));
		
	}
	
}
