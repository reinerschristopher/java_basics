package sheet4.task4;

public class Person implements Comparable<Person> {

	private String name;
	private String vorname;
	private int postleizahl;
	private String strasse;
	private int hausnummer;

	public Person() {
		this.name = "Mustermann";
		this.vorname = "Max";
		this.postleizahl = 12345;
		this.strasse = "Abcstrasse";
		this.hausnummer = 123;
	}

	public Person(String name, String vorname, int postleizahl, String strasse, int hausnummer) {
		this.name = name;
		this.vorname = vorname;
		this.postleizahl = postleizahl;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	@Override
	/*
	 * Compares this object with the specified object for order.  Returns a
	 * negative integer, zero, or a positive integer as this object is less
	 * than, equal to, or greater than the specified object.
	 */
	public int compareTo(Person other){
		if(! this.name.equalsIgnoreCase(other.name)) return this.name.compareToIgnoreCase(other.name);
		if(! this.vorname.equalsIgnoreCase(other.vorname)) return this.vorname.compareToIgnoreCase(other.vorname);
		if(  this.postleizahl != other.postleizahl)  return this.postleizahl - other.postleizahl;
		if(! this.strasse.equalsIgnoreCase(other.strasse)) return this.strasse.compareToIgnoreCase(other.strasse);
		if(  this.hausnummer != other.hausnummer) return this.hausnummer - other.hausnummer;
		else return 0;
	}

	public static void main(String[] args) {
		Person max = new Person();
		Person maxim = new Person();
		System.out.println(maxim.compareTo(max));
		System.out.println(max.hausnummer);
	}
}