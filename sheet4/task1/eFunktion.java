package sheet4.task1;

public class eFunktion implements Evaluierbar {

	@Override
	public String getName() {
		return "sheet4.task1.eFunktion";
	}

	@Override
	public long evaluate(int x) {
		return Math.round(Math.exp(x));
	}

}
