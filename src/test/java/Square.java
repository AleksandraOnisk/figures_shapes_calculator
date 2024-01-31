public class Square implements Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double squareArea() {
        return a * a;
    }

    @Override
    public double calculateArea() {
        return 4*a;
    }

}
