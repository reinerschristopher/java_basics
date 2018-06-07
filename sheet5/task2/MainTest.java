package sheet5.task2;

import java.util.ArrayList;

class MainTest {
	public static void main(String[] args) {
		ArrayList<Shape> formen = new ArrayList<>();

		Shape kugel1 = new Sphere(1,3,-2,3.4);
		formen.add(kugel1);
		formen.add(kugel1);

		Sphere kugel2 = new Sphere(0,-300,-0.2,2);
		formen.add(kugel2);

		Shape quader1 = new Cuboid(-1,23,1,0.01,2000,33);
		formen.add(quader1);

		Cuboid quader2 = new Cuboid(0,0,0,2,2,2);
		formen.add(quader2);
		quader2.scaleShape(-30);
		formen.add(quader2);

		for (Shape form : formen) {
			System.out.println(form);
		}
	}
}
