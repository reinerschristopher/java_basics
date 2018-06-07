package sheet5.task2;

import java.util.Arrays;

abstract class Shape {
	double[] position = new double[3];

	Shape(double x, double y, double z) {
		this.position[0] = x;
		this.position[1] = y;
		this.position[2] = z;
	}

	Shape shiftShape(double x, double y, double z){
		this.position[0] = x;
		this.position[1] = y;
		this.position[2] = z;
		return this;
	}

	abstract Shape scaleShape(double a);

	abstract double calcVolume();

	@Override
	public String toString() {
		return "(" + this.getClass().getSimpleName() +
				", " + this.calcVolume() +
				", " + Arrays.toString(position) +
				")";
	}
}
