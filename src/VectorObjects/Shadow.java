package VectorObjects;

/**
 * The Shadow class is a decorator that adds a shadow effect to a graphical object.
 * This class allows you to dynamically apply shadowing to any object in the vector graphics editor.
 */
public class Shadow extends ObjectDecorator {

    /**
     * Constructs a Shadow decorator for the specified object.
     *
     * @param decoratedObject The object to be decorated with a shadow.
     */
    public Shadow(Object decoratedObject) {
        super(decoratedObject);
    }

    /**
     * Draws the object and adds the shadow to the rendering process.
     *
     * @return A string indicating that the shadow has been applied, along with the base drawing.
     */
    @Override
    public String draw() {
        return "\nAdded shadow" + super.draw();
    }

    /**
     * Provides a description of the object with the added shadow.
     *
     * @return A detailed string description of the object including the shadow effect.
     */
    @Override
    public String getDescription() {
        return super.getDescription() + "\nObject has a shadow";
    }
}

