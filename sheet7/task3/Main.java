package sheet7.task3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("Geben sie bitte die Zahl 5 ein.");	//Begrüßung
	
			Scanner scanner = new Scanner(System.in);				//Einlesen der Zahl
			int number = scanner.nextInt();
			scanner.close();
			
			if(number>5) throw new NumberTooBigException();
			if(number<5) throw new NumberTooSmallException();
		}
		
		catch(NumberTooBigException big) {
			System.out.println(big.getMessage());
		}
		
		catch(NumberTooSmallException small) {
			System.out.println(small.getMessage());
		}
	}
}
