package chuwa3926.Coding.Q11;

public class TestShapes {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle("Red", 5, 3);
        shapes[1] = new Circle("Blue", 2);

        for (Shape s : shapes) {
            System.out.println("Area: " + s.getArea());
            System.out.println("Perimeter: " + s.getPerimeter());
            System.out.println("Color: " + s.getColor());

            if (s instanceof Drawable) {
                ((Drawable) s).draw();
            }

            System.out.println("-----------------");
        }
    }
}