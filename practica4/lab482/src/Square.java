public class Square extends Rectangle {
    protected double side;

    public Square(double side, String color, boolean filled) {
        super(color, filled, 0.0, 0.0);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public String toString() {
        double var10000 = this.getArea();
        return "Rectangle: Area = " + var10000 + "; Perimeter = " + this.getPerimiter();
    }
}
