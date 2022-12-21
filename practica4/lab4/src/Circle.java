

public class Circle extends Shape {
    private double r;

    public Circle(double r, String name) {
        super(name);
        this.r = r;
    }

    public double getArea() {
        double Area = 0.0;
        Area = this.r * this.r * Math.PI;
        return Area;
    }

    public double getPerimeter() {
        double Perimeter = 0.0;
        Perimeter = 2.0 * this.r * Math.PI;
        return Perimeter;
    }

    public String getType() {
        double var10000 = this.getArea();
        return " (Area: " + var10000 + "  Perimeter: " + this.getPerimeter() + ")";
    }
}
