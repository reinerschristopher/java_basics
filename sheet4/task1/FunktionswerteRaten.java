package sheet4.task1;

import java.util.concurrent.ThreadLocalRandom;

public class FunktionswerteRaten extends Spiel {

	public FunktionswerteRaten() {
		super("sheet4.task1.FunktionswerteRaten");
	}

	@Override
	protected int spiele() {
		Evaluierbar f;
		int random = ThreadLocalRandom.current().nextInt(0,2);
		if(random == 0) {
			System.out.println("The randomly chosen function is: f(x) = e^x");
			f = new eFunktion();
		}
		else {
			System.out.println("The randomly chosen function is: f(x) = 2*x + 5");
			f = new LineareFunktion();
		}
		
		/*
		 * An dieser Stelle wird nur eine Zufallszahl zwischen 1 und 40 generiert,
		 * da sonst die resultierenden Zahlen bei der e-Funktion nicht mehr im Darstellungsbereich
		 * eines long-Datentyps liegen.
		 */
		int x = ThreadLocalRandom.current().nextInt(1,41);
		System.out.println("The random x-value is: " + x);
		
		System.out.println("Now try to guess the rounded y-value.");
		long guess = Casino.scanner.nextLong();
		
		long y = f.evaluate(x);
		
		if(Math.abs(y - guess) <= 5 ) {
			System.out.println("You won " + (x+super.getEinsatz()) + "�! The correct y-value is " + y + ". ");
			return x+super.getEinsatz();
		}
		
		System.out.println("You lost! The correct y-value is " + y + ".");
		
		return 0;
	}

}
