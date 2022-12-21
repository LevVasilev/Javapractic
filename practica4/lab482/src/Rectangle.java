public class Rectangle extends Shape {
    protected double length;
    protected double width;

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimiter() {
        return 2.0 * (this.width + this.length);
    }

    public String toString() {
        double var10000 = this.getArea();
        return "Rectangle: Area = " + var10000 + ";  Perimeter = " + this.getPerimiter();
    }
}
