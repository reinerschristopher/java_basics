package sheet4.task1;

import java.util.concurrent.ThreadLocalRandom;

public class HochTief extends Spiel {

	public HochTief() {
		super("sheet4.task1.HochTief");
	}
	
	@Override
	protected int spiele() {
		System.out.println("In this game you will have to guess a number between 0 and 100.");
		System.out.println("You will have 5 guesses before you will loose the game.");
		
		int random = ThreadLocalRandom.current().nextInt(0,101);
		int count = 1;
		int guess = 0;
		
		while(count <= 5) {
			System.out.println("Please enter your " + count + ". guess:");
			guess = Casino.scanner.nextInt();
			if(guess == random) {
				System.out.println("\nCongratulations, you won " + 2 * super.getEinsatz() + "�! You guessed right, " + random + " is the random number.");
				return 2 * super.getEinsatz();
			}
			else if(guess < random && count != 5) {
				System.out.println("\nThe random number is greater than " + guess + ".");
			}
			else if(guess > random && count != 5){
				System.out.println("\nThe random number is less than " + guess + ".");
			}

			count++;
		}
		
		System.out.println("\nYou lost! The random number is " + random + ".");
		return 0;
	}

}
