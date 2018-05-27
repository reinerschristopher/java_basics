package sheet4.task1;

import java.util.Scanner;

public class Casino {
	
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SpieleManager casino = new SpieleManager(50);
		System.out.println("Your current balance is: " + casino.getKapital() + "�.");
		System.out.println("Which game would you like to play?");
		System.out.println("You have the following options: 'sheet4.task1.HochTief' or 'sheet4.task1.FunktionswerteRaten'.");
		System.out.println("Please enter 'H' if you want to play sheet4.task1.HochTief, 'F' if you want to play sheet4.task1.FunktionswerteRaten or enter a different letter in order to leave the game.");
		String input = scanner.nextLine();
		
		while(input.equalsIgnoreCase("H") || input.equalsIgnoreCase("F")) {
			if(input.equalsIgnoreCase("H")) casino.starteSpiel(new HochTief());
			else casino.starteSpiel(new FunktionswerteRaten());
			System.out.println("Please enter 'H', 'F' or enter a different letter in order to leave the game.");
			input = scanner.next();
		}
		
		scanner.close();
		System.out.println("Thank you for playing.");
		

	}

}
