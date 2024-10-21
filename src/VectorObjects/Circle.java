package VectorObjects;

/**
 * The Circle class represents a circle element in a vector graphics editor.
 * This class allows the user to define the circle's position, radius, and other attributes.
 */
public class Circle implements Object {
    private int radius;
    private int x;
    private int y;

    /**
     * Constructs a new Circle object with the specified radius and position.
     *
     * @param radius The radius of the circle.
     * @param x The x-coordinate of the circle's center.
     * @param y The y-coordinate of the circle's center.
     */
    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    /**
     * Renders the circle on the canvas.
     * This method is responsible for outputting the drawing logic for the circle.
     *
     * @return A string indicating that a circle has been added to the canvas.
     */
    @Override
    public String draw() {
        return "\nAdded circle";
    }

    /**
     * Returns a description of the circle, including its position and radius.
     *
     * @return A detailed string describing the circle's position and radius.
     */
    @Override
    public String getDescription() {
        return "Circle located at (" + x + ", " + y + ") with radius: " + radius;
    }
}

