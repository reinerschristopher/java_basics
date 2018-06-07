package sheet5.task1;

public class Test {

	public static void main(String[] args) {
		Angestellter a = new Angestellter("Christopher", "Reiners", 20, 1000);
		Praktikant p = new Praktikant("Tobias","Bork",20);
		a.erhöheGehalt();
		a.erhöheAlter();
		p.erhöheGehalt();
		p.erhöheAlter();
		System.out.println(a.getVorname() + " " + a.getNachname() + " ist " + a.getAlter() + " Jahre alt und verdient " + a.getGehalt() + "€.");
		System.out.println(p.getVorname() + " " + p.getNachname() + " ist " + p.getAlter() + " Jahre alt und verdient " + p.getGehalt() + "€.");
	}

}
