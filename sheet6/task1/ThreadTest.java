package sheet6task1;

public class ThreadTest {
	
	public static void main(String args[]){
		Thread t1 = new Thread(new DateCommand());
		t1.start();
		Thread t2 = new Thread(new CounterCommand());
		t2.start();
		}
}


/* Aufgabe 1
 * ------------------------------------------ a) ------------------------------------------------
 * 1.Möglichkeit: Leite eine KLasse von der Klasse Thread ab und überschreibe die Funktion run()
 * 		-> Vorteil: Einfacher zu verwenden
 * 
 * 2.Möglichkeit: Klasse die das Interface Runnable implementiert und überschreibe die Funktion run()
 * 		-> Vorteil: Deutlich flexibler, keine Beschränkung durch Einfachvererbung und kann von beliebigen Oberklassen von Thread erben
 * 
 * Aufruf in beiden Fällen, dann mittels einer Instanz der Klasse und .start()
 * 	
 * ------------------------------------------ b) ------------------------------------------------
 * Ausgabe sind zunächst die Zahlen null bis neun und anschließend zehn mal das aktuelle Datum
 * 
 * ------------------------------------------ c) ------------------------------------------------
 * Ausgabe: 0, 2018-06-07, 2018-06-07, 1, 2018-06-07, 2, 3, 4, 5, 2018-06-07, 6, 7, 2018-06-07, 2018-06-07, 8, 9, 2018-06-07, 2018-06-07, 2018-06-07, 2018-06-07
 * Erklärung: Die beiden Threads arbeiten parallel (auch zum Hauptthread) und durch die Verzögerung werden sie im Gegensatz zur b) auch teilweise gleichzeitig ausgeführt.
 * 				Die Ausgabe ist bei jeder erneuten Ausführung anders.
 */