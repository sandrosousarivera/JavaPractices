package AgeCheckerIfConditional;
import javax.swing.*;
import java.util.*;

public class GeometricFormAreaCalculator {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Choose a geometrical figure: \n1: Square  \n2: Rectangle  \n3: Triangle  \n4: Circle");
		
		while (!Input.hasNextInt()) {
			
			System.out.println("Enter a number, please.");
			
			Input.nextLine();
		}
		
		int Figure = Input.nextInt();
		
		switch(Figure){
		
		case 1:
			
			int Side = Integer.parseInt(JOptionPane.showInputDialog("Enter the side of the square"));
			
			System.out.println("The area of your square is " + Math.pow(Side, 2));
			
			break;
			
		case 2:
			
			int Height = Integer.parseInt(JOptionPane.showInputDialog("Enter the Height of the Rectangle"));
			
			int Base = Integer.parseInt(JOptionPane.showInputDialog("Enter the Base of the Rectangle"));
			
			System.out.println("The area of your Rectangle is " + Base*Height);
		
		case 3:
			
			
			Height = Integer.parseInt(JOptionPane.showInputDialog("Enter the Height of the Rectangle"));
			
			Base = Integer.parseInt(JOptionPane.showInputDialog("Enter the Base of the Rectangle"));
			
			System.out.println("The area of your triangle is " + (Base*Height)/2);
			
		case 4:
			
			Integer Radius = Integer.parseInt(JOptionPane.showInputDialog("Enter the Radius of your circle"));
			
			System.out.print("Enter the radius of your circle ");
			
			System.out.printf("%1.2f", Math.PI * (Math.pow(Radius, 2)));
			
			break;
			
		default:
			
			System.out.println("That option is not correct.");
			
			
		}
		
	}
	
}
