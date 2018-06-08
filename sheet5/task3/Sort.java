package sheet5.task3;

class Sort {
	static double[] sortArray(double[] array) {
		for(int i = 0; i < array.length; i++) {
			int indexMinValue = i;
			for(int j = i; j < array.length; j++) {
				if(array[j] < array[indexMinValue]) {
					indexMinValue = j;
				}
			}
			double tmp = array[i];
			array[i] = array[indexMinValue];
			array[indexMinValue] = tmp;
		}
		
		return array;
	}
}
