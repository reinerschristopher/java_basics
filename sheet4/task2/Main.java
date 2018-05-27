package sheet4.task2;

public class Main {

	public static void main(String[] args) {
		Auto auto1 = new Lastwagen();
		System.out.println(auto1.reifen); // Ausgabe 1)
		System.out.println(((Lastwagen) auto1).reifen); // Ausgabe 2)
		System.out.println(auto1.getReifen()); // Ausgabe 3)
		System.out.println(((Lastwagen) auto1).getReifen()); // Ausgabe 4)
	}
	
	/*
	 * Aufgabenteil a)
	 * 
	 * Allgemeine Beobachtung: 
	 * Die Variable auto1 hat beim Anlegen in Zeile 5 den statischen Datentyp sheet4.task2.Auto und den dynamischen Datentyp sheet4.task2.Lastwagen.
	 * Bei der Konvertierung ((sheet4.task2.Lastwagen) auto1) wird der statische Datentyp zu sheet4.task2.Lastwagen ge�ndert.
	 * Der dynamische Datentyp von auto1 ist also an allen Stellen ein sheet4.task2.Lastwagen.
	 * 
	 * Ausgabe 1:	4	(Bei Variablen bestimmt der statische Datentyp - hier sheet4.task2.Auto - die Implementierung)
	 * Ausgabe 2:	8	(Der statische Datentyp ist aufgrund der Konvertierung ein sheet4.task2.Lastwagen)
	 * Ausgabe 3:	8	(Bei Instanzmethoden bestimmt der dynamische Datentyp - hier sheet4.task2.Lastwagen - die Implementierung)
	 * Ausgabe 4:	8	(Hier ist sowohl statischer als auch dynamischer Datentyp ein sheet4.task2.Lastwagen,
	 * 					weswegen die Methode der Oberklasse �berschrieben wird)
	 * 
	 */
	
	/*
	 * Aufgabenteil b)
	 * 
	 * Ausgabe 1:	4	(Bei Variablen bestimmt der statische Datentyp - hier sheet4.task2.Auto - die Implementierung)
	 * Ausgabe 2:	8	(Der statische Datentyp ist aufgrund der Konvertierung ein sheet4.task2.Lastwagen)
	 * Ausgabe 3:	4	(Die Klasse sheet4.task2.Lastwagen erbt von der Klasse sheet4.task2.Auto.
	 * Ausgabe 4:	4	Da es keine getReifen Methode in sheet4.task2.Lastwagen gibt, wird automatisch die Methode der Oberklasse aufgerufen)
	 * 
	 */
	
	/*
	 * Aufgabenteil c)
	 * 
	 * Ausgabe 1:	4	(Bei Variablen bestimmt der statische Datentyp - hier sheet4.task2.Auto - die Implementierung)
	 * Ausgabe 2:	8	(Der statische Datentyp ist aufgrund der Konvertierung ein sheet4.task2.Lastwagen)
	 * Ausgabe 3:	Error	(Der statische Datentyp - hier sheet4.task2.Auto - definiert, was aufgerufen werden darf.
	 * 						sheet4.task2.Auto hat aber keine Methode getReifen)
	 * Ausgabe 4:	8	(Aufgrund der Konvertierung ist der statische Datentyp ein sheet4.task2.Lastwagen,
	 * 					weswegen die Methode getReifen hier aufgerufen werden darf)
	 * 
	 */

}
