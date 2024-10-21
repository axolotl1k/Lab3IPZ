package VectorObjects;

/**
 * The Object interface defines the basic contract for any graphical object in the vector graphics editor.
 * It specifies two methods: one for rendering the object, and another for providing a description of the object.
 */
public interface Object {
    /**
     * Draws the graphical object.
     *
     * @return A string representing the rendering process of the object.
     */
    String draw();

    /**
     * Returns a description of the graphical object.
     * This method provides details about the object's attributes such as position, color, or size.
     *
     * @return A string describing the object and its attributes.
     */
    String getDescription();
}

