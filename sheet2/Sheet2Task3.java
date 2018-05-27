package sheet2;

import java.util.Scanner;

public class Sheet2Task3 {
	
	public static void main (String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
	     
	    int z1,z2;
	    
	    // Einlesen der Zahlen
	    System.out.println("Bitte die zwei Zahlen eingeben deren ggT bestimmt werden soll:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();

	    //Test ob a und b nat�rliche Zahlen und groesser Null sind
	    if ((a<0)||(b<0)) {
	        System.out.println("Fehler!");
	    }
	    else {
	    	//Eigentlicher Algorithmus
	    	while (a != b) {
	    		if (a > b) {
	            	a = a-b;
	            }
	            else {      
	            	b = b-a;   
	            }
	    	}  
	       // Ausgabe vom Ergebnis
	       System.out.println("Der groesste gemeinsame Teiler ist: " + a);
	    }
	}
}
