package sheet3.task3;

public class Sheet3Task3 {
	public static void main(String[] args) {
		Stereoanlage s = new Stereoanlage();
		Playable pl = new CD();
		s.play(pl);		//Stelle 1
		pl = new Kassette();
		s.play(pl);		//Stelle 2
	}
	
	/*
	 * Ausgabe an Stelle 1: "O Tannenbaum..."
	 * Ausgabe an Stelle 2: "Alle meine Entchen..."
	 * 
	 * Erkl�rung: 
	 * An Stelle 1 ist pl ein Objekt der Klasse sheet3.task3.CD.
	 * An Stelle 2 wird pl ersetzt durch ein Objekt der Klasse sheet3.task3.Kassette.
	 * Nachrichten werden in Java dynamisch gebunden, d.h. die Bestimmung des auszuf�hrenden Codes 
	 * geschieht erst zur Laufzeit in Abh�ngigkeit vom Empf�nger-Objekt.
	 * Es wird also jeweils die Methode des Empf�nger-Objektes ausgef�hrt.
	 * Dementsprechend ergeben sich beim Aufruf an Stelle 1 und Stelle 2 zwei verschiedene Ausgaben.
	 * 
	 */
}
