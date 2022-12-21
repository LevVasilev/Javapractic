public class Circle
{
    private Point point  = new Point();
    private double r;

    public Circle(Point point, double r)
    {
        this.point = point;
        this.r = r;
    }

    public Circle(){}

    public Point getPoint() {
        return point;
    }
    public double getR() {
        return r;
    }

    public void setPoint(Point point)
    {
        this.point = point;
    }
    public void setR(double r) {
        this.r = r;
    }

    public String toString()
    {
        return point.toString() + "; r = " + r;
    }
}