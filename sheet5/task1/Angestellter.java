package sheet5.task1;

class Angestellter {
	private String vorname;
	private String nachname;
	private int alter;
	private int gehalt;
	
	Angestellter(String vorname, String nachname, int alter, int gehalt) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}
	
	int getAlter()	{
		return this.alter;
	}
	
	int getGehalt() {
		return this.gehalt;
	}
	
	void erhöheGehalt() {
		this.gehalt += 100;
	}
	
	void erhöheAlter() {
		this.alter++;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}
}
