//You are not allowed to modify this program

/**
 * Shape class
 */
public class Shape {
	private String name; //name of the shape

	/**
	 * default constructor
	 */
	public Shape() {
		this("");
	}

	/**
	 * constructor to create a shape with the specified name
	 * @param name - name of the shape
	 */
	public Shape(String name) {
		this.name = name;
	}

	/**
	 *
	 * @return the name of this shape
	 */
	public String getName() {
		return this.name;
	}

	/**
	 *
	 * @return the string representation of this shape
	 */
	public String toString() {
		return "Shape: " + this.name;
	}
}
