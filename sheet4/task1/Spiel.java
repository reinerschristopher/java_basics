package sheet4.task1;

public abstract class Spiel {
	public Spiel(String name) {
		this.name = name;
	}
	
	protected String getName() {
		return this.name;
	}
	
	protected void setEinsatz(int einsatz) {
		this.einsatz = einsatz;
	}
	
	protected int getEinsatz() {
		return this.einsatz;
	}
	
	protected abstract int spiele();
	
	private String name;
	private int einsatz;
}
