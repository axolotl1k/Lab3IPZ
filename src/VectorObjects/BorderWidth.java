package VectorObjects;

/**
 * The BorderWidth class is a decorator that adds a specific width to the border of a graphical object.
 * This class allows the user to define how thick the object's border will be.
 */
public class BorderWidth extends ObjectDecorator {
    private int borderWidth;

    /**
     * Constructs a BorderWidth decorator with a specified width for the border.
     *
     * @param decoratedObject The object to be decorated.
     * @param borderWidth The width of the border in pixels.
     */
    public BorderWidth(Object decoratedObject, int borderWidth) {
        super(decoratedObject);
        this.borderWidth = borderWidth;
    }

    /**
     * Draws the object and adds the border width to the rendering process.
     *
     * @return A string indicating that the border width has been applied, along with the base drawing.
     */
    @Override
    public String draw() {
        return "\nAdded border width" + super.draw();
    }

    /**
     * Provides a description of the object with the added border width.
     *
     * @return A detailed string description of the object including the border width.
     */
    @Override
    public String getDescription() {
        return super.getDescription() + "\nBorder width: " + borderWidth + " px";
    }
}

