public class Rectangle extends Shape {
    private double length = 0.0;
    private double width = 0.0;

    public Rectangle(double length, double width, String name) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        double Area = 0.0;
        Area = this.length * this.width;
        return Area;
    }

    public double getPerimeter() {
        double Perimeter = 0.0;
        Perimeter = 2.0 * (this.length + this.width);
        return Perimeter;
    }

    public String getType() {
        double var10000 = this.getArea();
        return " (Area: " + var10000 + " Perimeter: " + this.getPerimeter() + ")";
    }
}