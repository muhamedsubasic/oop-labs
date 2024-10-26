package Lab4.shape;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Green", Shape.FillType.FILLED, 5);
        Rectangle rectangle = new Rectangle("Red", Shape.FillType.NOT_FILLED, 4, 5);

        ArrayList<Shape> shapes = new ArrayList<>() {{
            add(circle);
            add(rectangle);
        }};

        for (Shape shape : shapes) {
            shape.displayInfo();
            System.out.println();
        }
    }
}