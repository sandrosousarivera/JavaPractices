package Default;

import javax.swing.JOptionPane;

public class PasswordCheckerWhileLoop {

	public static void main(String[] args) {

		String password = "Sandro";
		
		String access = "";
		
		while(password.equals(access)==false) {
			
			access = JOptionPane.showInputDialog("Enter the password, please");
			
			if (password.equals(access)==false){
				
				System.out.println("Wrong password, please, try again");
				
			}
		}
		
		System.out.println("Correct password, access granted.");
		
	}

}
