package sheet5.task2;

class Sphere extends Shape {
	private double radius;

	Sphere(double x, double y, double z, double radius) {
		super(x, y, z);
		this.radius = Math.abs(radius);
	}

	@Override
	Shape scaleShape(double a){
		a = (a < 0) ? -a : a;
		this.radius *= a;
		return this;
	}

	@Override
	double calcVolume(){
		return 4/3.0 * Math.PI * radius * radius * radius;
	}
}
