public class Circle extends Shape {
    protected double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimiter() {
        return 6.283185307179586 * this.radius;
    }

    public String toString() {
        double var10000 = this.getRadius();
        return "Circle{ radius=" + var10000 + " perimeter=" + this.getPerimiter() + "}";
    }
}