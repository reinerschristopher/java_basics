package sheet4.task1;

public class LineareFunktion implements Evaluierbar {

	@Override
	public String getName() {
		return "sheet4.task1.LineareFunktion";
	}

	@Override
	public long evaluate(int x) {
		return 2*x + 5;
	}

}
