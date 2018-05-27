package sheet4.task4;

public class FindMin {

	public static Comparable findMin(Comparable[] x){
		Comparable min = x[0];
		for (int i = 1; i < x.length; i++) {
			if (x[i].compareTo(min) < 0) min = x[i];
		}
		return min;
	}
}