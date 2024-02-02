public class ShapeCalculator {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,10);
        Shape square = new Square(2);
        Shape triangle = new Triangle(5,10,15);

        Shape[] shapes ={rectangle, square, triangle};
        for (Shape shape: shapes){
            System.out.println(shape.getClass().getSimpleName() +" = " + shape.calculateArea() );
        }
    }
}
