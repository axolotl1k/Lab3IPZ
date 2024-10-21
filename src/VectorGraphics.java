import VectorObjects.*;
import VectorObjects.Object;

import java.util.ArrayList;

/**
 * The VectorGraphics class demonstrates the use of different graphical objects and decorators.
 * It creates circles and squares, adds borders, shadows, and colors, and renders them to show
 * how dynamic styling can be applied to vector graphics.
 */
public class VectorGraphics {
    public static void main(String[] args) {
        // Array of basic graphical objects
        Object[] objects = {
                new Circle(4, 6, 8),
                new Square(4, 7, 12, 10)
        };

        // ArrayList to store decorated objects
        ArrayList<Object> decoratedObjects = new ArrayList<>();

        // Applying different decorators to the graphical objects
        decoratedObjects.add(new BorderStyle(objects[0], "="));
        decoratedObjects.add(new BorderWidth(objects[1], 3));
        decoratedObjects.add(new BorderColor(decoratedObjects.get(1), "blue"));
        decoratedObjects.add(new Shadow(decoratedObjects.get(1)));
        decoratedObjects.add(new FillColor(new Circle(3, 5, 9), "green"));

        // Looping through each decorated object to draw and describe it
        for (Object o : decoratedObjects){
            System.out.println(o.draw());
            System.out.println(o.getDescription());
        }
    }
}


