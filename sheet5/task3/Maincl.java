package sheet5task3;

import java.io.IOException;

public class Maincl {
	public static void main(String[] args) throws IOException {
		Hamburger c = new Hamburger();
		c.eat();
		}
}

/* Aufagbe 3:
 * 
 * a) Kompiliert, da eat() die Funktion eat() throws IOExeption überschreiben kann.
 * 
 * b) Kompiliert nicht, da Exception "Exception" nicht mit der in Fastfood.eat() festgelegten Exeption "IOExeption" kompatible ist.
 * 
 * c) Kompiliert, da eat() und eat(int y) aufgrund der unterschiedlichen Signatur verschiedenen Funktionen sind.
 * 
 * d) Kompiliert, da "FileNotFoundException" eine Unterklasse von "IOExeption" ist.
 * 
 * e) Kompiliert, da
 * 
 */