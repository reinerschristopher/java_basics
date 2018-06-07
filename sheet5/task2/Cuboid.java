package sheet5.task2;

class Cuboid extends Shape {
	// position field is the front left bottom
	// representing the length of the edges
	private double width;
	private double height;
	private double depth;

	public Cuboid(double x, double y, double z, double width, double height, double depth) {
		super(x, y, z);
		this.width = Math.abs(width);
		this.height = Math.abs(height);
		this.depth = Math.abs(depth);
	}

	@Override
	Shape scaleShape(double a) {
		a = (a < 0) ? -a : a;
		this.width *= a;
		this.height *= a;
		this.depth *= a;
		return this;
	}

	@Override
	double calcVolume() {
		return width * height * depth;
	}
}
