package VectorObjects;

/**
 * The BorderColor class is a decorator that adds a border color to a graphical object.
 * This class allows you to dynamically set and render the border color of an object.
 */
public class BorderColor extends ObjectDecorator {
    private String borderColor;

    /**
     * Constructs a BorderColor decorator with a specified color for the border.
     *
     * @param decoratedObject The object to be decorated.
     * @param borderColor The color to apply to the border.
     */
    public BorderColor(Object decoratedObject, String borderColor) {
        super(decoratedObject);
        this.borderColor = borderColor;
    }

    /**
     * Draws the object and adds the border color to the rendering process.
     *
     * @return A string indicating that the border color has been applied, along with the base drawing.
     */
    @Override
    public String draw() {
        return "\nAdded border color" + super.draw();
    }

    /**
     * Provides a description of the object with the added border color.
     *
     * @return A detailed string description of the object including the border color.
     */
    @Override
    public String getDescription() {
        return super.getDescription() + "\nBorder color: " + borderColor;
    }
}


