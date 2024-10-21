package VectorObjects;

/**
 * The BorderStyle class is a decorator that adds a specific style to the border of a graphical object.
 * Styles such as solid, dashed, or dotted can be applied to the object's border.
 */
public class BorderStyle extends ObjectDecorator {
    private String borderStyle;

    /**
     * Constructs a BorderStyle decorator with a specified style for the border.
     *
     * @param decoratedObject The object to be decorated.
     * @param borderStyle The style to apply to the border (e.g., solid, dashed, dotted).
     */
    public BorderStyle(Object decoratedObject, String borderStyle) {
        super(decoratedObject);
        this.borderStyle = borderStyle;
    }

    /**
     * Draws the object and adds the border style to the rendering process.
     *
     * @return A string indicating that the border style has been applied, along with the base drawing.
     */
    @Override
    public String draw() {
        return "\nAdded border style" + super.draw();
    }

    /**
     * Provides a description of the object with the added border style.
     *
     * @return A detailed string description of the object including the border style.
     */
    @Override
    public String getDescription() {
        return super.getDescription() + "\nBorder style: \"" + borderStyle + "\"";
    }
}

