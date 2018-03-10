public class Rectangle1 extends GeometricObject1 {
	private double width;
	private double height;

	public Rectangle1() {
	}

	public Rectangle1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}

	/** Return height */
	public double getHeight() {
		return height;
	}

	/** Set a new height */
	public void setHeight(double height) {
		this.height = height;
	}

	/** Return area */
	public double getArea() {
		return width * height;
	}

	/** Return perimeter */
	public double getPerimeter() {
		return 2 * (width + height);
	}
}