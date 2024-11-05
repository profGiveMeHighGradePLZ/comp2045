/**
 * Rectangle class
 */
public class Rectangle extends Shape {
	private double width; //width of the rectangle
	private double length; //length of the rectangle

	/**
	 * default constructor
	 */
	public Rectangle() {
		this("", 1, 1);
	}

	/**
	 * constructor to create a rectangle with the specified name, width and length
	 * @param name - name of the rectangle
	 * @param width - width of the rectangle
	 * @param length - lenght of the rectangle
	 */
	public Rectangle(String name, double width, double length) {
		super(name);
		this.width = width;
		this.length = length;
	}

	/**
	 *
	 * @return the area of the rectangle
	 */
	public double area() {
		return width * length;
	}

	/**
	 *
	 * @return the perimeter of the rectangle
	 */
	public double perimeter() {
		return (width + length) * 2;
	}

	/**
	 *
	 * @return the string representation of the rectangle
	 */
	public String toString() {
		return "Rectangle: " + super.getName() + "\nWidth: " + width + "\nLength: " + length;
	}
}
