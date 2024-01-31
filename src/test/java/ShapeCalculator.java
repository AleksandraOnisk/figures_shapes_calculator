public class ShapeCalculator {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,10);
        Shape square = new Square(2);
        Shape triangle = new Triangle(5,10,15);

        System.out.println("Rectangle = " + rectangle.calculateArea());
        System.out.println("Square = " + square.calculateArea());
        System.out.println("Triangle = " + triangle.calculateArea());
    }
}
