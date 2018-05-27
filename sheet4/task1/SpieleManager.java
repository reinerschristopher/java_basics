package sheet4.task1;

public class SpieleManager {
	public SpieleManager(int kapital) {
		this.kapital = kapital;
	}
	
	public void starteSpiel(Spiel sp) {
		System.out.println("How much would you like to bet?");
		int einsatz = Casino.scanner.nextInt();
		while(this.kapital < einsatz || einsatz < 0) {
			if(einsatz < 0) System.out.println("Your bet has to be positive.");
			else System.out.println("You do not have enough money. Your current balance is: " + this.kapital + "�.");
			System.out.println("Please place your bet:");
			einsatz = Casino.scanner.nextInt();
		}
		sp.setEinsatz(einsatz);
		this.kapital -= sp.getEinsatz();
		this.kapital += sp.spiele();
		System.out.println("\nYour balance is now: " + getKapital() + "�.");
	}
	
	public int getKapital() {
		return this.kapital;
	}
	
	private int kapital;
}
