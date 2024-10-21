package VectorObjects;

/**
 * The ObjectDecorator abstract class is a base class for all decorators that modify graphical objects.
 * It implements the Object interface and allows decorators to extend the functionality of objects dynamically.
 */
public abstract class ObjectDecorator implements Object {
    protected Object decoratedObject;

    /**
     * Constructs a decorator for the specified object.
     *
     * @param decoratedObject The object to be decorated.
     */
    public ObjectDecorator(Object decoratedObject) {
        this.decoratedObject = decoratedObject;
    }

    /**
     * Draws the decorated object by invoking the decorated object's draw method.
     *
     * @return A string representing the rendering of the decorated object.
     */
    @Override
    public String draw() {
        return decoratedObject.draw();
    }

    /**
     * Provides a description of the decorated object by invoking the decorated object's getDescription method.
     *
     * @return A string describing the decorated object and its attributes.
     */
    @Override
    public String getDescription() {
        return decoratedObject.getDescription();
    }
}

