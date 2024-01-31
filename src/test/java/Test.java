public class Test {
    public static void main(String[] args) {
        Square square = new Square(5.5);
        double result1 = square.squareArea();
        System.out.println("Square = " + result1);

        Triangle triangle = new Triangle(10, 5.7, 2.5);
        double result3 = triangle.trianglePerimeter();
        System.out.println("Triangle = " + result3);

        Rectangle rectangle = new Rectangle(5, 10);
        double result4 = rectangle.rectPerimeter();
        System.out.println("Rectangle = " + result4);
    }
}
