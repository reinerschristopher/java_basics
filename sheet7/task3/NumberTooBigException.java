package sheet7.task3;

public class NumberTooBigException extends RuntimeException {
	
	NumberTooBigException() {
		super("Die eingegebene Zahl ist größer als 5.");
	}
}
