package sheet5.task3;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		double[] array = {3.2, 1.5, 9.0, 4.3, 2.9, 1.2, 3.3, 1.2};
		System.out.println("The array is as follows:");
		System.out.println(Arrays.toString(array));
		array = Sort.sortArray(array);
		System.out.println("The sorted array is as follows:");
		System.out.println(Arrays.toString(array));
	}

}
