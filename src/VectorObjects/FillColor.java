package VectorObjects;

/**
 * The FillColor class is a decorator that adds a fill color to a graphical object.
 * This class allows the user to set the fill color of an object dynamically.
 */
public class FillColor extends ObjectDecorator {
    private String color;

    /**
     * Constructs a FillColor decorator with a specified fill color for the object.
     *
     * @param decoratedObject The object to be decorated.
     * @param color The fill color to apply to the object.
     */
    public FillColor(Object decoratedObject, String color) {
        super(decoratedObject);
        this.color = color;
    }

    /**
     * Draws the object and adds the fill color to the rendering process.
     *
     * @return A string indicating that the fill color has been applied, along with the base drawing.
     */
    @Override
    public String draw() {
        return "\nAdded fill color" + super.draw();
    }

    /**
     * Provides a description of the object with the added fill color.
     *
     * @return A detailed string description of the object including the fill color.
     */
    @Override
    public String getDescription() {
        return super.getDescription() + "\nFill color: " + color;
    }
}

