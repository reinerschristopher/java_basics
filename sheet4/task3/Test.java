package sheet4.task3;


public class Test {
	public static void main(String[] args) {
		Student student= new Student();
		
		//------ a) ------
		Cauliflower essen1 = new Cauliflower();
		student.eat(essen1);
		
		//------ b) ------
		Spaghetti essen2 = new Spaghetti();
		student.eat(essen2);
		
		//------ c) ------
		Food essen = new Cauliflower();
		student.eat(essen);
	}
}

/* Thema: Dynamisches Binden
 * Ausgaben:
 * 
 * Bemerckung: Der statische Datentyp bestimmt �ber das like / don�t like und der dynamische dar�ber welches Essen.
 * 
 * a) "I don�t like Blumenkohl an Gorgonzolaso�e"
 * 	denn der statische und dynamische Datentyp von essen1 ist Cauliflower.
 * 		F�r diesen statischen Datentyp existiert in der Klasse Student eine spezifizierte eat() Funktion, welche dann auch durch dynamisches Binden aufgerufen wird.
 *		Das food.getmeal() in eat() ist das aus der Klasse Cauliflower da der dynamische Datentyp Cauliflower ist.
 *
 * b) "I like Spaghetti Bologneser Art"
 *  denn statische und dynamische Datentyp von essen2 ist Spaghetti.
 *  	F�r diesen statischen Datentyp existiert in der Klasse Student keine spezifizierte eat() Funktion, weshalb dann die allgeine Funktion f�r Food aufgerufen wird.
 * 		Das food.getmeal() in eat() ist das aus der Klasse Spaghetti da der dynamische Datentyp Spaghetti ist.
 * 
 * c) "I like Blumenkohl an Gorgonzolaso�e"
 *  denn statische von essen ist Food und der dynamische Datentyp ist Cauliflower.
 *  	F�r diesen statischen Datentyp existiert in der Klasse Student eine spezifizierte eat() Funktion (Die Allgemeine f�r Food), welche dann auch aufgerufen wird.
 * 		Das food.getmeal() in eat() ist das aus der Klasse Cauliflower da der dynamische Datentyp Cauliflower ist.
 * 
 * 
 */