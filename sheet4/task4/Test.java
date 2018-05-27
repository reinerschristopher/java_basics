package sheet4.task4;

public class Test {
	public static void main(String[] args) {
		Person max = new Person();
		Person maxim = new Person();
		maxim.setVorname("maxim");
		Person christopher = new Person("Reiners", "Christopher", 53111, "Koelnstraße", 712);
		Person christopher2 = new Person("Reiners", "Christopher", 53111, "Joelnstraße", 712);
		System.out.println(christopher.compareTo(christopher2));
		Person tobias = new Person("Bork", "tobias", 53111, "Koelnstraße", 72);
		Person tobias2 = new Person("Bork", "Tobias", 53111, "Koelnstraße", 71);
		Person[] datenbank = {max, maxim, christopher, tobias, tobias2};
		System.out.println(((Person) FindMin.findMin(datenbank)).getVorname());
	}
}
