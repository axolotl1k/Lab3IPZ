package VectorObjects;

/**
 * The Square class represents a square element in a vector graphics editor.
 * It allows the user to define the position and dimensions of the square.
 */
public class Square implements Object {
    private int x;
    private int y;
    private int width;
    private int height;

    /**
     * Constructs a new Square object with the specified position and dimensions.
     *
     * @param width The width of the square.
     * @param height The height of the square.
     * @param x The x-coordinate of the square's top-left corner.
     * @param y The y-coordinate of the square's top-left corner.
     */
    public Square(int width, int height, int x, int y) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Renders the square on the canvas.
     * This method is responsible for outputting the drawing logic for the square.
     *
     * @return A string indicating that a square has been added to the canvas.
     */
    @Override
    public String draw() {
        return "\nAdded square";
    }

    /**
     * Returns a description of the square, including its position and dimensions.
     *
     * @return A detailed string describing the square's position, width, and height.
     */
    @Override
    public String getDescription() {
        return "Square located at (" + x + ", " + y + ") with width: " + width + " and height: " + height;
    }
}

