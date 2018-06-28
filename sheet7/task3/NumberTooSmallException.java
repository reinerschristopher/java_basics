package sheet7.task3;

public class NumberTooSmallException extends Exception {
	
	NumberTooSmallException() {
		super("Die eingegebene Zahl ist kleiner als 5.");
	}
}
