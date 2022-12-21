public class Circle
{
    private double r;
    private double x;
    private double y;

    public Circle(){}

    public Circle(double x, double y, double r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getR() {
        return r;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double circleSquare()
    {
        return r*r*Math.PI;
    }
    public double circleLen()
    {
        return 2*r*Math.PI;
    }

    public String compare(double r, double r1)
    {
        if (r == r1)
        {
            return "Окружности равны";
        }
        else
        {
            return "Окружности отличаются";
        }
    }
}